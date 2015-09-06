package fi.teaching.materials.services;

/**
 * Interface for the UserRepository. Normally the repository would connect to the database and retrieve the appropriate user information.
 * In this example it doesn't, since we only want to see tests with dependency injection and this is the interface that will be actually injected and mocked in the test
 *
 * @author Kamil Janowski
 */
public interface UserRepository {

    User findUserWithUsername(String username);
}
