package com.flm.nestedforloop;

public class Test {

	public static void main(String[] args) {
		outer:
		for(int i=1;i<=5;i++) {
			inner:
			for(int j=1;j<=5;j++) {
				if(i==3) {
					break outer;
				}
				System.out.println("i: "+i + " --j: "+j);
			}
		}

	}

}
