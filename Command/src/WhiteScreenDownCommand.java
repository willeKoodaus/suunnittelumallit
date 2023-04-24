
public class WhiteScreenDownCommand implements Command {
    private WhiteScreen whiteScreen;

    public WhiteScreenDownCommand(WhiteScreen whiteScreen) {
        this.whiteScreen = whiteScreen;
    }

    @Override // Command
    public void execute() {
        whiteScreen.down();
    }
}
