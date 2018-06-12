package com.ssn.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.ssn.reflections.Entity.BMW;

public class REf1 {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//1) instantiating new object
		BMW obj = new BMW();
		
		//2) getting reflex objecct
		Class cls = obj.getClass();
		
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getName());
		System.out.println(cls.getSuperclass());
		System.out.println(cls.getModifiers());
	
		System.out.println(cls.isLocalClass());
		System.out.println(cls.getInterfaces());
		
		
		try {
			Method BMWputeGare = cls.getDeclaredMethod("puteGare",int.class);
			Method BMWincreaseGear = cls.getDeclaredMethod("increaseGear");
			
			
			BMWputeGare.invoke(obj, 5);
			BMWincreaseGear.invoke(obj);
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
