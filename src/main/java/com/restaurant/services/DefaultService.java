package com.restaurant.services;

import java.util.List;

/**
 * Generic service
 * 
 * @author bthuan
 *
 * @param <T>
 */
public interface DefaultService<T> {

    public void create( T object );

    public List<T> getAll();

    public T getById( int id );

    public void updateById( int id, T object );

    public void deleteById( int id );

}
