package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {

    private int blockedDamage;
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(5) + 1;
        for (int i = 0; i <heroes.length ; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i] && boss.getDefence() != SuperAbility.BOOST) {
                heroes[i].setDamage(heroes[i].getDamage() + coeff);
            }
        }
        System.out.println("Magic worked " + coeff);
        return coeff;
    }
}
