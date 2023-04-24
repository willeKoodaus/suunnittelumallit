
public class TestCommands {
    public static void main(String[] args) {
        
        // WhiteScreen commands
        WhiteScreen screen = new WhiteScreen();
        Command screenUp = new WhiteScreenUpCommand(screen);
        Command screenDown = new WhiteScreenDownCommand(screen);
        WallButton button3 = new WallButton(screenUp);
        WallButton button4 = new WallButton(screenDown);
        button3.push();
        button4.push();
    }
}

