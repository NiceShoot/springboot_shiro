package com.boot.cn.common.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.util.List;


public class MyJavaMapperPlugin extends PluginAdapter {
	@Override
	public boolean validate(List<String> arg0) {
		return true;
	}

	public void initialized(IntrospectedTable introspectedTable){		
	    String baseEntity = introspectedTable.getBaseRecordType();
	    String baseExample = baseEntity + "Example";
	    String value = "com.jiabing.com.common.base.BaseMapper<" + baseEntity + ","+ baseExample + ">";
	    introspectedTable.getContext().getJavaClientGeneratorConfiguration().addProperty("rootInterface", value);	    	    
	}
}
