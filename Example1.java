public class Example1{
public static void main(String[] args){
int i=153;
int temp=i;
int sum=0;
while(i>0){
int rem=i%10;
sum=sum+(rem*rem*rem);
i=i/10;
}
System.out.println((temp==sum)?"Amstrong number":"!amstrong");
}
}