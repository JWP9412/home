package api11_5_4_getProperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("OS : " + osName);
		System.out.println("user : " + userName);
		System.out.println("dir : " + userHome);
		
		System.out.println("----------------------");
		System.out.println(" [key] value");
		System.out.println("----------------------");
		
		Properties props = System.getProperties();
		Set<?> keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			System.out.println(" [ "+key+" ] "+ value);
		}

	}

}
