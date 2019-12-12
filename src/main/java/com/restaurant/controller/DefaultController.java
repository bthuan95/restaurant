package com.restaurant.controller;

import java.util.List;

/**
 * Generic controller
 * 
 * @author bthuan
 *
 * @param <T>
 */
public interface DefaultController<T> {

    public void create( T object );

    public List<T> getAll();

    public T getById( int id );

    public void updateById( int id, T object );

    public void deleteById( int id );

}
