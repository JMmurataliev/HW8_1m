package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

import java.util.Random;

public class Avenger extends Hero implements Fighter {


    public Avenger(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.DEFENCE);


    }

    @Override
    public void attack(GameEntity entity) {
        entity.setHealth(entity.getHealth() - this.getDamage());
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int random = RPG_Game.random.nextInt(5);
        if (random == 0) {
            System.out.println("Avenger shield team ");
            for (Hero hero : heroes) {
                hero.setHealth(hero.getHealth() + boss.getDamage());
            }
        }
    }

}
