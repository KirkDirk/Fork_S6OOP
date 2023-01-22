public class SaveToTxt implements Saveable{

    @Override
    public void saveTo(User user) {
        // Операция по сохранению в файл ".txt"
        System.out.println(String.format("Данные пользователя %s сохранены в файл .txt", user.getName()));
    }
    
}
