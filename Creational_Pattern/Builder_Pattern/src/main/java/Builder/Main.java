package Builder;

public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setUserId("101")
                .setUserName("Rahul")
                .setUserEmail("rahul@gmail.com")
                .build();

//        System.out.println(user.getUserId());
//        System.out.println(user.getUserName());
//        System.out.println(user.getUserEmail());

        System.out.println(user);


        User user1 = new User.UserBuilder()
                .setUserId("102")
                .setUserName("Sah")
                .setUserEmail("sah@gmail.com")
                .build();

//        System.out.println(user1.getUserId());
//        System.out.println(user1.getUserName());
//        System.out.println(user1.getUserEmail());

        System.out.println(user1);


    }
}