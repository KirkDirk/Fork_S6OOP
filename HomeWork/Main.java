public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		ReportManager reportManager = new ReportManager(new PrintToScreen());
		reportManager.report(user);
		SaveManager saveManager = new SaveManager(new SaveToTxt());
		saveManager.saveTo(user);
	}
}