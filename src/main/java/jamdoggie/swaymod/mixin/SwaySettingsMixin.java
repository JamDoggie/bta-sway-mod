package jamdoggie.swaymod.mixin;

import jamdoggie.swaymod.options.ISwayOptions;
import net.minecraft.client.Minecraft;
import net.minecraft.client.option.GameSettings;
import net.minecraft.client.option.Option;
import net.minecraft.client.option.OptionBoolean;
import net.minecraft.client.option.OptionFloat;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = GameSettings.class, remap = false)
public class SwaySettingsMixin implements ISwayOptions
{
	@Shadow
	@Final
	public Minecraft mc;

	private final GameSettings mixinInst = (GameSettings) ((Object)this);

	@Unique
	public OptionBoolean enableSway = new OptionBoolean(mixinInst, "swaymod.options.enableSway", true);
	@Unique
	public OptionBoolean enableVerticalBobSway = new OptionBoolean(mixinInst, "swaymod.options.enableVerticalBobSway", true);
	@Unique
	public OptionFloat swayMultiplier = new OptionFloat(mixinInst, "swaymod.options.swayMultiplier", 0.2f);

	@Inject(method = "getDisplayString(Lnet/minecraft/client/option/Option;)Ljava/lang/String;", at = @At("HEAD"), cancellable = true)
	private void displayString(Option<?> option, CallbackInfoReturnable<String> cir){
		if (option == swayMultiplier)
		{
			cir.setReturnValue((int)(swayMultiplier.value * 500) + "%");
		}
	}

	@Override
	public OptionBoolean enableSway()
	{
		return enableSway;
	}

	@Override
	public OptionBoolean enableVerticalBobSway()
	{
		return enableVerticalBobSway;
	}

	@Override
	public OptionFloat swayMultiplier()
	{
		return swayMultiplier;
	}
}
