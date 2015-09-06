package fi.teaching.materials.services;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Example service that contains
 *
 * @author Kamil Janowski
 */
public class UserService {

   /**
    * @Autowired comes from the spring framework, but depending on what framework you choose,
    * it might as well be something else, like for instance @Inject (available with EJBs and JAX-RS)
    */
   @Autowired
   private UserRepository userRepository;

   public User findUserWithUsername(String username) {
      return userRepository.findUserWithUsername(username);
   }
}
