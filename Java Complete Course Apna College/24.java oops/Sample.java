class Account {
    public String name;
    protected String email;
    private String password;
    public void setPassword(String password) {
        this.password = password;
        System.out.println(password);
    }
}

public class Sample {
    public static void main(String args[]) {
    Account a1 = new Account();
    a1.name = "Apna College";
    a1.setPassword("abcd");
    a1.email = "hello@apnacollege.com";
    System.out.println(a1.name);
    System.out.println(a1.email);
    //System.out.println(a1.password); not possible


    }
}