package xyz.ometia.psychocads.item;

import net.minecraftforge.fml.common.Mod;
import vazkii.psi.api.cad.EnumCADStat;
import vazkii.psi.api.cad.EnumCADComponent;

import vazkii.psi.api.cad.ICADComponent;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


import static xyz.ometia.psychocads.PsychoCADs.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class AbyssalCAD extends Item implements ICADComponent{

    public AbyssalCAD() {
        super(new Properties().stacksTo(1));
    }

    private static final int ABYSSAL_CAD_EFFICIENCY = 100;
    private static final int ABYSSAL_CAD_POTENCY = 640;

    @Override
    public EnumCADComponent getComponentType(ItemStack stack) {
        return EnumCADComponent.ASSEMBLY;
    }

    @Override
    public int getCADStatValue(ItemStack stack, EnumCADStat stat) {
        if (stat == EnumCADStat.EFFICIENCY)
            return ABYSSAL_CAD_EFFICIENCY;
        if (stat == EnumCADStat.POTENCY)
            return ABYSSAL_CAD_POTENCY;
        return 0;
    }

}
