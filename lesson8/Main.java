public class Main {

    public static void main(String[] args) {

        Blockrun treadmill = new Treadmill(30);
        Blockjump wall = new Wall(15);

        Competible human1 = new Human("Петя",15,25);
        Competible human2 = new Human("Вася",10,70);
        Competible cat1 = new Cat("Рыжик",2,15);
        Competible cat2 = new Cat("Борис",3,10);
        Competible robot1 = new Robot("Т-1000",999,0);
        Competible robot2 = new Robot("Т-2000",999,999);


        Competible[] competitors = {human1, human2, cat1, cat2, robot1, robot2};
        Blockable[] barriers = {treadmill, wall};

        for (Competible c : competitors) {
            for (Blockable b : barriers) {
                if (b instanceof Blockrun && ((Blockrun) b).getLength() <= c.getMaxLength()) {
                    c.run((Blockrun) b);
                    System.out.println(c.getName() + " пробежал беговую дорожку");
                } else if (b instanceof Blockjump && ((Blockjump) b).getHeight() <= c.getMaxHeight()) {
                    c.jump((Blockjump) b);
                    System.out.println(c.getName() + " перепрыгнул стенку");
                } else {
                    System.out.println(c.getName() + " не смог пройти препятствие");
                    break;
                }
            }
        }


    }
}
