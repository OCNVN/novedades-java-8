package com.carloslucero.novedadesjava8.behaviorparameterization.interfaces;

/**
 * Created by carloslucero on 03/06/16.
 */
public interface IFiltro<T> {
    abstract Boolean filtrar(T entidad);
}
