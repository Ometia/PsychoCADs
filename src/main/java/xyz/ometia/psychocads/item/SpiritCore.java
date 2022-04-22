package xyz.ometia.psychocads.item;

import static xyz.ometia.psychocads.PsychoCADs.MOD_ID;


import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;


import vazkii.psi.api.cad.EnumCADComponent;
import vazkii.psi.api.cad.EnumCADStat;

import vazkii.psi.api.cad.ICADComponent;




@Mod.EventBusSubscriber(modid = MOD_ID)
public class SpiritCore extends Item implements ICADComponent {

    private static final int SPIRIT_CORE_COMPLEXITY = 81;
    private static final int SPIRIT_CORE_PROJECTION = 10;

    public SpiritCore() {
        super(new Properties().stacksTo(1));
    }

    @Override
    public EnumCADComponent getComponentType(ItemStack stack) {
        return EnumCADComponent.CORE;
    }

    @Override
    public int getCADStatValue(ItemStack stack, EnumCADStat stat) {
        if (stat == EnumCADStat.COMPLEXITY)
            return SPIRIT_CORE_COMPLEXITY;
        if (stat == EnumCADStat.PROJECTION)
            return SPIRIT_CORE_PROJECTION;
        return 0;
    }
}
