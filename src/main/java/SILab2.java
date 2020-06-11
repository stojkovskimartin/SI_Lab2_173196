import java.util.List;
import java.util.Scanner;


public class SILab2 {


    public static class User {
        String email; //A
        String username; //A
        String password; //A


        public User(String email, String username, String password) {
            this.email = email;
            this.username = username;
            this.password = password;
        }

        public User() {

        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        User user = new User(email, username, password);
        List<String> list = null;
        function(user, list);
    }

        public static boolean function(User user, List<String> allUsers) {
            String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //B
            if (user!=null) { //C
                if (user.getUsername()!=null && user.getPassword()!=null) { //D
                    String password = user.getPassword(); //E
                    String passwordLower = password.toLowerCase(); //E
                    if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) { //F
                        boolean digit = false, upper = false, special = false; //G
                        for (int i=0;i<password.length();i++) { //H
                            if (Character.isDigit(password.charAt(i))) //I
                                digit = true; //J
                            if (Character.isUpperCase(password.charAt(i))) //K
                                upper = true; //L
                            if (specialCharacters.contains(String.valueOf(password.charAt(i)))) //M
                                special = true; //N
                        }
                        if (digit && upper && special) //O
                            return true; //P
                    }
                }
            }
            return false; //Q
        }
    }

