/**
 * 
 */
package com.guozha.sellserver.framework.log;

import com.guozha.sellserver.framework.sys.business.BusinessObject;

/**
 * @author peng.shi
 *
 */
public interface AuditLog extends BusinessObject
{
	String getId();
	
	LogType getLogType();
	
}
