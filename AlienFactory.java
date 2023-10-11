import java.util.Random;

public class AlienFactory {
    private enum Types {SquidAlien, MonkeyAlien, TigerAlien, RatAlien};
    private static Random r = new Random();

    public Alien getAlien() {
        int rand = r.nextInt(Types.values().length);
        Types t = Types.values()[rand];
        Alien answer = null;
        switch (t) {
            case SquidAlien:
                answer = new SquidAlien();
                break;
            case MonkeyAlien:
                answer = new MonkeyAlien();
                break;
            case RatAlien:
                answer = new RatAlien();
                break;
            case TigerAlien:
                answer = new TigerAlien();
                break;
            default:
                System.out.println("Unknown alien type!");
                System.exit(1);
                break;
        }
        return answer;
    }
}
