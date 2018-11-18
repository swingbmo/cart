package io.swingbmo.cart;

import io.swingbmo.cart.repo.CartAdminRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	CartAdminRepository adminRepo;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/","/static/**").permitAll();
				//.antMatchers("/admin/**").hasRole("ADMIN").anyRequest()
				//.authenticated().and().formLogin().permitAll()
				//.and().logout().permitAll();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		return new InMemoryUserDetailsManager(buildAdminUserDetails());
	}

	// build userdetail from database admin data
	private List<UserDetails> buildAdminUserDetails() {
		List<UserDetails> ds = adminRepo
				.findAll()
				.stream()
				.map(x -> User.withDefaultPasswordEncoder()
						.username(x.getAccount()).password(x.getPassword())
						.roles("ADMIN").build()).collect(Collectors.toList());
		ds.add(User.withDefaultPasswordEncoder()
						.username("aaa").password("123")
						.roles("USER").build());
		return ds;
	}
}
