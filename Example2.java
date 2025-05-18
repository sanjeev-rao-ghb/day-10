public class Example2{

public int getFactorialOfNumber(int num){
if(num<0)
return -1;
int fact=1;
for(int i=1;i<=num;i++){
fact=fact*i;
}
return fact;
}
public static void main(String [] args){
Example2 obj= new Example2();
int result= obj.getFactorialOfNumber(6);
System.out.println("Factorial result:"+result);
}
}

