package sbauth.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sbauth.model.User;
import sbauth.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by zskucsak on 23/07/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class UserControllerTest {


    @InjectMocks
    private UserController uc;

    @Mock
    private UserRepository  userRepository;

    private List<User>   origUsers;


    @Before
    public void setUp() throws Exception {
        origUsers = new ArrayList<>();
        origUsers.add(new User(10L,"Test Name User1", "Test descr. User 1"));
        origUsers.add(new User(20L,"Test Name User2", "Test descr. User 2"));
        origUsers.add(new User(30L,"Test Name User3", "Test descr. User 3"));
    }

    @After
    public void tearDown() throws Exception {
        origUsers = null;
    }

    @Test
    public void list() throws Exception {
        // Setup repo
        when(userRepository.findAll()).thenReturn(origUsers);

        // test function get
        List<User> userList = uc.list();
        verify(userRepository).findAll();
        assertThat(userList, is(origUsers));
     }

    @Test
    public void create() throws Exception {
    }

    @Test
    public void get() throws Exception {
        // Setup repo
        User userSetup = origUsers.get(1);
        when(userRepository.findOne(userSetup.getId())).thenReturn(userSetup);

        // test function get
        User user = uc.get(userSetup.getId());
        verify(userRepository).findOne(userSetup.getId());
        assertThat(user.getId(), is(userSetup.getId()));
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}
