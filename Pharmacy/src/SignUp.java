import java.io.IOException;
import java.util.Scanner;
public class SignUp {
    String userName,passWord,user_Name="Amir",pass_Word="1234aa";
    public SignUp(String userN,String pass)
    {

        this.userName=userN;
        this.passWord=pass;


    }
    void method()throws IOException {
        throw new IOException("Input wrong Password");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

   /* SignUp sign=new SignUp(userName,passWord);

    String tru=sign.equals(userName,user_Name);

    private String equals(String userName, String user_Name) {
        return tru;
    }

    */

    public String getUser_Name() {
        return user_Name;
    }

    public String getPass_Word() {
        return pass_Word;
    }

    @Override
    public String toString() {
        return "User Name: "+userName+"\n"+"Password: "+passWord;
    }
}
