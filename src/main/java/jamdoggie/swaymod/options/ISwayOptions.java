package jamdoggie.swaymod.options;

import net.minecraft.client.option.OptionBoolean;
import net.minecraft.client.option.OptionFloat;

public interface ISwayOptions
{
	public OptionBoolean enableSway();
	public OptionBoolean enableVerticalBobSway();
	public OptionFloat swayMultiplier();
}
