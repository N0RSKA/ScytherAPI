package dev.norska.scyther.api;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ScytherAutosellEvent extends Event implements Cancellable{

    private final Player player;
    private final Block block;
    private final Material material;
    private Double money, xp;
    private boolean isCancelled;
    private int uses, amount;

    public ScytherAutosellEvent(Player player1, Block block1, Double money1, int uses1, int amount1, Double xp1, Material material1) {
        this.player = player1;
        this.block = block1;
        this.money = money1;
        this.material = material1;
        this.xp = xp1;
        this.uses = uses1;
        this.amount = amount1;
        this.isCancelled = false;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public Block getBlock() {
        return this.block;
    }
    
    public Material getCropMaterial() {
        return this.material;
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public Double getMoney() {
    	return this.money;
    }
    
    public void setMoney(Double amount) {
    	money = amount;
    }
    
    
    public Double getAwardedXP() {
    	return this.xp;
    }
    
    public void setAwardedXP(Double amount) {
    	xp = amount;
    }
    
    public int getHarvesterUses() {
    	return this.uses;
    }
    
    public void setHarvesterUses(int amount) {
    	uses = amount;
    }
    
    
}
