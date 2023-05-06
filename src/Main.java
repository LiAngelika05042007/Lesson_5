public class Main {
    public static void main(String[] args) {
        createHeroes();
        for (Hero heroes: createHeroes()){
            System.out.println("Жизнь героя:"+heroes.getHealth() + " " + "Урон героя:"+heroes.getDamage() + " " + "Тип защиты:"+heroes.getAttackType());
          
        }
        Boss herobrine = new Boss();
        herobrine.setHealth(500);
        herobrine.setDamage(20);
        herobrine.setProtection("protection");
        System.out.println("Жизнь Босса:"+herobrine.getHealth());
        System.out.println("Урон нанесения:"+herobrine.getDamage());
        System.out.println("Тип защиты:"+herobrine.getProtection());

    }
    public static Hero[] createHeroes() {
        Hero flash = new Hero(200, 100, "speed");
        Hero batman = new Hero(100, 50);
        Hero halk = new Hero(300, 500, "force");
        return new Hero[]{flash, batman, halk};
        }
    }



































