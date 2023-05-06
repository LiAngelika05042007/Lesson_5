public class Hero {
    private int health;//здоровье
    private int damage;//урон
    private String attackType;//суперспособность

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttackType() {
        return attackType;
    }

    public Hero(int health, int damage, String attackType){
        this.health = health;
        this.damage = damage;
        this.attackType = attackType;
    }
    public Hero (int health, int damage){
        this.health = health;
        this.damage = damage;


    }


}
























