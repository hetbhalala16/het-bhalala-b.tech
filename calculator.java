import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a: ");
		int a=sc.nextInt();
		System.out.println("enter b: ");
		int b=sc.nextInt();
		System.out.println("enter oparation: ");
		String str=sc.next();
		if(str.equals("add")){
			System.out.println("ans= "+(a+b));
		}
		 else if(str.equals("sub")){
			System.out.println("ans= "+(a-b));
		}
		else if(str.equals("mul")){
			System.out.println("ans= "+(a*b));
		}
		else if(str.equals("div")){
			System.out.println("ans= "+(a/b));
		}
		else{
			System.out.println("invalid ");
		}

		

	}
}