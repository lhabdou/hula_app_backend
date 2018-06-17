/**
 * 
 */
package com.hula.utils;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import com.hula.mapper.CategorieMapper;
import com.hula.mapper.CodeCouleurMapper;
import com.hula.mapper.ProduitMapper;

/**
 * @author asoilihi
 *
 */
public class UtilsConstructorPrivateTest {
	

	@Test
	public void testCategorieMapperConstructeur() throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<CategorieMapper> constructor = CategorieMapper.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()));
		constructor.setAccessible(true);
		constructor.newInstance();
	}
	
	@Test
	public void testProduitMapperMapperConstructeur() throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<ProduitMapper> constructor = ProduitMapper.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()));
		constructor.setAccessible(true);
		constructor.newInstance();
	}
	
	@Test
	public void testCodeCouleurMapperConstructeur() throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<CodeCouleurMapper> constructor = CodeCouleurMapper.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()));
		constructor.setAccessible(true);
		constructor.newInstance();
	}

}
