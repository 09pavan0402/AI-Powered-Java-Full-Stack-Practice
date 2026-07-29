package com.flm.stringsjava;

public class Test {

	public static void main(String[] args) {
		String s1 = "FLM"; //stored in string consent fool
		String s2 = "FLM";
		String s3=new String("FLM");
		String s4=new String("FLM");//stored in heap memory
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}

}
/*1. when we use to create string using string literals it is stored at string constant pool present at heap momory
2. when we use to create string using new keyword it is stored at heap momory.
3. the key defference is when we store string constant pool, two varable name with same value it referece same memory location it save the memory 
4. strings are immutable in java if we declare variable value canot change when we try to change the value the old string present new string created at background
5. == is used to check memory location in java
6. .equals() method used to check content in java.*/
