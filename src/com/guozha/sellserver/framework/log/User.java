/**
 * 
 */
package com.guozha.sellserver.framework.log;

import com.guozha.sellserver.framework.sys.business.BusinessObject;

/**
 * @author peng.shi
 *
 */
public interface User extends BusinessObject
{
	public String getId();
	
	public String getUserName();
	
	public void setUserPwd(String value) ;
	
	public String getUserPwd();
	
	public void setBalanceCredit(Integer value);
	
	public Integer getBalanceCredit();
}
