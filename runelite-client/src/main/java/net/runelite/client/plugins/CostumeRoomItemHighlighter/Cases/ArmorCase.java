package net.runelite.client.plugins.CostumeRoomItemHighlighter.Cases;

import net.runelite.api.ItemID;

import java.util.HashSet;

public class ArmorCase {
	private final HashSet<Integer> ArmorCaseHash;

	public ArmorCase() {
		this.ArmorCaseHash = new HashSet<>();

		this.ArmorCaseHash.add(ItemID.ADVENTURERS_HOOD_T1);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_TOP_T1);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_TROUSERS_T1);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_BOOTS_T1);

		this.ArmorCaseHash.add(ItemID.ADVENTURERS_HOOD_T2);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_TOP_T2);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_TROUSERS_T2);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_BOOTS_T2);

		this.ArmorCaseHash.add(ItemID.ADVENTURERS_HOOD_T3);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_TOP_T3);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_TROUSERS_T3);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_BOOTS_T3);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_VAMBRACES);
		this.ArmorCaseHash.add(ItemID.ADVENTURERS_CAPE);

		this.ArmorCaseHash.add(ItemID.ANGLER_HAT);
		this.ArmorCaseHash.add(ItemID.ANGLER_TOP);
		this.ArmorCaseHash.add(ItemID.ANGLER_WADERS);
		this.ArmorCaseHash.add(ItemID.ANGLER_BOOTS);

		this.ArmorCaseHash.add(ItemID.SPIRIT_ANGLER_HEADBAND);
		this.ArmorCaseHash.add(ItemID.SPIRIT_ANGLER_TOP);
		this.ArmorCaseHash.add(ItemID.SPIRIT_ANGLER_WADERS);
		this.ArmorCaseHash.add(ItemID.SPIRIT_ANGLER_BOOTS);

		this.ArmorCaseHash.add(ItemID.ARDOUGNE_KNIGHT_HELM);
		this.ArmorCaseHash.add(ItemID.ARDOUGNE_KNIGHT_PLATEBODY);
		this.ArmorCaseHash.add(ItemID.ARDOUGNE_KNIGHT_PLATELEGS);

		this.ArmorCaseHash.add(ItemID.BOMBER_CAP);
		this.ArmorCaseHash.add(ItemID.CAP_AND_GOGGLES);
		this.ArmorCaseHash.add(ItemID.BOMBER_JACKET);

		this.ArmorCaseHash.add(ItemID.HARD_HAT);
		this.ArmorCaseHash.add(ItemID.BUILDERS_SHIRT);
		this.ArmorCaseHash.add(ItemID.BUILDERS_TROUSERS);
		this.ArmorCaseHash.add(ItemID.BUILDERS_BOOTS);

		this.ArmorCaseHash.add(ItemID.DESERT_CAMO_TOP);
		this.ArmorCaseHash.add(ItemID.DESERT_CAMO_LEGS);

		this.ArmorCaseHash.add(ItemID.JUNGLE_CAMO_TOP);
		this.ArmorCaseHash.add(ItemID.JUNGLE_CAMO_LEGS);

		this.ArmorCaseHash.add(ItemID.POLAR_CAMO_TOP);
		this.ArmorCaseHash.add(ItemID.POLAR_CAMO_LEGS);

		this.ArmorCaseHash.add(ItemID.WOOD_CAMO_TOP);
		this.ArmorCaseHash.add(ItemID.WOOD_CAMO_LEGS);

		this.ArmorCaseHash.add(ItemID.SHATTERED_CANE);

		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_CANE);

		this.ArmorCaseHash.add(ItemID.TWISTED_CANE);

		this.ArmorCaseHash.add(ItemID.DECORATIVE_HELM); // Red and blue med helm
		this.ArmorCaseHash.add(ItemID.DECORATIVE_FULL_HELM); // Red and blue full helm
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR); // Red and blue platebody
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11893); // Red and blue plateskirt
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_4070); // Red and blue platelegs
		this.ArmorCaseHash.add(ItemID.DECORATIVE_SHIELD); // Red and blue kiteshield
		this.ArmorCaseHash.add(ItemID.DECORATIVE_BOOTS); // Red and blue boots

		this.ArmorCaseHash.add(ItemID.DECORATIVE_HELM_4506); // White and blue med helm
		this.ArmorCaseHash.add(ItemID.DECORATIVE_FULL_HELM_25169); // White and blue full helm
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_4504); // White and blue platebody
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11894); // White and blue plateskirt
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_4505); // White and blue platelegs
		this.ArmorCaseHash.add(ItemID.DECORATIVE_SHIELD_4507); // White and blue kiteshield
		this.ArmorCaseHash.add(ItemID.DECORATIVE_BOOTS_25167); // White and blue boots

		this.ArmorCaseHash.add(ItemID.DECORATIVE_HELM_4511); // Gold and black med helm (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_HELM_BROKEN); // Gold and black med helm (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_HELM_L); // Gold and black med helm (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_FULL_HELM_25174); // Gold and black full helm (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_FULL_HELM_BROKEN); // Gold and black full helm (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_FULL_HELM_L); // Gold and black full helm (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_4509); // Gold and black platebody (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN); // Gold and black platebody (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L); // Gold and black platebody (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11895); // Gold and black plateskirt (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN_20493); // Gold and black plateskirt (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L_24162); // Gold and black plateskirt (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_4510); // Gold and black platelegs (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN_20487); // Gold and black platelegs (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L_24159); // Gold and black platelegs (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_SHIELD_4512); // Gold and black kiteshield (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_SHIELD_BROKEN); // Gold and black kiteshield (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_SHIELD_L); // Gold and black kiteshield (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_BOOTS_25171); // Gold and black boots (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_BOOTS_BROKEN); // Gold and black boots (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_BOOTS_L); // Gold and black boots (locked)

		this.ArmorCaseHash.add(ItemID.DECORATIVE_SWORD); // Red and blue sword

		this.ArmorCaseHash.add(ItemID.DECORATIVE_SWORD_4503); // White and blue sword

		this.ArmorCaseHash.add(ItemID.DECORATIVE_SWORD_4508); // Gold and black sword (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_SWORD_BROKEN); // Gold and black sword (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_SWORD_L); // Gold and black sword (locked)

		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11898); // Decorative Magic Hat (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN_20499); // Decorative Magic Hat (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L_24165); // Decorative Magic Hat (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11896); // Decorative Magic Top (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN_20495); // Decorative Magic Top (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L_24163); // Decorative Magic Top (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11897); // Decorative Magic Legs (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN_20497); // Decorative Magic Legs (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L_24164); // Decorative Magic Legs (locked)

		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11899); // Decorative Ranged Top (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN_20501); // Decorative Ranged Top (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L_24166); // Decorative Ranged Top (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11900); // Decorative Ranged Legs (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN_20503); // Decorative Ranged Legs (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L_24167); // Decorative Ranged Legs (locked)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_11901); // Decorative Quiver (normal)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_BROKEN_20505); // Decorative Quiver (broken)
		this.ArmorCaseHash.add(ItemID.DECORATIVE_ARMOUR_L_24168); // Decorative Quiver (locked)

		this.ArmorCaseHash.add(ItemID.CLUE_HUNTER_GARB);
		this.ArmorCaseHash.add(ItemID.CLUE_HUNTER_TROUSERS);
		this.ArmorCaseHash.add(ItemID.CLUE_HUNTER_CLOAK);
		this.ArmorCaseHash.add(ItemID.CLUE_HUNTER_GLOVES);
		this.ArmorCaseHash.add(ItemID.CLUE_HUNTER_BOOTS);

		this.ArmorCaseHash.add(ItemID.CORRUPTED_HELM);
		this.ArmorCaseHash.add(ItemID.CORRUPTED_PLATEBODY);
		this.ArmorCaseHash.add(ItemID.CORRUPTED_PLATESKIRT);
		this.ArmorCaseHash.add(ItemID.CORRUPTED_PLATELEGS);
		this.ArmorCaseHash.add(ItemID.CORRUPTED_KITESHIELD);

		this.ArmorCaseHash.add(ItemID.DEADMANS_CHEST);
		this.ArmorCaseHash.add(ItemID.DEADMANS_LEGS);
		this.ArmorCaseHash.add(ItemID.DEADMANS_CAPE);

		this.ArmorCaseHash.add(ItemID.DRAGONSTONE_FULL_HELM);
		this.ArmorCaseHash.add(ItemID.DRAGONSTONE_PLATEBODY);
		this.ArmorCaseHash.add(ItemID.DRAGONSTONE_PLATELEGS);
		this.ArmorCaseHash.add(ItemID.DRAGONSTONE_GAUNTLETS);
		this.ArmorCaseHash.add(ItemID.DRAGONSTONE_BOOTS);

		this.ArmorCaseHash.add(ItemID.FARMERS_STRAWHAT); // Male Strawhat
		this.ArmorCaseHash.add(ItemID.FARMERS_STRAWHAT_13647); // Female Strawhat
		this.ArmorCaseHash.add(ItemID.FARMERS_JACKET); // Male top
		this.ArmorCaseHash.add(ItemID.FARMERS_SHIRT); // Female top
		this.ArmorCaseHash.add(ItemID.FARMERS_BORO_TROUSERS); // Male bottom
		this.ArmorCaseHash.add(ItemID.FARMERS_BORO_TROUSERS_13641); // Female bottom
		this.ArmorCaseHash.add(ItemID.FARMERS_BOOTS); // Male boots
		this.ArmorCaseHash.add(ItemID.FARMERS_BOOTS_13645); // Female boots

		this.ArmorCaseHash.add(ItemID.FEDORA);

		this.ArmorCaseHash.add(ItemID.GIANT_STOPWATCH);

		this.ArmorCaseHash.add(ItemID.HAM_HOOD);
		this.ArmorCaseHash.add(ItemID.HAM_SHIRT);
		this.ArmorCaseHash.add(ItemID.HAM_ROBE);
		this.ArmorCaseHash.add(ItemID.HAM_GLOVES);
		this.ArmorCaseHash.add(ItemID.HAM_BOOTS);
		this.ArmorCaseHash.add(ItemID.HAM_CLOAK);
		this.ArmorCaseHash.add(ItemID.HAM_LOGO);

		this.ArmorCaseHash.add(ItemID.ANCIENT_HALO);

		this.ArmorCaseHash.add(ItemID.ARMADYL_HALO);

		this.ArmorCaseHash.add(ItemID.BANDOS_HALO);

		this.ArmorCaseHash.add(ItemID.BRASSICA_HALO);

		this.ArmorCaseHash.add(ItemID.GUTHIX_HALO);

		this.ArmorCaseHash.add(ItemID.SARADOMIN_HALO);

		this.ArmorCaseHash.add(ItemID.SEREN_HALO);

		this.ArmorCaseHash.add(ItemID.ZAMORAK_HALO);

		this.ArmorCaseHash.add(ItemID.HELM_OF_RAEDWALD);

		this.ArmorCaseHash.add(ItemID.GRAAHK_HEADDRESS);
		this.ArmorCaseHash.add(ItemID.GRAAHK_TOP);
		this.ArmorCaseHash.add(ItemID.GRAAHK_LEGS);

		this.ArmorCaseHash.add(ItemID.KYATT_HAT);
		this.ArmorCaseHash.add(ItemID.KYATT_TOP);
		this.ArmorCaseHash.add(ItemID.KYATT_LEGS);

		this.ArmorCaseHash.add(ItemID.LARUPIA_HAT);
		this.ArmorCaseHash.add(ItemID.LARUPIA_TOP);
		this.ArmorCaseHash.add(ItemID.LARUPIA_LEGS);

		this.ArmorCaseHash.add(ItemID.INQUISITORS_GREAT_HELM);
		this.ArmorCaseHash.add(ItemID.INQUISITORS_HAUBERK);
		this.ArmorCaseHash.add(ItemID.INQUISITORS_PLATESKIRT);

		this.ArmorCaseHash.add(ItemID.JUSTICIAR_FACEGUARD);
		this.ArmorCaseHash.add(ItemID.JUSTICIAR_CHESTGUARD);
		this.ArmorCaseHash.add(ItemID.JUSTICIAR_LEGGUARDS);

		this.ArmorCaseHash.add(ItemID.LUMBERJACK_HAT);
		this.ArmorCaseHash.add(ItemID.LUMBERJACK_TOP);
		this.ArmorCaseHash.add(ItemID.LUMBERJACK_LEGS);
		this.ArmorCaseHash.add(ItemID.LUMBERJACK_BOOTS);

		this.ArmorCaseHash.add(ItemID.FORESTRY_HAT);
		this.ArmorCaseHash.add(ItemID.FORESTRY_TOP);
		this.ArmorCaseHash.add(ItemID.FORESTRY_LEGS);
		this.ArmorCaseHash.add(ItemID.FORESTRY_BOOTS);

		this.ArmorCaseHash.add(ItemID.MASORI_MASK);
		this.ArmorCaseHash.add(ItemID.MASORI_BODY);
		this.ArmorCaseHash.add(ItemID.MASORI_CHAPS);

		this.ArmorCaseHash.add(ItemID.MASORI_MASK_F);
		this.ArmorCaseHash.add(ItemID.MASORI_BODY_F);
		this.ArmorCaseHash.add(ItemID.MASORI_CHAPS_F);

		this.ArmorCaseHash.add(ItemID.MINING_GLOVES);
		this.ArmorCaseHash.add(ItemID.SUPERIOR_MINING_GLOVES);
		this.ArmorCaseHash.add(ItemID.EXPERT_MINING_GLOVES);

		this.ArmorCaseHash.add(ItemID.GAS_MASK);
		this.ArmorCaseHash.add(ItemID.MOURNER_TOP);
		this.ArmorCaseHash.add(ItemID.MOURNER_TROUSERS);
		this.ArmorCaseHash.add(ItemID.MOURNER_GLOVES);
		this.ArmorCaseHash.add(ItemID.MOURNER_BOOTS);
		this.ArmorCaseHash.add(ItemID.MOURNER_CLOAK);

		this.ArmorCaseHash.add(ItemID.OBSIDIAN_HELMET);
		this.ArmorCaseHash.add(ItemID.OBSIDIAN_PLATEBODY);
		this.ArmorCaseHash.add(ItemID.OBSIDIAN_PLATELEGS);

		this.ArmorCaseHash.add(ItemID.ORNATE_HELM);
		this.ArmorCaseHash.add(ItemID.ORNATE_TOP);
		this.ArmorCaseHash.add(ItemID.ORNATE_LEGS);
		this.ArmorCaseHash.add(ItemID.ORNATE_GLOVES);
		this.ArmorCaseHash.add(ItemID.ORNATE_BOOTS);
		this.ArmorCaseHash.add(ItemID.ORNATE_CAPE);

		this.ArmorCaseHash.add(ItemID.FIGHTER_HAT);

		this.ArmorCaseHash.add(ItemID.FIGHTER_TORSO);

		this.ArmorCaseHash.add(ItemID.PENANCE_GLOVES);

		this.ArmorCaseHash.add(ItemID.HEALER_HAT);

		this.ArmorCaseHash.add(ItemID.RANGER_HAT);

		this.ArmorCaseHash.add(ItemID.RUNNER_BOOTS);

		this.ArmorCaseHash.add(ItemID.RUNNER_HAT);

		this.ArmorCaseHash.add(ItemID.PENANCE_SKIRT);

		this.ArmorCaseHash.add(ItemID.PROSPECTOR_HELMET);
		this.ArmorCaseHash.add(ItemID.PROSPECTOR_JACKET);
		this.ArmorCaseHash.add(ItemID.PROSPECTOR_LEGS);
		this.ArmorCaseHash.add(ItemID.PROSPECTOR_BOOTS);

		this.ArmorCaseHash.add(ItemID.GOLDEN_PROSPECTOR_HELMET);
		this.ArmorCaseHash.add(ItemID.GOLDEN_PROSPECTOR_JACKET);
		this.ArmorCaseHash.add(ItemID.GOLDEN_PROSPECTOR_LEGS);
		this.ArmorCaseHash.add(ItemID.GOLDEN_PROSPECTOR_BOOTS);

		this.ArmorCaseHash.add(ItemID.ROCKSHELL_HELM);
		this.ArmorCaseHash.add(ItemID.ROCKSHELL_PLATE);
		this.ArmorCaseHash.add(ItemID.ROCKSHELL_LEGS);
		this.ArmorCaseHash.add(ItemID.ROCKSHELL_GLOVES);
		this.ArmorCaseHash.add(ItemID.ROCKSHELL_BOOTS);

		this.ArmorCaseHash.add(ItemID.ROGUE_MASK);
		this.ArmorCaseHash.add(ItemID.ROGUE_TOP);
		this.ArmorCaseHash.add(ItemID.ROGUE_TROUSERS);
		this.ArmorCaseHash.add(ItemID.ROGUE_GLOVES);
		this.ArmorCaseHash.add(ItemID.ROGUE_BOOTS);

		this.ArmorCaseHash.add(ItemID.SHATTERED_HOOD_T1);
		this.ArmorCaseHash.add(ItemID.SHATTERED_TOP_T1);
		this.ArmorCaseHash.add(ItemID.SHATTERED_TROUSERS_T1);
		this.ArmorCaseHash.add(ItemID.SHATTERED_BOOTS_T1);

		this.ArmorCaseHash.add(ItemID.SHATTERED_HOOD_T2);
		this.ArmorCaseHash.add(ItemID.SHATTERED_TOP_T2);
		this.ArmorCaseHash.add(ItemID.SHATTERED_TROUSERS_T2);
		this.ArmorCaseHash.add(ItemID.SHATTERED_BOOTS_T2);

		this.ArmorCaseHash.add(ItemID.SHATTERED_HOOD_T3);
		this.ArmorCaseHash.add(ItemID.SHATTERED_TOP_T3);
		this.ArmorCaseHash.add(ItemID.SHATTERED_TROUSERS_T3);
		this.ArmorCaseHash.add(ItemID.SHATTERED_BOOTS_T3);

		this.ArmorCaseHash.add(ItemID.SHAYZIEN_HELM_1);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_PLATEBODY_1);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GREAVES_1);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GLOVES_1);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_BOOTS_1);

		this.ArmorCaseHash.add(ItemID.SHAYZIEN_HELM_2);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_PLATEBODY_2);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GREAVES_2);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GLOVES_2);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_BOOTS_2);

		this.ArmorCaseHash.add(ItemID.SHAYZIEN_HELM_3);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_PLATEBODY_3);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GREAVES_3);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GLOVES_3);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_BOOTS_3);

		this.ArmorCaseHash.add(ItemID.SHAYZIEN_HELM_4);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_PLATEBODY_4);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GREAVES_4);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GLOVES_4);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_BOOTS_4);

		this.ArmorCaseHash.add(ItemID.SHAYZIEN_HELM_5);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_BODY_5);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GREAVES_5);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_GLOVES_5);
		this.ArmorCaseHash.add(ItemID.SHAYZIEN_BOOTS_5);

		this.ArmorCaseHash.add(ItemID.SNAKESKIN_BANDANA);
		this.ArmorCaseHash.add(ItemID.SNAKESKIN_BODY);
		this.ArmorCaseHash.add(ItemID.SNAKESKIN_CHAPS);
		this.ArmorCaseHash.add(ItemID.SNAKESKIN_VAMBRACES);
		this.ArmorCaseHash.add(ItemID.SNAKESKIN_BOOTS);

		this.ArmorCaseHash.add(ItemID.SPINED_HELM);
		this.ArmorCaseHash.add(ItemID.SPINED_BODY);
		this.ArmorCaseHash.add(ItemID.SPINED_CHAPS);
		this.ArmorCaseHash.add(ItemID.SPINED_GLOVES);
		this.ArmorCaseHash.add(ItemID.SPINED_BOOTS);

		this.ArmorCaseHash.add(ItemID.FANCY_BOOTS);
		this.ArmorCaseHash.add(ItemID.FIGHTING_BOOTS);
		this.ArmorCaseHash.add(ItemID.FANCIER_BOOTS);

		this.ArmorCaseHash.add(ItemID.SWIFT_BLADE);

		this.ArmorCaseHash.add(ItemID.INITIATE_SALLET);
		this.ArmorCaseHash.add(ItemID.INITIATE_HAUBERK);
		this.ArmorCaseHash.add(ItemID.INITIATE_CUISSE);

		this.ArmorCaseHash.add(ItemID.PROSELYTE_SALLET);
		this.ArmorCaseHash.add(ItemID.PROSELYTE_HAUBERK);
		this.ArmorCaseHash.add(ItemID.PROSELYTE_TASSET);
		this.ArmorCaseHash.add(ItemID.PROSELYTE_CUISSE);

		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_TORCH);

		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_HOOD_T1);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_TOP_T1);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_TROUSERS_T1);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_BOOTS_T1);

		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_HOOD_T2);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_TOP_T2);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_TROUSERS_T2);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_BOOTS_T2);

		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_HOOD_T3);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_TOP_T3);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_TROUSERS_T3);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_BOOTS_T3);

		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_HEADBAND_T1);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_TOP_T1);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_TROUSERS_T1);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_BOOTS_T1);

		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_HEADBAND_T2);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_TOP_T2);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_TROUSERS_T2);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_BOOTS_T2);

		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_HEADBAND_T3);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_TOP_T3);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_TROUSERS_T3);
		this.ArmorCaseHash.add(ItemID.TRAILBLAZER_RELOADED_BOOTS_T3);

		this.ArmorCaseHash.add(ItemID.TRIBAL_MASK_6339); // Combat tribal mask

		this.ArmorCaseHash.add(ItemID.TRIBAL_MASK_6337); // Disease tribal mask

		this.ArmorCaseHash.add(ItemID.TRIBAL_MASK); // Poison tribal mask

		this.ArmorCaseHash.add(ItemID.TWISTED_HAT_T1);
		this.ArmorCaseHash.add(ItemID.TWISTED_COAT_T1);
		this.ArmorCaseHash.add(ItemID.TWISTED_TROUSERS_T1);
		this.ArmorCaseHash.add(ItemID.TWISTED_BOOTS_T1);

		this.ArmorCaseHash.add(ItemID.TWISTED_HAT_T2);
		this.ArmorCaseHash.add(ItemID.TWISTED_COAT_T2);
		this.ArmorCaseHash.add(ItemID.TWISTED_TROUSERS_T2);
		this.ArmorCaseHash.add(ItemID.TWISTED_BOOTS_T2);

		this.ArmorCaseHash.add(ItemID.TWISTED_HAT_T3);
		this.ArmorCaseHash.add(ItemID.TWISTED_COAT_T3);
		this.ArmorCaseHash.add(ItemID.TWISTED_TROUSERS_T3);
		this.ArmorCaseHash.add(ItemID.TWISTED_BOOTS_T3);

		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_TOP_OR); // Void knight top ornament (normal)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_TOP_LOR); // Void knight top ornament (locked)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_ROBE_OR); // Void knight robe ornament (normal)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_ROBE_LOR); // Void knight robe ornament (locked)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES_OR); // Void knight gloves ornament (normal)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES_LOR); // Void knight gloves ornament (locked)

		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_TOP); // Void knight top (normal)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_TOP_BROKEN); // Void knight top (broken)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_TOP_L); // Void knight top (locked)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_ROBE); // Void knight robe (normal)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_ROBE_BROKEN); // Void knight robe (broken)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_ROBE_L); // Void knight robe (locked)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES); // void knight gloves (normal)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES_BROKEN); // void knight gloves (broken)
		this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES_L); // void knight gloves (locked)

		this.ArmorCaseHash.add(ItemID.ELITE_VOID_TOP_OR); // Elite void top ornament (normal)
		this.ArmorCaseHash.add(ItemID.ELITE_VOID_TOP_LOR); // Elite void top ornament (locked)
		this.ArmorCaseHash.add(ItemID.ELITE_VOID_ROBE_OR); // Elite void robe ornament (normal)
		this.ArmorCaseHash.add(ItemID.ELITE_VOID_ROBE_LOR); // Elite void robe ornament (locked)
		// Since you upgrade the top and robes to elite, but the gloves stay the same, there is no need to add
		// elite gloves.  I left the 2 lines below commented out just so it matches the table on the wiki better.
		//this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES_OR); // Void knight gloves ornament (normal)
		//this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES_LOR); // Void knight gloves ornament (locked)

		this.ArmorCaseHash.add(ItemID.ELITE_VOID_TOP); // Elite void top (normal)
		this.ArmorCaseHash.add(ItemID.ELITE_VOID_TOP_BROKEN); // Elite void top (broken)
		this.ArmorCaseHash.add(ItemID.ELITE_VOID_TOP_L); // Elite void top (locked)
		this.ArmorCaseHash.add(ItemID.ELITE_VOID_ROBE); // Elite void robe (normal)
		this.ArmorCaseHash.add(ItemID.ELITE_VOID_ROBE_BROKEN); // Elite void robe (broken)
		this.ArmorCaseHash.add(ItemID.ELITE_VOID_ROBE_L); // Elite void robe (locked)
		// Since you upgrade the top and robes to elite, but the gloves stay the same, there is no need to add
		// elite gloves.  I left the 3 lines below commented out just so it matches the table on the wiki better.
		//this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES); // void knight gloves (normal)
		//this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES_BROKEN); // void knight gloves (broken)
		//this.ArmorCaseHash.add(ItemID.VOID_KNIGHT_GLOVES_L); // void knight gloves (locked)

		this.ArmorCaseHash.add(ItemID.VOID_MAGE_HELM); // Void mage helm (normal)
		this.ArmorCaseHash.add(ItemID.VOID_MAGE_HELM_BROKEN); // Void mage helm (broken)
		this.ArmorCaseHash.add(ItemID.VOID_MAGE_HELM_L); // Void mage helm (locked)

		this.ArmorCaseHash.add(ItemID.VOID_MAGE_HELM_OR); // Void mage helm ornament (normal)
		this.ArmorCaseHash.add(ItemID.VOID_MAGE_HELM_LOR); // Void mage helm ornament (locked)

		this.ArmorCaseHash.add(ItemID.VOID_MELEE_HELM); // Void melee helm (normal)
		this.ArmorCaseHash.add(ItemID.VOID_MELEE_HELM_BROKEN); // Void melee helm (broken)
		this.ArmorCaseHash.add(ItemID.VOID_MELEE_HELM_L); // Void melee helm (locked)

		this.ArmorCaseHash.add(ItemID.VOID_MELEE_HELM_OR); // Void melee helm ornament (normal)
		this.ArmorCaseHash.add(ItemID.VOID_MELEE_HELM_LOR); // Void melee helm ornament (locked)

		this.ArmorCaseHash.add(ItemID.VOID_RANGER_HELM); // Void ranger helm (normal)
		this.ArmorCaseHash.add(ItemID.VOID_RANGER_HELM_BROKEN); // Void ranger helm (broken)
		this.ArmorCaseHash.add(ItemID.VOID_RANGER_HELM_L); // Void ranger helm (locked)

		this.ArmorCaseHash.add(ItemID.VOID_RANGER_HELM_OR); // Void ranger helm ornament(normal)
		this.ArmorCaseHash.add(ItemID.VOID_RANGER_HELM_LOR); // Void ranger helm ornament (locked)

		this.ArmorCaseHash.add(ItemID.VYRE_NOBLE_TOP);
		this.ArmorCaseHash.add(ItemID.VYRE_NOBLE_LEGS);
		this.ArmorCaseHash.add(ItemID.VYRE_NOBLE_SHOES);

		this.ArmorCaseHash.add(ItemID.WHITE_FULL_HELM);
		this.ArmorCaseHash.add(ItemID.WHITE_PLATEBODY);
		this.ArmorCaseHash.add(ItemID.WHITE_PLATESKIRT);
		this.ArmorCaseHash.add(ItemID.WHITE_PLATELEGS);
		this.ArmorCaseHash.add(ItemID.WHITE_GLOVES);
		this.ArmorCaseHash.add(ItemID.WHITE_BOOTS);
		this.ArmorCaseHash.add(ItemID.WHITE_KITESHIELD);

		this.ArmorCaseHash.add(ItemID.XERICIAN_HAT);
		this.ArmorCaseHash.add(ItemID.XERICIAN_TOP);
		this.ArmorCaseHash.add(ItemID.XERICIAN_ROBE);
	}

	public boolean checkHash(int Item)
	{
		return this.ArmorCaseHash.contains(Item);
	}

}
