package b8_clean_code_va_refractoring.bai_tap.Refractoring;

public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    public static final int ADVANTAGE = 4;

    public static String getScore(String player1Name, String player2Name, int   mScore1, int mScore2) {
        String score = "";
        if (mScore1 == mScore2) {
            switch (mScore1) {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FORTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (mScore1 >= ADVANTAGE || mScore2 >= ADVANTAGE) {
            score = getScore1(mScore1, mScore2);
        } else {
            score = getScore2(mScore1, mScore2, score);
        }
        return score;
    }



    private static String getScore1(int mScore1, int mScore2) {
        String score;
        int minusResult = mScore1 - mScore2;
        if (minusResult == 1) {
            score = "Advantage player1";
        }
        else if (minusResult == -1) {
            score = "Advantage player2";
        }
        else if (minusResult >= 2) {
            score = "Win for player1";
        }
        else score = "Win for player2";
        return score;
    }
    private static String getScore2(int mScore1, int mScore2, String score) {
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = mScore1;
            }
            else {
                score += "-";
                tempScore = mScore2;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
