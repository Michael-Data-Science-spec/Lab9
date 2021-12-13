package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().age(18).gender("male").weight(75).height(195).race("caucasian").build();
        System.out.println(user);
    }
}
