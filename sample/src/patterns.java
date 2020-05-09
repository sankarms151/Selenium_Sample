import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter N value:");
		int n=scan.nextInt();
		int temp=0;
		System.out.println("1");
for(int i=2;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
	System.out.print(j);
	if(i!=j)
		System.out.print("+");
	temp=temp+j;
	}
	System.out.print("="+temp);
	temp=0;
	System.out.println();
}
	}
}
