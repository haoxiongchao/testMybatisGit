package sy.dao;

import sy.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
    
    User selectByPrimaryKey(String id);
}