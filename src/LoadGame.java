public class LoadGame implements Command {
    private Model model;

    public LoadGame(Model model){
        this.model=model;
    }

    @Override
    public void execute() {
        model.load();
    }
}
