import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.CostumeRoomItemHighlighter.CostumeRoomItemHighlighterPlugin;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CostumeRoomItemHighlighterPlugin.class);
		RuneLite.main(args);
	}
}