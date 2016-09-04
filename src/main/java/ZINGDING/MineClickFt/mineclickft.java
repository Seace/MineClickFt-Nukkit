package ZINGDING.MineClickFt;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.item.Item;
import cn.nukkit.math.Vector3;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.block.Block;
import cn.nukkit.potion.Effect;

import java.util.Random;

public class mineclickft extends PluginBase implements Listener {
	public void onLoad() {
		this.getLogger().info("§3✿ MineClickft on Loading! ✿");
	}

	public void onEnable() {
		this.getLogger().info("§3✿ MineClickft on Enable! ✿");
		this.getServer().getPluginManager().registerEvents(this, this);
	}

public void playerInteract(PlayerInteractEvent event) {
if(event.getBlock ().getId () == 35 || event.getBlock ().getId () == 246) {
	
	int randomInteger = new Random().nextInt(10);
	
	if (randomInteger == 10){
		this.getServer ().getDefaultLevel ().setBlock (new Vector3 (event.getBlock ().x, event.getBlock (). y, event.getBlock (). z), Block.get(246));
	}
 if(!(randomInteger == 10))
	{
	this.getServer ().getDefaultLevel ().setBlock (new Vector3 (event.getBlock ().x, event.getBlock (). y, event.getBlock (). z), event.getBlock());
	}
}

	if(event.getBlock ().getId () == 246 && event.getBlock ().getDamage () == 0) {
		 event.getPlayer().sendMessage("§3[ MineClickft ] You found a coin! [§a+§31]");
		 event.getPlayer().getInventory().addItem(new Item(341, 0, 1));
}
// 주의! 본 플러그인은 소스가 매우 스파게티합니다. 공부용으로는 절대 참고하지 말아주세요.
// 눈갱주의
        if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 15) {
     if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 10))) {
       event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
       return;
    }
				else {
    event.getPlayer().getInventory().removeItem(new Item(341, 0, 10));
    event.getPlayer().getInventory().addItem(new Item(268, 0, 1));
    event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Ancient sword! [§c-§310]");
 }
	 }
  if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 9) {
     if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 20))) {
       event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
       return;
     }
				else {
    event.getPlayer().getInventory().removeItem(new Item(341, 0, 20));
    event.getPlayer().getInventory().addItem(new Item(272, 0, 1));
    event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Stone sword! [§c-§320]");
 }
	 }
if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 4) {
     if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 30))) {
       event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
       return;
    }
				else {
    event.getPlayer().getInventory().removeItem(new Item(341, 0, 30));
    event.getPlayer().getInventory().addItem(new Item(283, 0, 1));
    event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Gold sword! [§c-§330]");
 }
	 }
  if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 3) {
     if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 60))) {
       event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
       return;
    }
				else {
    event.getPlayer().getInventory().removeItem(new Item(341, 0, 60));
    event.getPlayer().getInventory().addItem(new Item(276, 0, 1));
    event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Diamond sword! [§c-§360]");
 }
}
  if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 5) {
     if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 50))) {
       event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
       return;
    }
				else {
    event.getPlayer().getInventory().removeItem(new Item(341, 0, 50));
    event.getPlayer().getInventory().addItem(new Item(298, 0, 1));
    event.getPlayer().getInventory().addItem(new Item(299, 0, 1));
    event.getPlayer().getInventory().addItem(new Item(300, 0, 1));
    event.getPlayer().getInventory().addItem(new Item(301, 0, 1));
    event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Leather Pack! [§c-§350]");
}
 }
    if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 8) {
     if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 60))) {
       event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
       return;
    }
				else {
    event.getPlayer().getInventory().removeItem(new Item(341, 0, 60));
    event.getPlayer().getInventory().addItem(new Item(302, 0, 1));
    event.getPlayer().getInventory().addItem(new Item(303, 0, 1));
    event.getPlayer().getInventory().addItem(new Item(304, 0, 1));
    event.getPlayer().getInventory().addItem(new Item(305, 0, 1));
    event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Chain Pack! [§c-§360]");
}
}
if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 1) {
	 if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 10))) {
   	event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
	 	return;
	 }
	 else {
	 event.getPlayer().getInventory().removeItem(new Item(341, 0, 10));
	 event.getPlayer().getInventory().addItem(new Item(357, 0, 10));
	 event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Cookies! [§c-§310]");
}
}
	Effect effect;
	if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 6) {
if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 40))) {
 event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
 return;
}
else {
event.getPlayer().getInventory().removeItem(new Item(341, 0, 40)); //회복
effect =  Effect.getEffect (10);
effect.setDuration (128 * 20);
effect.setAmplifier (2);
event.getPlayer ().addEffect (effect);
event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Recovery effect! [§c-§340]");
}
}
if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 7) {
if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 40))) {
event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
return;
}
else {
event.getPlayer().getInventory().removeItem(new Item(341, 0, 64)); //저항
 effect = Effect.getEffect (11);
effect.setDuration (128 * 20);
effect.setAmplifier (2);
event.getPlayer ().addEffect (effect);
event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Resistance effect! [§c-§364]");
}
}
if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 14) {
if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 40))) {
event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
	return;
}
else {
event.getPlayer().getInventory().removeItem(new Item(341, 0, 64)); //힘
effect = Effect.getEffect (5);
effect.setDuration (128 * 20);
effect.setAmplifier (2);
event.getPlayer ().addEffect (effect);
event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Force effect! [§c-§364]");
}
}
if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 12) { //활
if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 50))) {
event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
return;
}
else {
event.getPlayer().getInventory().removeItem(new Item(341, 0, 50));
event.getPlayer().getInventory().addItem(new Item(261, 0, 1));
event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Bow! [§c-§350]");
}
}
if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 11) { //화살
if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 32))) {
event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
return;
}
else {
event.getPlayer().getInventory().removeItem(new Item(341, 0, 32));
event.getPlayer().getInventory().addItem(new Item(262, 0, 32));
event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Arrow! [§c-§332]");
}
}
if(event.getBlock ().getId () == 159 && event.getBlock ().getDamage () == 13) {
if(!event.getPlayer().getInventory().contains(Item.get(341, 0, 40))) {
event.getPlayer().sendMessage("§c[ MineClickft ] You don't have enough Coins!");
return;
}
else {
event.getPlayer().getInventory().removeItem(new Item(341, 0, 40)); //점프
effect = Effect.getEffect (8);
effect.setDuration (128 * 20);
effect.setAmplifier (2);
event.getPlayer ().addEffect (effect);
event.getPlayer().sendMessage("§3[ MineClickft ] You bought a Jumper effect! [§c-§340]");
}
}
}
}
