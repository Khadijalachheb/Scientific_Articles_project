package ma.ensa.presentation;

@Controller
public class HomeController {
	
	@RequestMapping("/welcome")
	return "home.jsp";

	@RequestMapping("/login")
	return "login.jsp";
	
	@RequestMapping("/register")
	return "register.jsp";
}
