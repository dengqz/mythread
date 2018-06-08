package innerStaticClass;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class PublicClass {
    static private String username;
    static private String password;
    static class PrivateClass{
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public void printPublicProperty(){
            System.out.println(username+" "+password);
        }
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        PublicClass.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        PublicClass.password = password;
    }
}
