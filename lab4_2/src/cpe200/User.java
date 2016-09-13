package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public boolean setUserName(String name) {

        this.userName = name;
        String pettern = "[a-zA-Z][a-zA-Z0-9]+";

        if (name.matches(pettern) && name.length()>=8) {
            this.userName =name;
            return true;
        }


        else {
            return false;
        }
    }

    public boolean setPassword(String name) {

        this.password = name;
        String pettern = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]+";
        if (name.matches(pettern) && (name.length() >= 12)) {
            this.password = name;
            return true;
        }


        else {
            return false;
        }
    }

    public String getUserName() {
        return this.userName;

    }

    public String getPassword() {
        return this.password;
    }
}
