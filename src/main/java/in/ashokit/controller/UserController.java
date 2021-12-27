package in.ashokit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.enity.User;
@Controller
public class UserController {
	
	@GetMapping("/user")
	public ModelAndView userInfo()
	{
		ModelAndView modelAndView = new ModelAndView();
		
		ArrayList<User> arrayList = new ArrayList<>();

		User user1 = new User(101, "Sourabh", "ssk@gmail.com");
		User user2 = new User(102, "Suraj", "ssm@gmail.com");
		User user3 = new User(103, "Ashish", "arj@gmail.com");
		User user4 = new User(104, "Pooja", "pss@gmail.com");
		User user5 = new User(105, "Dhiraj", "dsm@gmail.com");
		
		arrayList.add(user1);
		arrayList.add(user2);
		arrayList.add(user3);
		arrayList.add(user4);
		arrayList.add(user5);
		
		modelAndView.addObject("user", arrayList);
		modelAndView.setViewName("userinfo");
		return modelAndView;
		
	}
	

}
