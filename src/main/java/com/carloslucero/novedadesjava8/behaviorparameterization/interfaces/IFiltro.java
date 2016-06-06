package com.carloslucero.novedadesjava8.behaviorparameterization.interfaces;

/**
 * Created by carloslucero on 03/06/16.
 */
@FunctionalInterface
public interface IFiltro<T> {
    abstract Boolean test(T entidad);
}
