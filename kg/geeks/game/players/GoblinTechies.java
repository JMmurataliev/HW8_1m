package kg.geeks.game.players;
import kg.geeks.game.general.RPG_Game;

public class GoblinTechies extends Hero implements Fighter {
    public GoblinTechies(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.LAND_MINE);
    }


    @Override
    public void attack(GameEntity entity) {
        entity.setHealth(entity.getHealth() - this.getDamage());
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(1, 2); // 2, 3, 4
        boss.setHealth(boss.getHealth() - coeff * this.getDamage());
        System.out.println("Techies " + this.getName() +
                " attacked bomb " + coeff * this.getDamage());
    }
}
