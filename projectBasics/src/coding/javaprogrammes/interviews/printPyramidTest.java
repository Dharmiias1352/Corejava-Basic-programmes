package coding.javaprogrammes.interviews;

public class printPyramidTest {
	public static void drawPyramidPattern()
	{
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++)
			{
				 
				System.out.print("  ");
			}
			
			for(int k=0; k<=i; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void drawNumberPattern()
	{
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print(k+ " ");
			}
			
			System.out.println();
		}
		
	}
	public static void drawPatternSquare()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i==1 || i==4 || j==1 || j==4)
				System.out.print(" * ");
			
				else
					System.out.print("   ");
		}
			System.out.println( );
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//drawPyramidPattern();/
		//drawNumberPattern();
		drawPatternSquare();
			}
}
