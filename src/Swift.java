
public class Swift {
	public static void main(String a[]){
		try{
			int val = 15; 
			int[] fib = new int[val];
			fib[0]=0;
			fib[1]=1;
			System.out.println(fib[0]+" \n"+fib[1]);
			for(int i = 2; i < 15; i++){
				int flag = 0;
				fib[i]=fib[i-1]+fib[i-2];

				if(fib[i]%3 == 0 && fib[i]%5==0){
					System.out.println("FizzBuzz");
				}
				else if(fib[i]%3==0){
					System.out.println("Buzz");
				}
				else if(fib[i]%5==0){
					System.out.println("Fizz");
				}
				else if((fib[i]!=3 || fib[i] != 5) && (fib[i]>2)){

					for(int x = 1; x <=fib[i]; x++){

						if(fib[i]%x == 0){

							flag++;	
						}
					}
					if(flag == 2){
						System.out.println("BuzzFizz");
						flag=0;
					}
					else if(flag>2){
						System.out.println(fib[i]);
					}
				}

				else {
					System.out.println(fib[i]);
				}
	}
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
