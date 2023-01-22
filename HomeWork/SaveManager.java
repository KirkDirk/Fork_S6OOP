public class SaveManager {
    Saveable saveable;

    public SaveManager(Saveable saveable) {
        this.saveable = saveable;
    }

    public void saveTo(User user){
        saveable.saveTo(user);
    }
}
