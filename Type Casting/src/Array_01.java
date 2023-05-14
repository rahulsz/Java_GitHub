
public class Array_01 {
public static void main(String[] args) {
char[]c1= {'A','B','C','D'};
char []c2= {'P','Q','A','D'};
for(int i=0;i<c1.length;i++)
{
	for(int j=0;j<=c2.length;j++)
	{
		if(c1[i]==c2[j])
		{
			System.out.println(c2[j]+"-"+j);
		}
	}
}
}
}
