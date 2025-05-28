package jamdoggie.swaymod.options;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Screen;
import net.minecraft.client.gui.options.ScreenOptions;
import net.minecraft.client.gui.options.components.BooleanOptionComponent;
import net.minecraft.client.gui.options.components.FloatOptionComponent;
import net.minecraft.client.gui.options.data.OptionsPage;
import net.minecraft.client.gui.options.data.OptionsPages;
import net.minecraft.client.option.GameSettings;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.util.GameStartEntrypoint;

public class ScreenOptionsPageSway implements GameStartEntrypoint
{
	public static GameSettings gameSettings = ((Minecraft) FabricLoader.getInstance().getGameInstance()).gameSettings;
	public static ISwayOptions swayOptions = (ISwayOptions) gameSettings;
	public static final OptionsPage SwayOptionsPage = OptionsPages.register(new OptionsPage("swaymod.options.title", Items.PAPER.getDefaultStack())
		.withComponent(new BooleanOptionComponent(swayOptions.enableSway()))
		.withComponent(new BooleanOptionComponent(swayOptions.enableVerticalBobSway()))
		.withComponent(new FloatOptionComponent(swayOptions.swayMultiplier())));

	public static ScreenOptions swayOptionsPage(Screen parent)
	{
		return new ScreenOptions(parent, SwayOptionsPage);
	}

	@Override
	public void beforeGameStart()
	{

	}

	@Override
	public void afterGameStart()
	{

	}
}
