package com.guozha.sellserver.framework.timer;

import java.util.Collection;

public interface TaskParse {
	
	Collection<TaskUnit> getTaskUnits();
	
	TaskUnit getTaskUnit(String name);

}
