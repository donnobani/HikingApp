package user_module_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;
import user_module.User;
import user_module.UserTreeMapStore;
import user_module.UserType;
import utilities.Initializer;

public class UserStoreTest {

	@Test
	public void testFind() {

	User targetUser = new User("beep","boop",UserType.ADMIN);
	UserTreeMapStore userStore = new UserTreeMapStore();
	userStore.addAll(Initializer.emitUsers(100));
	userStore.add(targetUser);
	userStore.display();
	
	Set<User> resultSet = userStore.find(t->t.compareTo(targetUser)==0);
	User resultUser = resultSet.iterator().next();
	
	assertEquals(targetUser, resultUser);
	}

}
