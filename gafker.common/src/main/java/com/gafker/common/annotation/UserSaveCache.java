package com.gafker.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;

/**
 * @author     peiyu
 */
@Caching(put = {
		@CachePut(value = "user", key = "'user_id_'+#user.id"),  
		@CachePut(value = "user", key = "'user_username_'+#user.username")
})
@Target({ElementType.METHOD, ElementType.TYPE})  
@Retention(RetentionPolicy.RUNTIME)  
@Inherited  
public @interface UserSaveCache {
}
