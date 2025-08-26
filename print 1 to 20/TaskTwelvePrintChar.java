public class TaskTwelvePrintChar{
public static void main(String[]args){
getAllChars("elephant");
}

public static void getAllChars(String word){
int count=0;
for(int index=0;index<word.length();index++){

count++;
System.out.println(word.charAt(index));
}


System.out.println("Total word count of" + word+ "is:" + count);
}

}
