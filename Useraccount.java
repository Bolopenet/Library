public class Useraccount {


    public Useraccount(String username, String password,String inpUser,String inpPass) {
        this.username = username;
        this.password = password;
        this.inpUser=inpUser;
        this.inpPass=inpPass;


    }

    private String username;
    private String password;
    private String inpUser;
    private String inpPass;
    public String line;


    public boolean checkPassword() {


        if (inpUser.equals(username) && inpPass.equals(password)) {
            return true;
        } else {
            return false;
        }

    }
    public void deactivateAccount()
    {
        boolean active = false;
    }

}


