public class Excercise1 {

    static boolean iwillNotCheat = false;
    static boolean iwillWin = false;

    public static void main(String[] args) throws Exception {

        assert iwillNotCheat == true : "tanga tanga ka kasi huli ka tuloy";

        enterCompetition();
        assert iwillWin == true : "all i do is win win win no matter what";

    }
    static void enterCompetition() {
       iwillWin = false;
    }
}