package exam01;

public interface SearchFindable {
	//public static final String hello = new String("Hello");
	String hello = new String("Hello");//static final
	
	void find(String f);
	void search(String s);
	void lookup(String l);

	
	public static void info(SearchFindable sf) {
		sf.search("Ž��");
		sf.find("ã��");
		sf.lookup("�˻�");
		System.out.println(SearchFindable.hello);
		System.out.println(hello);
	}
}
