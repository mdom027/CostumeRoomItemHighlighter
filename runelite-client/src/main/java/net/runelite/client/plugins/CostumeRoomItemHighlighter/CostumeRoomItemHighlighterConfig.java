package net.runelite.client.plugins.CostumeRoomItemHighlighter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.plugins.CostumeRoomItemHighlighter.Cases.*;

import java.awt.Color;

@ConfigGroup("CostumeRoomItemHighlighter")
public interface CostumeRoomItemHighlighterConfig extends Config
{
	@ConfigItem(
		position = 1,
		keyName = "highlightColor",
		name = "Highlight Color",
		description = "Choose the color to highlight Costume Room Items with."
	)
	default Color getDefaultColor()
	{
		return Color.cyan;
	}
	@ConfigSection(
			name = "Armor Case",
			description = "Armor Case Settings",
			position = 2
	)
	String armorCase = "armorCase";
	@ConfigItem(
			position = 3,
			keyName = "HighlightArmorCaseItems",
			name = "Highlight Armor Case Items",
			description = "Highlight all items that can be stored in the Armor Case."
	)
	default boolean highlightArmorCaseItems()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "ArmorCaseType",
			name = "Armor Case Type",
			description = "Choose the type of Armor Case you have installed.",
			section = armorCase
	)
	default ArmorCaseType armorCaseType()
	{
		return ArmorCaseType.OAK;
	}
	@ConfigSection(
			name = "Cape Rack",
			description = "Cape Rack Settings",
			position = 5
	)
	String capeRack = "capeRack";

	@ConfigItem(
			position = 6,
			keyName = "HighlightCapeRackItems",
			name = "Highlight Cape Rack Items",
			description = "Highlight all items that can be stored in the Cape Rack.",
			section = capeRack
	)
	default boolean highlightCapeRackItems()
	{
		return true;
	}

	@ConfigItem(
			position = 7,
			keyName = "CapeRackType",
			name = "Cape Rack Type",
			description = "Choose the type of Cape Rack you have installed.",
			section = capeRack
	)
	default CapeRackType capeRackType()
	{
		return CapeRackType.OAK;
	}
	@ConfigSection(
			name = "Fancy Dress Box",
			description = "Fancy Dress Box Settings",
			position = 8
	)
	String fancyDressBox = "fancyDressBox";

	@ConfigItem(
			position = 9,
			keyName = "HighlightFancyDressBoxItems",
			name = "Highlight Fancy Dress Box Items",
			description = "Highlight all items that can be stored in the Fancy Dress Box.",
			section = fancyDressBox
	)
	default boolean highlightFancyDressBoxItems()
	{
		return true;
	}

	@ConfigItem(
			position = 10,
			keyName = "FancyDressBoxType",
			name = "Fancy Dress Box Type",
			description = "Choose the type of Fancy Dress Box you have installed.",
			section = fancyDressBox
	)
	default FancyDressBoxType fancyDressBoxType()
	{
		return FancyDressBoxType.OAK;
	}
	@ConfigSection(
			name = "Magic Wardrobe",
			description = "Magic Wardrobe Settings",
			position = 11
	)
	String magicWardrobe = "magicWardrobe";

	@ConfigItem(
			position = 12,
			keyName = "HighlightMagicWardrobeItems",
			name = "Highlight Magic Wardrobe Items",
			description = "Highlight all items that can be stored in the Magic Wardrobe.",
			section = magicWardrobe
	)
	default boolean highlightMagicWardrobeItems()
	{
		return true;
	}

	@ConfigItem(
			position = 13,
			keyName = "MagicWardrobeType",
			name = "Magic Wardrobe Type",
			description = "Choose the type of Magic Wardrobe you have installed.",
			section = magicWardrobe
	)
	default MagicWardrobeType magicWardrobeType()
	{
		return MagicWardrobeType.OAK;
	}
	@ConfigSection(
			name = "Toy Box",
			description = "Toy Box Settings",
			position = 14
	)
	String toyBox = "toyBox";

	@ConfigItem(
			position = 15,
			keyName = "HighlightToyBoxItems",
			name = "Highlight Toy Box Items",
			description = "Highlight all items that can be stored in the Toy Box.",
			section = toyBox
	)
	default boolean highlightToyBoxItems()
	{
		return true;
	}

	@ConfigItem(
			position = 16,
			keyName = "ToyBoxType",
			name = "Toy Box Type",
			description = "Choose the type of Toy Box you have installed.",
			section = toyBox
	)
	default ToyBoxType ToyBoxType()
	{
		return ToyBoxType.OAK;
	}
	@ConfigSection(
			name = "Treasure Chest",
			description = "Treasure Chest Settings",
			position = 17
	)
	String treasureChest = "treasureChest";

	@ConfigItem(
			position = 18,
			keyName = "HighlightTreasureChestItems",
			name = "Highlight Treasure Chest Items",
			description = "Highlight all items that can be stored in the Treasure Chest.",
			section = treasureChest
	)
	default boolean highlightTreasureChestItems()
	{
		return true;
	}

	@ConfigItem(
			position = 19,
			keyName = "TreasureChestType",
			name = "Treasure Chest Type",
			description = "Choose the type of Treasure Chest you have installed.",
			section = treasureChest
	)
	default TreasureChestType treasureChestType()
	{
		return TreasureChestType.OAK;
	}
}
