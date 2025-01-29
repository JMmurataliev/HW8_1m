package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Hacker extends Hero  {


    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SWITCH);

    }




public void takeDamage(int damage){

}
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int random1 = RPG_Game.random.nextInt(heroes.length);
        int random2 = RPG_Game.random.nextInt(100);
        boss.setHealth(boss.getHealth() - random2);
        Hero hero = heroes[random1];
        hero.setHealth(heroes[random1].getHealth() + random2);
        System.out.println("Цукерберг переводить  здоровья его одному из героев: " + hero.getName());
    }
}


