package entity;

public class User {
    private Integer userId;
    private String userName;
    private String role;
    private String phoneNum;
    private String email;
    private String passWord;

    // Constructor for creation of new user
    // Required information: name,role,phonenumber,password
    // Others information if not provided will be set default to Null
    public User(Integer userId, String userName, String role, String phoneNum, String email, String passWord) {
        this.userId = userId;
        this.userName = userName;
        this.role = role;
        this.phoneNum = phoneNum;
        this.email = email;
        this.passWord = passWord;
    }

    public User(String userName, String role, String phoneNum, String passWord) {
        this.userId = null;
        this.userName = userName;
        this.role = role;
        this.phoneNum = phoneNum;
        this.email = null;
        this.passWord = passWord;
    }

    public User(String userName, String role, String phoneNum, String email, String passWord) {
        this.userId = null;
        this.userName = userName;
        this.role = role;
        this.phoneNum = phoneNum;
        this.email = email;
        this.passWord = passWord;
    }

    // Getter for userId
    public Integer getUserId() {
        return userId;
    }

    // Getter/Setter for username
    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        if (name != null) {
            this.userName = name;
        } else {
            System.out.println("User name cannot be empty");
        }
    }

    // Getter/Setter for role
    public String getRole() {
        return role;
    }

    public void setRole(String newRole) {
        if (newRole != null) {
            this.role = newRole;
        } else {
            System.out.println("Role cannot be empty");
        }
    }

    // Getter/Setter for phoneNum
    public String getPhone() {
        return phoneNum;
    }

    public void setPhone(String newPhone) {
        if (newPhone != null && newPhone.length() <= 15) {
            this.phoneNum = newPhone;
        } else {
            System.out.println("Invalid phone number");
        }
    }

    // Getter/Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String newMail) {
        if (newMail != null) {
            this.email = newMail;
        } else {
            System.out.println("Email can't be null");
        }
    }

    // Getter/Setter for password
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String newPassWord) {
        if (newPassWord != null  ) {
            this.passWord = newPassWord;
        } else {
            System.out.println("Fail to update password");
        }
    }
}
