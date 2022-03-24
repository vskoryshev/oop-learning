public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        double strokesToKillFighter2 = (fighter2.health / (double) fighter1.damagePerAttack);
        double strokesToKillFighter1 = (fighter1.health / (double) fighter2.damagePerAttack);
        if (strokesToKillFighter2 >= strokesToKillFighter1 + 1) {
            return fighter2.name;
        } else if (strokesToKillFighter1 >= strokesToKillFighter2 + 1) {
            return fighter1.name;
        } else {
            if (firstAttacker.equals(fighter1.name) && strokesToKillFighter2 <= strokesToKillFighter1) {
                return fighter1.name;
            } else return fighter2.name;

//            if (firstAttacker.equals(fighter2.name) && strokesToKillFighter1 <= strokesToKillFighter2) {
//                return fighter2.name;
//            } else return fighter1.name;
        }
    }
}