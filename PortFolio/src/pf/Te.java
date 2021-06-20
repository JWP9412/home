package pf;

import java.util.Iterator;

public class Te {

	public static void main(String[] args) {
		int a[] = {88,32,99};
		int b[] = {11,55,33};
		
		int max[] = new int[3];
		int min[] = new int[3];
		
		for(int i=0; i<a.length;i++) {
			System.out.println(max[i] +" ||" +min[i]);
			if(a[i] > b[i]) {
				min[i] = b[i];
				max[i] = a[i];
			}else {
				min[i] = a[i];
				max[i] = b[i];
			}
			System.out.println(i+"min : " + min[i]);
			System.out.println(i+"max : " + max[i]);
			
			
		}

	}

}
