package org.acceptance.utils;

import java.lang.reflect.InvocationTargetException;

import org.acceptance.database.TestDatabaseDAO;
import org.acceptance.handler.Validatorhandler;
import org.springframework.beans.factory.annotation.Autowired;

public class VerificationHandler {

	@Autowired
	private TestDatabaseDAO testdatabasedao;

	public void verification(String id) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Validatorhandler.executeHandler(id, CustomerUtils.expectedCustomer(id), testdatabasedao);
	}
	
	public void insertData(String id) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		testdatabasedao.insertCustomer(CustomerUtils.createNewCustomer(CustomerUtils.inputCustomer(id),id));
	}
	
public void deleteData(String id) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		testdatabasedao.deleteCustomer(id);
	}


}
