package io.swingbmo.cart;

import static org.junit.Assert.*;
import io.swingbmo.cart.model.User;
import io.swingbmo.cart.repo.UserRepository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {

	@Autowired
	private UserRepository userRepo;
	
	@Test
	public void testJpa() {
		List<User> userlist = userRepo.findAll();
		assertFalse(StringUtils.isEmpty(userlist));
		System.out.println("============");
		userlist.forEach( x -> System.out.println(x.getAccount()));
		System.out.println("============");
	}
}
