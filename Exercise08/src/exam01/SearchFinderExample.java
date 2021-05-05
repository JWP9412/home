package exam01;

public class SearchFinderExample {

	public static void main(String[] args) {
		SearchFindable sf = new SearchFinderImpl();
		SearchFindable.info(sf);
		/*
		 * SearchFinder는 추상클래스
		 * SearchFinder.lookup()이 구현되어 있지 않음
		SearchFindable ff = new SearchFinder();
		SearchFindable.info(ff);
		*/
	}

}
