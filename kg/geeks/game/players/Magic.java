package kg.geeks.game.players;

public class Magic extends Hero implements Fighter {
    private final int increaseDamage;
    int currentRound;
    public Magic(int health, int damage, String name, int increaseDamage) {
        super(health, damage, name, SuperAbility.BOOST);
        this.increaseDamage = increaseDamage;

    }
    @Override
    public void attack(GameEntity entity) {
        entity.setHealth(entity.getHealth() - this.getDamage());
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        // Если это один из первых 4 раундов, увеличиваем урон

        if (currentRound <= 4) {
            for (Hero hero : heroes) {
                int newDamage = hero.getDamage() + increaseDamage;
                hero.setDamage(newDamage);
            }
            System.out.println("Magic " + this.getName()
                    + " increased damage by " + " by " + increaseDamage);
        }
    }

}
