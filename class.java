public class DiceLogic {
    public static void main(String[] args) {
        int diceNumber = diceLogic();
        int diceNumber1 = diceLogic();
        System.out.println(diceNumber);
        System.out.println(diceNumber1);
    }

    public static int diceLogic() {
        int a = 0;
        int dice = 0;
        while (a < 2) {
            dice = (int) (Math.random() * 6 + 1);
            a++;
        }
        return dice;
    }
}
