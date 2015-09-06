package fi.teaching.materials.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * An example of a test with dependency injection using the Mockito test framework
 *
 * @author Kamil Janowski
 */
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testFindUserWithUsername() throws Exception {
        String username = "john";
        User user = new User(username);
        Mockito.when(userRepository.findUserWithUsername(username)).thenReturn(user);

        User userFromTheService = userService.findUserWithUsername(username);

        Assert.assertSame(user, userFromTheService);
    }
}