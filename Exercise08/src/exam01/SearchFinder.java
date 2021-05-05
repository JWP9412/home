package exam01;

public abstract class SearchFinder implements SearchFindable {
	
	@Override
	public void find(String f) {
		System.out.printf("SearchFinder : find(%s)\n",f);

	}

	@Override
	public void search(String s) {
		System.out.printf("SearchFinder : search(%s)\n",s);

	}
	
	@Override
	public abstract void lookup(String l); {
		//System.out.printf("SearchFinder : lookup(%s)\n",l);

	}


}
