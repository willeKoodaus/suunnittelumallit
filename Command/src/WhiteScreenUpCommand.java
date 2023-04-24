
public class WhiteScreenUpCommand implements Command {
    private WhiteScreen whiteScreen;

    public WhiteScreenUpCommand(WhiteScreen whiteScreen) {
        this.whiteScreen = whiteScreen;
    }

    @Override // Command
    public void execute() {
        whiteScreen.up();
    }
}