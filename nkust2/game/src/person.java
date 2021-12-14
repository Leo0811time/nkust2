public class person {
    public static void main(String[] args) {
        game Merlin = new game(30, 400, 1000);
        Merlin.getCurrentStatus();
        Merlin.name = "Merlin";
        Merlin.ShoutMyName();
        game Arthur = new game(2000, 50, 100);
        Arthur.getCurrentStatus();
        Arthur.name = "Arthur";
        Arthur.ShoutMyName();
        game Cupid = new game(100, 200, 500);
        Cupid.getCurrentStatus();
        Cupid.name = "Cupid";
        Cupid.ShoutMyName();
    }
}