package com.mengmiao.util;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassUtils {

	/**
	 * 判断类是否有继承或实现关系，判断方法是否是override
	 * 
	 * @param source
	 * @return
	 */
	public boolean isWithoutHierarchy(AnnotatedElement source) {
		if (source == Object.class) {
			return false;
		}
		if (source instanceof Class) {
			Class<?> clazz = (Class<?>) source;
			return clazz.getSuperclass() == Object.class && clazz.getInterfaces().length == 0;
		}
		if (source instanceof Method) {
			Method sourceMethod = (Method) source;
			return Modifier.isPrivate(sourceMethod.getModifiers())
					&& isWithoutHierarchy(sourceMethod.getDeclaringClass());
		}
		return false;
	}

}
