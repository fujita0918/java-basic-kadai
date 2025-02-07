package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dictionary_Chapter21  Dictionary = new Dictionary_Chapter21();
		
        String[] SearchWord = {"apple", "banana", "grape", "orange"};
        
        // 辞書を調べるメソッドを引数指定で呼び出す
        for(String Keyword : SearchWord) {
            Dictionary.search(Keyword);
        }
	}

}
