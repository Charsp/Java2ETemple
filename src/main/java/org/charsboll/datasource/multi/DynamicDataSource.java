package org.charsboll.datasource.multi;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource { 
	@Override
	protected Object determineCurrentLookupKey() {
		return CustomerContextHolder.getDBType();
	}

}
