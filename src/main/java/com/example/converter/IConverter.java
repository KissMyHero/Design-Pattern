package com.example.converter;

@FunctionalInterface
public interface IConverter<T, U>{

    T convert( U u);
}
