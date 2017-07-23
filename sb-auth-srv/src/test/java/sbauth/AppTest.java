package sbauth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sbauth.controller.StaticController;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * Created by quchy on 21/07/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AppTest {

    @Test
    public void contextLoads() {
        assert(true);
    }

    @Test
    public void  testApp() {
        StaticController sc = new StaticController();
        String result = sc.index();
        assertThat(result, is(equalTo("index.html") ));
    }

}
