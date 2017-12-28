
import java.util.Scanner;
/**
计算1!+2!+...+10!的阶乘之和
*/
public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		for(int i=1;i<=10;i++){
			int jc = 1;
			for(int j = 1;j<=i;j++){
				jc *= j;	
			}
			sum += jc;
		}
			
		System.out.println("阶乘之和为："+sum);
		
	}
}