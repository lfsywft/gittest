package test;

public class Test
{

	public static void main(String args[]){
		
		System.out.print(a());
		System.out.print(a());
		
	}
	
	public static int a(){
		try{
			return 1;
		}finally{
			return 2;
		}
	}
}
