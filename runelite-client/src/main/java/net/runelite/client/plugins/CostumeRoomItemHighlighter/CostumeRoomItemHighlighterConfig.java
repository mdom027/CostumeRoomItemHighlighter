package net.runelite.client.plugins.CostumeRoomItemHighlighter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
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
	@ConfigItem(
			position = 2,
			keyName = "HighlightArmorCaseItems",
			name = "Highlight Armor Case Items",
			description = "Highlight all items that can be stored in the Armor Case."
	)
	default boolean highlightArmorCaseItems()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "ArmorCaseType",
			name = "Armor Case Type",
			description = "Choose the type of Armor Case you have installed."
	)
	default ArmorCaseType armorCaseType()
	{
		return ArmorCaseType.OAK;
	}

	@ConfigItem(
			position = 4,
			keyName = "HighlightCapeRackItems",
			name = "Highlight Cape Rack Items",
			description = "Highlight all items that can be stored in the Cape Rack."
	)
	default boolean highlightCapeRackItems()
	{
		return true;
	}

	@ConfigItem(
			position = 5,
			keyName = "CapeRackType",
			name = "Cape Rack Type",
			description = "Choose the type of Cape Rack you have installed."
	)
	default CapeRackType capeRackType()
	{
		return CapeRackType.OAK;
	}

	@ConfigItem(
			position = 6,
			keyName = "HighlightFancyDressBoxItems",
			name = "Highlight Fancy Dress Box Items",
			description = "Highlight all items that can be stored in the Fancy Dress Box."
	)
	default boolean highlightFancyDressBoxItems()
	{
		return true;
	}

	@ConfigItem(
			position = 7,
			keyName = "FancyDressBoxType",
			name = "Fancy Dress Box Type",
			description = "Choose the type of Fancy Dress Box you have installed."
	)
	default FancyDressBoxType fancyDressBoxType()
	{
		return FancyDressBoxType.OAK;
	}

	@ConfigItem(
			position = 8,
			keyName = "HighlightMagicWardrobeItems",
			name = "Highlight Magic Wardrobe Items",
			description = "Highlight all items that can be stored in the Magic Wardrobe."
	)
	default boolean highlightMagicWardrobeItems()
	{
		return true;
	}

	@ConfigItem(
			position = 9,
			keyName = "MagicWardrobeType",
			name = "Magic Wardrobe Type",
			description = "Choose the type of Magic Wardrobe you have installed."
	)
	default MagicWardrobeType magicWardrobeType()
	{
		return MagicWardrobeType.OAK;
	}

	@ConfigItem(
			position = 10,
			keyName = "HighlightToyBoxItems",
			name = "Highlight Toy Box Items",
			description = "Highlight all items that can be stored in the Toy Box."
	)
	default boolean highlightToyBoxItems()
	{
		return true;
	}

	@ConfigItem(
			position = 11,
			keyName = "ToyBoxType",
			name = "Toy Box Type",
			description = "Choose the type of Toy Box you have installed."
	)
	default ToyBoxType ToyBoxType()
	{
		return ToyBoxType.OAK;
	}

	@ConfigItem(
			position = 12,
			keyName = "HighlightTreasureChestItems",
			name = "Highlight Treasure Chest Items",
			description = "Highlight all items that can be stored in the Treasure Chest."
	)
	default boolean highlightTreasureChestItems()
	{
		return true;
	}

	@ConfigItem(
			position = 13,
			keyName = "TreasureChestType",
			name = "Treasure Chest Type",
			description = "Choose the type of Treasure Chest you have installed."
	)
	default TreasureChestType treasureChestType()
	{
		return TreasureChestType.OAK;
	}
}
