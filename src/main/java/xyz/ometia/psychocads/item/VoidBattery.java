package xyz.ometia.psychocads.item;

import static xyz.ometia.psychocads.PsychoCADs.MOD_ID;


import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;


import vazkii.psi.api.cad.EnumCADComponent;
import vazkii.psi.api.cad.EnumCADStat;

import vazkii.psi.api.cad.ICADComponent;


@Mod.EventBusSubscriber(modid = MOD_ID)
public class VoidBattery extends Item implements ICADComponent {

    private static final int VOID_BATTERY_OVERFLOW = 16000;

    public VoidBattery() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public EnumCADComponent getComponentType(ItemStack stack) {
        return EnumCADComponent.BATTERY;
    }

    @Override
    public int getCADStatValue(ItemStack stack, EnumCADStat stat) {
        if (stat == EnumCADStat.OVERFLOW){
            return VOID_BATTERY_OVERFLOW;
        }
        return 0;
    }
}




