package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Jyanken_Chapter26 janken = new Jyanken_Chapter26();
		
		
		String myChoice = janken.getMyChoice();
		String random = janken.getRandom();
		
		janken.playGame(myChoice, random);
		
	}

}
