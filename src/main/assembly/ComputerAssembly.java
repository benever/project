package main.assembly;

import main.assembly.impl.Compatible;
import main.assembly.impl.Printable;
import main.component.*;

import java.util.ArrayList;
import java.util.List;

public class ComputerAssembly implements Compatible, Printable {


    private List<Component> components;

    public ComputerAssembly(Component... components) {
        if(isCompatible(components)) {
            this.components = List.of(components);
            System.out.println("Компоненты совместимы");
        }
        else {
            throw new IllegalArgumentException("Компоненты несовместимы");
        }
    }

    @Override
    public boolean isCompatible(Component... components) {
        int indexCaseFan = 0, indexComputerCase = 0, indexCPU = 0, indexCPUFan = 0, indexMotherboard = 0,
                indexPowerUnit = 0, indexVideoCard = 0;
        int numberOfCaseFan = 0, numberOfComputerCase = 0, numberOfCPU = 0, numberOfCPUFan = 0, numberOfHDD = 0, numberOfSSDM2 = 0,
                numberOfMotherboard = 0, numberOfPowerUnit = 0, numberOfRAM = 0, numberOfSSD = 0, numberOfVideoCard = 0;
        List<Integer> indexRAM = new ArrayList<>(), indexHDD = new ArrayList<>(), indexSSD = new ArrayList<>(),
                indexSSDM2 = new ArrayList<>();

        for (int i = 0; i < components.length; i++) {
            if(components[i] instanceof CaseFan){
                indexCaseFan = i;
                numberOfCaseFan++;
            }
            else if(components[i] instanceof ComputerCase){
                indexComputerCase = i;
                numberOfComputerCase++;
            }
            else if(components[i] instanceof CPU){
                indexCPU = i;
                numberOfCPU++;
            }
            else if(components[i] instanceof CPUFan){
                indexCPUFan = i;
                numberOfCPUFan++;
            }
            else if(components[i] instanceof HDD){
                indexHDD.add(i);
                numberOfHDD++;
            }
            else if(components[i] instanceof Motherboard){
                indexMotherboard = i;
                numberOfMotherboard++;
            }
            else if(components[i] instanceof PowerUnit){
                indexPowerUnit = i;
                numberOfPowerUnit++;
            }
            else if(components[i] instanceof RAM){
                indexRAM.add(i);
                numberOfRAM++;
            }
            else if(components[i] instanceof SSD){
                indexSSD.add(i);
                numberOfSSD++;
            }
            else if(components[i] instanceof SSDM2){
                indexSSDM2.add(i);
                numberOfSSDM2++;
            }
            else if(components[i] instanceof VideoCard){
                indexVideoCard = i;
                numberOfVideoCard++;
            }
        }

        ComputerCase computerCase = (ComputerCase) components[indexComputerCase];
        CaseFan caseFan = (CaseFan) components[indexCaseFan];
        CPU cpu = (CPU) components[indexCPU];
        CPUFan cpuFan = (CPUFan) components[indexCPUFan];
        Motherboard motherboard = (Motherboard) components[indexMotherboard];
        VideoCard videoCard = (VideoCard) components[indexVideoCard];
        PowerUnit powerUnit = (PowerUnit) components[indexPowerUnit];
        List<RAM> rams = new ArrayList<>();
        for (int i:indexRAM) {
            rams.add((RAM)components[i]);
        }
        List<HDD> hdds = new ArrayList<>();
        for (int i:indexHDD) {
            hdds.add((HDD)components[i]);
        }
        List<SSD> ssds = new ArrayList<>();
        for (int i:indexSSD) {
            ssds.add((SSD)components[i]);
        }
        List<SSDM2> ssdM2s = new ArrayList<>();
        for (int i:indexSSDM2) {
            ssdM2s.add((SSDM2)components[i]);
        }

        if(caseFan.getSize()<=computerCase.getMaxSizeCaseFan() &&
                cpu.getSocket().equals(motherboard.getSocket()) &&
                cpuFan.getSocket().equals(motherboard.getSocket()) &&
                cpuFan.getSize()<=computerCase.getMaxSizeCPUFan() &&
                motherboard.getFormFactor().equals(computerCase.getFormFactorMotherboard()) &&
                rams.size()<=4 &&
                computerCase.getNumberOfCompartmentsForHDD() >= hdds.size() &&
                computerCase.getNumberOfCompartmentsForSSD() >= ssds.size() &&
                motherboard.getNumberOfCompartmentsForM2() >= ssdM2s.size() &&
                videoCard.getSize() <= computerCase.getMaxSizeVideoCard() &&
                powerUnit.getWattage() >= (videoCard.getWatt()+cpu.getWatt()+100)*1.5 &&
                numberOfCaseFan*numberOfComputerCase*numberOfCPU*numberOfCPUFan*numberOfMotherboard*
                        numberOfPowerUnit*numberOfVideoCard == 1) { return true; }
        else { return false; }
    }

    @Override
    public void printComponentInfo() {
        for (Component component:this.components) {
            component.printInfo();
        }
    }
}