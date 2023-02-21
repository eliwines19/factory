public class PlayGameFactory {
    public PlayGame createGameStart(String game)
    {
        if (game == null || game.isEmpty()) {
            return null;
        }
        switch (game) {
            case "ZeldaBotW":
                return new ZeldaBotW();
            case "MarioOdyssey":
                return new MarioOdyssey();
            case "PokemonViolet":
                return new PokemonViolet();
            default:
                throw new IllegalArgumentException("I don't know this game: " + game);
        }
    }
}
