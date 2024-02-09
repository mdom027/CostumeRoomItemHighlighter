package net.runelite.client.plugins.CostumeRoomItemHighlighter;

import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.CostumeRoomItemHighlighter.Cases.*;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

import javax.inject.Inject;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CostumeRoomItemHighlightOverlay extends WidgetItemOverlay {
	private final ItemManager itemMan;
	private final CostumeRoomItemHighlighterConfig config;
	private final ArmorCase armorCase;
	private final CapeRack capeRack;
	private final FancyDressBox fancyDressBox;
	private final MagicWardrobe magicWardrobe;
	private final ToyBox toyBox;
	private final TreasureChest treasureChest;

	@Inject
	private CostumeRoomItemHighlightOverlay(ItemManager itemMan, CostumeRoomItemHighlighterConfig config) {
		this.itemMan = itemMan;
		this.config = config;
		this.armorCase = new ArmorCase();
		this.capeRack = new CapeRack();
		this.fancyDressBox = new FancyDressBox();
		this.magicWardrobe = new MagicWardrobe();
		this.toyBox = new ToyBox();
		this.treasureChest = new TreasureChest();
		showOnBank();
	}

	@Override
	public void renderItemOverlay(Graphics2D graphics, int itemID, WidgetItem itemWidget)
	{
		Color highlightColor = config.getDefaultColor();
		if(checkStorability(itemID))
		{
			Rectangle bounds = itemWidget.getCanvasBounds();
			final BufferedImage outline = itemMan.getItemOutline(itemID, itemWidget.getQuantity(), highlightColor);
			graphics.drawImage(outline, (int) bounds.getX(), (int) bounds.getY(), null);
		}
	}

	private boolean checkStorability(int itemID) {
		if(config.highlightArmorCaseItems() && armorCase.checkHash(itemID)) return true;
		if(config.highlightCapeRackItems() && capeRack.checkHash(itemID)) return true;
		if(config.highlightFancyDressBoxItems() && fancyDressBox.checkHash(itemID)) return true;
		if(config.highlightMagicWardrobeItems() && magicWardrobe.checkHash(itemID)) return true;
		if(config.highlightToyBoxItems() && toyBox.checkHash(itemID)) return true;
		if(config.highlightTreasureChestItems() && treasureChest.checkHash(itemID)) return true;
		return false;
	}
}
