package josd.login.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import josd.login.entity.Users;
import josd.login.service.UsersService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UsersController {
	public static final Logger logger = org.slf4j.LoggerFactory.getLogger(UsersController.class);
	
	@Autowired
	private UsersService userService;
	
	@RequestMapping(path = "/alluser")
	public String getUserAuth(){
		
		List<Map<String,Object>> authchk = userService.resultUserList();
		
		return ((List)authchk).toString();
	}
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(path = "/registerUser")
	public ResponseEntity<?> registerUser(@RequestBody Users user) {
		logger.info("Creating User : {}", user);

		userService.registerUser(user);
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(path = "/chkauth")
	public String chkUserAuth(@RequestParam("user_id") String user_id, @RequestParam("user_pw") String user_pw) {
		logger.info("Check User authority : {}", user_id +", "+user_pw);
		String result = "Success";
		List<Map<String,Object>> chkuser = userService.checkUserAuth(user_id, user_pw);
		System.out.println("result= "+((List)chkuser).toString());
		
		if(chkuser.size() < 1) {
			result = "There is no username : "+user_id;
		}
		
		
		
		return result;
	}
	
}
