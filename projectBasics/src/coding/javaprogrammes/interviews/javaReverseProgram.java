package coding.javaprogrammes.interviews;

public class javaReverseProgram {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "Dharmendra";
		//using StringBuilder Method
		/*StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb = sb.reverse();
		System.out.println(sb);*/
		// Using String Buffer Method
		/*StringBuffer sbf = new StringBuffer("MyJava");
		System.out.println(sbf.reverse());*/
		//Using iterative method
		//first Convert given string to using CharArry() method
		/*char[] strArray =str.toCharArray();
		//System.out.println(strArray);
		for(int i =strArray.length-1; i>=0; i--)
		{
			System.out.print(strArray[i]);
		}*/
		//using RecursiveMethod()
		
	 static String recursiveMethod(String str) {
		// TODO Auto-generated method stub
		 
		if((null == str)|| (str.length()<=1))
		{
			return str;
		}
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}
	}

	//System.out.println( recursiveMethod(str));
	

