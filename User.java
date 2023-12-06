import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean isLogin =false;
    private List<User> listUserave = new ArrayList<>();

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public void logout(){
        isLogin = false;
        System.out.println("Keni dal me sukses");
    }

    public User() {
    }

    static Scanner scan = new Scanner(System.in);
    public boolean isLogin(String email,String password){
        for (User a:listUserave) {
            if (a.getEmail().equals(email)&& a.getPassword().equals(password)){
                isLogin=true;
                return true;
            }
        }
        return false;

    }
    public void metodatHyrese(){
        System.out.println("-------Receta-------");
        System.out.println("1.LogIn");
        System.out.println("2.SignUp");
        int userAns = scan.nextInt();
        scan.nextLine();
        if (userAns==1){
            signIn();
        } else if (userAns==2) {
            signUp();
        }
    }


    public void signIn(){
        //Leart test user
        listUserave.add(new User("Leart","Buqaj","leartbuqaj9@gmail.com","111"));

        System.out.println("Shkruaj email");
        email = scan.nextLine();
        System.out.println("Shkruaj passwordin");
        password = scan.nextLine();

        if (isLogin(email,password)){
            System.out.println("Keni Hyre");
            System.out.println("Miresevini");
            System.out.println("Deshironi te dilni? (po/jo)");
            String logOut = scan.nextLine();
            if (logOut.equals("po")){
                logout();
            } else if (logOut.equals("jo")) {
                metodatHyrese();
            }
        }else {
            System.out.println("Te dhenat e pa sakta provoni perseri");
        }
    }

    public void signUp(){
        System.out.println("Emri");
        name = scan.nextLine();
        System.out.println("Mbiemri");
        surname = scan.nextLine();
        System.out.println("Email");
        email = scan.nextLine();
        System.out.println("Password");
        password = scan.nextLine();

        if (name==null&&surname==null){
            System.out.println("Shkruaj te dhenat");
        }else {
            System.out.println("Llogaria u krijua me sukses");
            listUserave.add(new User(name,surname,email,password));
        }
    }
    public boolean isUserLogin() {
        return isLogin;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;

    }
}
