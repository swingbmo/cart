package io.swingbmo.cart;

import static org.junit.Assert.assertFalse;
import io.swingbmo.cart.model.CartInfo;
import io.swingbmo.cart.model.CartUser;
import io.swingbmo.cart.repo.CartInfoRepository;
import io.swingbmo.cart.repo.CartUserRepository;

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
	private CartUserRepository userRepo;
	@Autowired
	private CartInfoRepository cartInfoRepo;
	
	@Test
	public void testUserRepo() {
		List<CartUser> userlist = userRepo.findAll();
		assertFalse(StringUtils.isEmpty(userlist));
		System.out.println("============");
		userlist.forEach( x -> System.out.println(x.getAccount()));
	}
	
	@Test
	public void testCartInfoRepo() {
		List<CartInfo> cartInfolist = cartInfoRepo.findAll();
		assertFalse(StringUtils.isEmpty(cartInfolist));
		System.out.println("============");
		cartInfolist.forEach( x -> System.out.println(x.getTitle()));
	}
}
