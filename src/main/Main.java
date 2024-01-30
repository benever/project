package main;

import main.assembly.ComputerAssembly;
import main.component.*;

public class Main {
    public static void main(String[] args) {
        Component computerCase = new ComputerCase("LIAN LI Lancool",166,370,200,"Standard-ATX",2,3);
        Component caseFan = new CaseFan("LIAN LI ST120 White",100);
        Component motherboard = new Motherboard("ASRock B760 Pro RS","LGA 1700","Intel B760","Standard-ATX",3);
        Component videoCard = new VideoCard("MSI GeForce RTX 4060 Ti",3,8,160,307);
        Component cpu = new CPU("Intel Core i5-12400F","LGA 1700",2500,6,117);
        Component cpuFan = new CPUFan("ID-COOLING SE-226-XT ARGB SNOW","LGA 1700",154);
        Component powerUnit = new PowerUnit("Cougar GEC SNOW 650",650);
        Component ramFirst = new RAM("ADATA XPG Lancer Blade","ddr5",16,5600);
        Component ramSecond = new RAM("ADATA XPG Lancer Blade","ddr5",16,5600);
        Component hdd = new HDD("WD Blue","3.5",1000);
        Component ssd = new SSD("SATA", "2.5", 500);
        Component ssdM2 = new SSDM2("HP FX900 Pro",1024);

        ComputerAssembly gamePC = new ComputerAssembly(caseFan, computerCase, cpu, cpuFan, motherboard, powerUnit, ramFirst,ramSecond, hdd,ssd,ssdM2,videoCard);
        gamePC.printComponentInfo();
    }
}