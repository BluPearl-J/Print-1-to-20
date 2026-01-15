package DiaryApp;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Diary {
    private final String title;
    private final String body;
    private String userName;
    private String password;
    private boolean isLocked=true;
    private List <Entry> entries=new ArrayList<>();



 //
    public Diary{ String userName, String password){
    this.userName = userName;
    this.password = password;
}

// public void setPassword (String password){
//    this.password = password;
    }

            //  public String getPassword(){
            //  return  password;
    }

    public void setUserName(String userName){
    this.userName =userName;
    }

    public void getUserName{
    return userName;
    }

  public void lockDiary(){
    isLocked=true;
    System.out.println("Diary is locked");
    }

    public void unlockDiary(String String enterInputPassword;
    enterInputPassword){
    if(this.password.equals(enterInputPassword)) {
        isLocked = false;
        System.out.println("Diary is unlocked");
    }
    else{
        System.out.println("Invalid password");
    }

        public void createEntry(String title, String body){
            if (!isLocked) {
                int id = entries.size() + 1;
                Entry newEntry = new Entry(id, title, body);
                entries.add(newEntry);
                System.out.println("Entry created.");
            } else {
                System.out.println("Diary locked. unable to create a new entry.");


    }

    public Collection<Object> getEntries() {
        return entries;
    }

    public void setEntries(Collection<Object> entries) {
        this.entries = entries;
    }
}
