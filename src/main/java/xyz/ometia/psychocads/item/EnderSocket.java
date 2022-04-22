package xyz.ometia.psychocads.item;

import static xyz.ometia.psychocads.PsychoCADs.MOD_ID;


import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;


import vazkii.psi.api.cad.EnumCADComponent;
import vazkii.psi.api.cad.EnumCADStat;

import vazkii.psi.api.cad.ICADComponent;


@Mod.EventBusSubscriber(modid = MOD_ID)
public class EnderSocket extends Item implements ICADComponent {

    private static final int ENDER_SOCKET_BANDWIDTH = 10;
    private static final int ENDER_SOCKET_SOCKETS = 12;
    private static final int ENDER_SOCKET_SAVED_VECTORS = 21;

    public EnderSocket() {
        super(new Properties().stacksTo(1));
    }

    @Override
    public EnumCADComponent getComponentType(ItemStack stack) {
        return EnumCADComponent.SOCKET;
    }


    @Override
    public int getCADStatValue(ItemStack stack, EnumCADStat stat) {
        if (stat == EnumCADStat.BANDWIDTH) {
            return ENDER_SOCKET_BANDWIDTH;
        }

        if (stat == EnumCADStat.SOCKETS) {
            return ENDER_SOCKET_SOCKETS;
        }

        if (stat == EnumCADStat.SAVED_VECTORS) {
            return ENDER_SOCKET_SAVED_VECTORS;
        }
        return 0;
        }
}


