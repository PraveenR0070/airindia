package Example;

import org.testng.annotations.Test;

public class stars {
	@Test
	public void starst() {
		int count =1;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++,count++) {
				System.out.print(count+"");
			}
			
			
			System.out.println();
		}
		
		
	}

}
