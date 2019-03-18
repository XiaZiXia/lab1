package lab1;

public class cal {
	
	public int combination(int x) {
		int flag = 0;
		for(int x50 = 0; x50 <= 1 ; x50++) {
			for(int x20 = 0; x20 <= 1 ; x20++) {
				for(int x5 = 0; x5 <= 2 ; x5++) {
					for(int x1 = 0; x1 <= 3 ; x1++) {						
						if(x50*50 + x20*20 + x5*5 + x1 == x) {
							flag = 1;
						}
					}
				}
			}
		}
		
		return flag;
	}

}
	