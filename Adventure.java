package assingment;
public class Adventure {

	public static void main(String[] args) {
		
		TitleMenu StartMenu = new TitleMenu();
		StartMenu.OptionList();
		MainChoices ChoosePath = new MainChoices();
		ChoosePath.TownOptions();
		Path2options SecondPath = new Path2options();
		SecondPath.twoOptions();
		
	}
}
