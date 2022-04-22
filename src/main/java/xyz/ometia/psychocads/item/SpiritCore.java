package xyz.ometia.psychocads.item;

import static xyz.ometia.psychocads.PsychoCADs.MOD_ID;


import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;


import vazkii.psi.api.cad.EnumCADComponent;
import vazkii.psi.api.cad.EnumCADStat;

import vazkii.psi.api.cad.ICADComponent;






@Mod.EventBusSubscriber(modid = MOD_ID)
public class SpiritCore implements ICADComponent {

    @Override
    public EnumCADComponent getComponentType(ItemStack stack) {

        return EnumCADComponent.CORE;
    }

}
