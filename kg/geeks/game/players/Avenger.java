package kg.geeks.game.players;

public abstract class Avenger extends Hero implements Fighter {

    public Avenger (int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK);
    }

    @Override
    public void attack(GameEntity entity) {
        entity.setHealth(entity.getHealth() - this.getDamage());
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - boss.getHealth();
}
