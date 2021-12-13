package builder;

import junit.framework.TestCase;
import lombok.ToString;

public class UserTest extends TestCase {
    public void testUser() {
        User user = User.builder().age(18).gender("male").weight(75).height(195).race("caucasian").build();
        String s = "User(name=null, age=18, gender=male, weight=75, height=195, race=caucasian)";
        assertEquals(s, user.toString());
    }
}