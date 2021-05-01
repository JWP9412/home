package api11_6_3_newInstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec06.exam03_newinstance.SendAction");
			//Class clazz = Class.forName("sec06.exam03_newinstance.Reiceive");
			Action action = (Action)clazz.newInstance();
			action.execute();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
