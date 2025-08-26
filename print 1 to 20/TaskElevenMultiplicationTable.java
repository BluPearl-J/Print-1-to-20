public class 	TaskElevenMultiplicationTable{
public static void main(String[]args){
TaskElevenMultiplicationTable taskelevenmultiplicationtable=new TaskElevenMultiplicationTable();
int h=5;
taskelevenmultiplicationtable.getMultiplication(h);
}



public void getMultiplication(int number){
for(int i=1;i<=50;i++){
int product=(number*i);
System.out.println(number + "*" + i +" " + "equals:"+ " " + product);
}
}
}

//why is it running despite passing argument into void method?