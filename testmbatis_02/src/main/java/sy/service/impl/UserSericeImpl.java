package sy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserMapper;
import sy.model.User;
import sy.service.UserService;

@Service("userService")
public class UserSericeImpl implements UserService {
	private UserMapper userMapper;
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	public User gerUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
