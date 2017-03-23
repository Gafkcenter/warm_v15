package com.gafker.manage.format;

public interface FormatExchange <T>{
public T toObject(String entity);
public String toJsonString(T entity);
}
