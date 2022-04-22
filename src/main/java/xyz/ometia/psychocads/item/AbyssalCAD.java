package xyz.ometia.psychocads.item;

import net.minecraftforge.fml.common.Mod;
import vazkii.psi.api.cad.*;
import xyz.ometia.psychocads.PsychoCADs;
import java.util.List;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import vazkii.psi.api.PsiAPI;

import static xyz.ometia.psychocads.PsychoCADs.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class abyssalCAD extends Item implements ICADComponent, ICADAssembly {

    @Override
    public EnumCADComponent getComponentType(ItemStack stack) {
        return EnumCADComponent.ASSEMBLY;
    }


}
