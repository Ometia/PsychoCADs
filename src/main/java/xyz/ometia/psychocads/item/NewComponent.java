package xyz.ometia.psychocads.item;

import vazkii.psi.api.cad.EnumCADStat;
import vazkii.psi.api.cad.ICADComponent;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public abstract class NewComponent extends Item implements ICADComponent {
    private final HashMap<EnumCADStat, Integer> stats = new HashMap<>();

    public NewComponent() {
        super(new Properties().stacksTo(1));
    }

    public static void addStatToStack(ItemStack stack, EnumCADStat stat, int value) {
        ((NewComponent) stack.getItem()).addStat(stat, value);
    }


    protected void addStat(EnumCADStat stat, int value) {
        stats.put(stat, value);
    }

    @Override
    public int getCADStatValue(ItemStack stack, EnumCADStat stat) {
        return stats.getOrDefault(stat, 0);
    }
}
