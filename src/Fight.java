public class Fight {
    public static void main (String[] args){

        Fighter fighter1 = new Fighter("Jerry", 30, 3);
        Fighter fighter2 = new Fighter("Harrald", 20, 5);

        System.out.println(Kata.declareWinner(fighter1, fighter2, "Jerry"));
    }
}
