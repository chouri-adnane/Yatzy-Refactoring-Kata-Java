package yatzy;

import java.util.List;

public class YatzyScores {
    public static int chance(RollDice roll) {
        return roll.sum();
    }

    public static int yatzy(RollDice roll) {
        if (roll.isYatzy()) {
            return 50;
        }
        return 0;
    }

    public static int ones(RollDice roll) {
        return roll.countDice(1);
    }

    public static int twos(RollDice roll) {
        return roll.countDice(2) * 2;
    }

    public static int threes(RollDice roll) {
        return roll.countDice(3) * 3;
    }

    public static int fours(RollDice roll) {
        return roll.countDice(4) * 4;
    }

    public static int fives(RollDice roll) {
        return roll.countDice(5) * 5;
    }

    public static int sixes(RollDice roll) {
        return roll.countDice(6) * 6;
    }

    public static int pair(RollDice roll) {
        List<Integer> pairs = roll.findPairs();
        if (pairs.isEmpty()) {
            return 0;
        }  else {
            return pairs.get(0) * 2;
        }
    }

    public static int twoPairs(RollDice roll) {
        List<Integer> pairs = roll.findPairs();
        if (pairs.size() >= 2) {
            return pairs.stream()
                    .mapToInt(pair -> pair * 2)
                    .sum();
        }
        return 0;
    }

    public static int threeOfAKind(RollDice roll) {
        return roll.getDiceWithCountGreaterThan(3) * 3;
    }

    public static int fourOfAKind(RollDice roll) {
        return roll.getDiceWithCountGreaterThan(4) * 4;
    }

    public static int smallStraight(RollDice roll) {
        if (roll.isSmallStraight()) {
            return 15;
        }
        return 0;
    }

    public static int largeStraight(RollDice roll) {
        if (roll.isLargeStraight()) {
            return 20;
        }
        return 0;
    }

    public static int fullHouse(RollDice roll) {
        if (roll.isFullHouse()) {
            return roll.sum();
        }
        return 0;
    }
}
