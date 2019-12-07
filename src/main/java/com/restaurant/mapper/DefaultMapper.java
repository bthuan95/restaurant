package com.restaurant.mapper;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;

/**
 * The abstract class to define mapper method
 * 
 * @author bthuan
 *
 */
public abstract class DefaultMapper {

    private ModelMapper modelMapper = new ModelMapper();

    /**
     * Convert object
     *
     * @param object
     * @param classOfT
     * @return
     */
    public <T> T convertObject( Object object, Class<T> classOfT ) {
	return modelMapper.map( object, classOfT );
    }

    /**
     * Convert list
     *
     * @param sourceList
     * @param targetClass
     * @return
     */
    public <S, T> List<T> convertList( List<S> sourceList, Class<T[]> targetClass ) {
	return Arrays.asList( modelMapper.map( sourceList, targetClass ) );
    }

}
