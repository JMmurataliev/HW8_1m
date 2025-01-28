package kg.geeks.game.players;

public class Bomber extends Hero implements Fighter {


    public Bomber(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SUICIDE_SQUAD);

    }

    public Bomber(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name, ability);
    }


    @Override
    public void attack(GameEntity entity) {
        entity.setHealth(entity.getHealth() - this.getDamage());
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {



    }
}
