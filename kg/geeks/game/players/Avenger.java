package kg.geeks.game.players;

import java.util.Random;

public class Avenger extends Hero implements Fighter{

Random random = new Random();
    public Avenger(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.DEFENCE);


    }
    @Override
    public void attack(GameEntity entity) {
        entity.setHealth(entity.getHealth() - this.getDamage());
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {


    }
}