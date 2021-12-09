package dev.norska.scyther.api;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dev.norska.scyther.Scyther;

/** 
* 
* @author Norska
*  
*/

public class ScytherAPI {
	
	public static Boolean isHarvesterBindingEnabled() {
		return null;
	}
	
	public static Boolean isHarvesterBindingUsageDisabled() {
		return null;
	}
	
	public static Boolean isHarvesterBindingTaxingEnabled() {
		return null;
	}
	
	public static int getHarvesterBindingTaxPercentage() {
		return 0;
	}
	
	public static Boolean isBoundToPlayer(ItemStack harvesterItem) {
		return null;
	}
	
	public static String getHarvesterOwnerName(ItemStack harvesterItem) {
		return null;
	}	
	
	public static String getHarvesterOwnerUUID(ItemStack harvesterItem) {
		return null;
	}
	
	/** 
	* Get the XP required for the next harvester hoe level.
	* @param Current harvester hoe level, can be obtained with .getHarvesterHoeLevel(ItemStack harvesterItem).
	* @return Returns the XP required for the next level and null if paremeters are broken.
	*/
	
	public static Double getTotalXPForNextLevel(int currentLevel) {
		return null;
		
	}
	
	/** 
	* Get the harvester hoe level.
	* @param Harvester hoe item, an item can be verified with .isHarvesterItem(ItemStack harvesterItem).
	* @return Returns the current level of the harvester hoe.
	*/
	
	public static int getHarvesterHoeLevel(ItemStack harvesterItem) {
		return 0;
	}
	
	/** 
	* Get the harvester hoe xp (this is not the total XP but the XP that has been accumulated after leveling up).
	* @param Harvester hoe item, an item can be verified with .isHarvesterItem(ItemStack harvesterItem).
	* @return Returns the current xp of the harvester hoe.
	*/
	
	public static Double getHarvesterHoeXP(ItemStack harvesterItem) {
		return null;
	}
	
	/** 
	* Get the current harvester hoe mode.
	* @param Harvester hoe item, an item can be verified with .isHarvesterItem(ItemStack harvesterItem).
	* @return Returns the current level mode of the harvester hoe which can be "DigDirt", "Autosell", "Autocollect".
	*/
	
	public static String getHarvesterHoeMode(ItemStack harvesterItem) {
		return null;
	}
	
	/** 
	* Check if an itemstack is a harvester hoe.
	* @param Any itemstack.
	* @return True or false.
	*/
	
	public static Boolean isHarvesterItem(ItemStack harvesterItem) {
		return null;
	}
	
	/** 
	* Get the a harvester hoe's sell multiplier.
	* @param Harvester hoe item, an item can be verified with .isHarvesterItem(ItemStack harvesterItem).
	* @return Returns the current sell multiplier of the harvester hoe.
	*/
	
	public static Double getSellMultiplier(ItemStack harvesterItem) {
		return null;
	}
	
	/** 
	* Get the a harvester hoe's drop multiplier.
	* @param Harvester hoe item, an item can be verified with .isHarvesterItem(ItemStack harvesterItem).
	* @return Returns the current drop multiplier of the harvester hoe.
	*/
	
	public static int getDropMultiplier(ItemStack harvesterItem) {
		return 0;
	}
	
	/** 
	* Create a custom model harvester hoe (ONLY 1.14+).
	* @param Scyther's instance (Scyther.getInstance()), Material, Material Data, Custom Model Data, Sell Multiplier, Drop Multiplier, Uses, Default Mode (CAN BE "AUTOCOLLECT", "AUTOSELL", "DIGGER"), Glow).
	* @return Returns a custom model harvester hoe item.
	*/
	
	public static ItemStack createCustomModelHarvesterHoe(Scyther main, Material material, int materialData, int customModelData, Double sellMultiplier, int dropMultiplier, int uses, String defaultMode, Boolean glow) {
		return null;
	}
	
	/** 
	* Create a harvester hoe.
	* @param Scyther's instance (Scyther.getInstance()), Material, Material Data, Sell Multiplier, Drop Multiplier, Uses, Default Mode (CAN BE "AUTOCOLLECT", "AUTOSELL", "DIGGER"), Glow).
	* @return Returns a harvester hoe item.
	*/

	@SuppressWarnings("deprecation")
	public static ItemStack createHarvesterHoe(Scyther main, Material material, int materialData, Double sellMultiplier, int dropMultiplier, int uses, String defaultMode, Boolean glow) {
		return null;
	}
	
	/** 
	* Check if confirm drop for harvester hoe items is enabled.
	* @return True or false.
	*/
	
	public static Boolean isConfirmDropEnabled() {
		return null;
	}
	
	/** 
	* Get the confirm drop interval (seconds).
	* @return Integer
	*/
	
	public static int getConfirmDropInterval() {
		return 0;
	}
	
	/** 
	* Check if drop items on full inventory is enabled.
	* @return True or false.
	*/
	
	public static Boolean isDropItemsOnFullInventoryEnabled() {
		return null;
	}
	
	// HOE ITEM DATA
	
	public static String getDefaultMode() {
		return null;
	}
	
	public static Material getHoeMaterial() {
		return null;
	}
	
	public static String getAutosellName() {
		return null;
	}
	
	public static String getAutocollectName() {
		return null;
	}
	
	public static String getDirtDiggerName() {
		return null;
	}
	
	/** 
	* Check if the harvester item is on autosell mode.
	* @param Harvester hoe item, an item can be verified with .isHarvesterItem(ItemStack harvesterItem).
	* @return True or false.
	*/
	
	public static Boolean isHarvesterItemOnAutosell(ItemStack harvesterItem) {
		return null;
	}
	
	/** 
	* Check if the harvester item is on autocollect mode.
	* @param Harvester hoe item, an item can be verified with .isHarvesterItem(ItemStack harvesterItem).
	* @return True or false.
	*/
	
	public static Boolean isHarvesterItemOnAutocollect(ItemStack harvesterItem) {
		return null;
	}
	
	/** 
	* Check if the harvester item is on dirt digger mode.
	* @param Harvester hoe item, an item can be verified with .isHarvesterItem(ItemStack harvesterItem).
	* @return True or false.
	*/
	
	public static Boolean isHarvesterItemOnDirtDigger(ItemStack harvesterItem) {
		return null;
	}
	
	// HOE MODES ENABLED
	
	public static Boolean isDirtDiggerEnabled() {
		return null;
	}
	
	public static Boolean isAutosellEnabled() {
		return null;
	}
	
	public static Boolean isAutocollectEnabled() {
		return null;
	}
	
	public static Boolean isModesPermissionsEnabled() {
		return null;
	}
	
	// HERBALISM AUTOCOLLECT/AUTOSELL
	
	public static Boolean isHerbalismAutocollectEnabled() {
		return null;
	}
	
	public static Boolean isHerbalismAutosellEnabled() {
		return null;
	}
}
