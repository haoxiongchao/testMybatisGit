package sy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sy.model.User;
import sy.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserMappercontroller {
	@Resource
	private UserService userService;
	
//	public UserService getUserService() {
//		return userService;
//	}
//	@Autowired
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}

	@RequestMapping("/showUser/{id}")
	public String showUser(@PathVariable String id,HttpServletRequest request){
		User u = userService.gerUserById(id);
		request.setAttribute("user", u);
		return "showUser";
	}
}	
