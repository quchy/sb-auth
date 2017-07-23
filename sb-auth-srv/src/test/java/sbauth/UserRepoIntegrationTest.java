package sbauth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import sbauth.model.User;
import sbauth.repository.UserRepository;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;


/**
 * Created by quchy on 23/07/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class UserRepoIntegrationTest {

    @Autowired
    private UserRepository  userRepository;

    @Test
    public void testFindAll() {
        List<User> users= userRepository.findAll();
        assertThat(users.size(), is(greaterThanOrEqualTo(0)));
    }
}
