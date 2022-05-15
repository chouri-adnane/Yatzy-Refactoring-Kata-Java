package yatzy;

import java.util.function.Function;

public enum Category {
    Chance(YatzyScores::chance),
    Yatzy(YatzyScores::yatzy),
    Ones(YatzyScores::ones),
    Twos(YatzyScores::twos),
    Threes(YatzyScores::threes),
    Fours(YatzyScores::fours),
    Fives(YatzyScores::fives),
    Sixes(YatzyScores::sixes),
    Pair(YatzyScores::pair),
    TwoPairs(YatzyScores::twoPairs),
    ThreeOfAKind(YatzyScores::threeOfAKind),
    FourOfAKind(YatzyScores::fourOfAKind),
    SmallStraight(YatzyScores::smallStraight),
    LargeStraight(YatzyScores::largeStraight),
    FullHouse(YatzyScores::fullHouse);

    private final Function<RollDice, Integer> scoreFunction;

    Category(Function<RollDice, Integer> scoreFunction) {
        this.scoreFunction = scoreFunction;
    }

    public int score(RollDice roll) {
        return this.scoreFunction.apply(roll);
    }
}