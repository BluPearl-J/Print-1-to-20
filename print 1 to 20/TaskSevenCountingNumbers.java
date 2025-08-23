public class TaskSevenCountingNumbers{
public static void main(String[]args){

int count=0;
for(int i=1;i<=100;i++){
if(i%7==0){
count++;
System.out.println(i);
}
}
System.out.println("Total Counting of allwhole Numbers between 1 to 100 divisible by 7 is:" + count);
}
}