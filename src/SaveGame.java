public class SaveGame implements Command {
    private Model model;

    public SaveGame(Model model){
        this.model=model;
    }

    @Override
    public void execute() {
        model.save();
    }
}