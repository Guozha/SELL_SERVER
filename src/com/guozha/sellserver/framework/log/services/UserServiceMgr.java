/**
 * 
 */
package com.guozha.sellserver.framework.log.services;

import java.util.List;

import com.guozha.sellserver.framework.exception.ObjectDuplicateException;
import com.guozha.sellserver.framework.log.User;
import com.guozha.sellserver.framework.sys.business.BusinessObjectServiceMgr;

/**
 * @author peng.shi
 *
 */
public interface UserServiceMgr extends BusinessObjectServiceMgr
{
	
	public static final String SERVICE_NAME = "userServiceMgr";
	
	/**
	 * 创建User
	 * @param usename
	 * @param password
	 * @return
	 */
	User createUser(String usename,String password);
	
	/**
	 * 添加User
	 * @param user
	 * @return
	 * @throws ObjectDuplicateException
	 */
	User addUser(User user) throws ObjectDuplicateException;
	
	/**
	 * 更新User
	 * @param user
	 * @return
	 */
	User updateUser(User user);
	
	/**
	 * 获取Users，条件Username like
	 * @param username
	 * @return
	 */
	List<User> getUsers();
	
}
