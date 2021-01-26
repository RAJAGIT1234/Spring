package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class BankLoanMgmt_CalculateIntrestAmountReplace implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("BankLoanMgmt_CalculateIntrestAmountReplace.reimplement(--)::simple intrest amount");
		float pAmt=0.0f;
		float time=0.0f;
		float rate=0.0f;
		//get target/orginal method arg values
		pAmt=(float)args[0];
		time=(float)args[1];
		rate=(float)args[2];
		
		//write new logic
		return pAmt*rate*time/100;
	}

}
