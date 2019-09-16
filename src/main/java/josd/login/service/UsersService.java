package josd.login.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import josd.login.entity.Users;

@Mapper
public interface UsersService {
	//Retrieve all users
	public List<Map<String, Object>> resultUserList();
	//Insert a user
	public void registerUser(Users user);
	//Retrieve a user
	public List<Map<String, Object>> checkUserAuth(String user_id, String user_pw);
}
