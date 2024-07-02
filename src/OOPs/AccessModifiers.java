
package OOPs;

class Account {
    public String name;
    protected String email;
    private  String password;


    //getters and setters for allow private data access
    public String getPassword(){
        return  this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Pankaj Naik";
        a1.email = "pankajnaik122@gmail.com";
        a1.setPassword("abce");
        System.out.println(a1.getPassword());
    }
}