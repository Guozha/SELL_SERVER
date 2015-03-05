/**
 * 
 */
package com.guozha.sellserver.framework.log;

import com.guozha.sellserver.framework.sys.business.BusinessObject;

/**
 * @author peng.shi
 *
 */
public interface LogType extends BusinessObject
{
	String getId();
	
	String getDefine();
	
	void setDefine();
	
	String getName();
	
	void setName();
	
}
