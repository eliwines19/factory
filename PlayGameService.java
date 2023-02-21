public class PlayGameService {
    public static void main(String[] args) {

        PlayGameFactory factory = new PlayGameFactory();
        PlayGame play = factory.createGameStart("PokemonViolet");
        play.startGame();

    }
}
