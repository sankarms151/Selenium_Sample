import java.util.Arrays;

/*
class ex
{
	String add(int x,int y)
	{
		int c=x+y;
		String sum=Integer.toString(c);
		return sum;
	}
}
{1,2,1,5,1,6,4,1,1,2}

{1,1,1,1,1,2,2,4,5,6}
*/
public class Programs {

public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []a={1,2,1,2,1,2,2,1,2,1,2,2};
 int count=1;
 Arrays.sort(a);   ///1 1 1 2 2 3 3 3 
 int n=a.length;
 int temp=0,dum=0,countaaa=1;
 for(int i=0;i<n-1;i++)
 {
	 if(a[i]==a[i+1])
	 {
		 count++;//1  ///how many                                                                     
		 temp=a[i];//1///tamil nadu
	 }
	 else
	 { 
		 if(x>=y)
		 {
			 if(a[i])
		dum=a[i];//1///andhra
		countaaa=count;//2///how many
		count=1;
		 }
	 }
 }
 System.out.println(countaaa);
 System.out.println(count);
 if(countaaa>count)
	 System.out.println("A: "+dum+" count:  "+countaaa);
 else
 System.out.println(temp+" "+count);
	}

}
