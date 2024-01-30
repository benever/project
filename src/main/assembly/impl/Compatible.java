package main.assembly.impl;

import main.Main;
import main.component.*;

public interface Compatible {
    boolean isCompatible(Component... components);
}
