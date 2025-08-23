public class TaskSeventeenCountChar{
public static void main(String[]args){
TaskSeventeenCountChar taskseventeencountchar=new TaskSeventeenCountChar();
int result=taskseventeencountchar.countAlphabets("Elephant");
System.out.println("The letter 'e' occurs " + result + " times in the string.");
}

public static int countAlphabets(String s){
int count=0;
//step1 identifying and displaying all digits 
for(int i=0;i<s.length();i++){
if(Character.toLowerCase(s.charAt(i)) == 'e'){
count++;
}
}
return count;
}
}


//Count how many Digits are in a given Number