package com.gafker.manage.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.gafker.common.utils.redis.ProtobuffSerializationUtil;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class RedisService {
	private static final Logger log = Logger.getLogger(RedisService.class);  
    private ShardedJedisPool shardedJedisPool; 
      
    /** 
     * @param key 
     * @param value 
     * @return 
     * 设置单个值 
     */  
    public String set(String key,Object value){  
        String result = null;  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return result;  
        }  
        try {  
            result = shardedJedis.set(key,new String(ProtobuffSerializationUtil.serialize(value),"ISO-8859-1"));  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
        } finally{  
            shardedJedis.close();  
        }  
        return result;  
    }  
    /** 
     * @param key 
     * @param value 
     * @return 
     * 设置List 
     */  
    @SuppressWarnings({ "unchecked", "rawtypes" })  
    public String setList(String key,List value){  
        String result = null;  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return result;  
        }  
        try {  
            result = shardedJedis.set(key,new String(ProtobuffSerializationUtil.serializeList(value),"ISO-8859-1"));  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
        } finally{  
            shardedJedis.close();  
        }  
        return result;  
    }     
    /** 
     * @param key 
     * @param value 
     * @return 
     * 设置单个值和有效时间 
     */  
    public String set(String key,Object value,int seconds){  
        String result = null;  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return result;  
        }  
        try {  
            result = shardedJedis.set(key,new String(ProtobuffSerializationUtil.serialize(value),"ISO-8859-1"));  
            expire(key, seconds);  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
        } finally{  
            shardedJedis.close();  
        }  
        return result;  
    }     
    /** 
     * @param key 
     * @param value 
     * @return 
     * 设置List和有效时间 
     */  
    @SuppressWarnings({ "unchecked", "rawtypes" })  
    public String setList(String key,List value,int seconds){  
        String result = null;  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return result;  
        }  
        try {  
            result = shardedJedis.set(key,new String(ProtobuffSerializationUtil.serializeList(value),"ISO-8859-1"));  
            expire(key, seconds);  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
        } finally{  
            shardedJedis.close();  
        }  
        return result;  
    }     
    /** 
     * @param key 
     * @param value 
     * @return 
     * 获取单个值 
     */  
    public <T> T get(String key,Class<T> clazz){  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return null;  
        }  
        try {  
            String resultStr = shardedJedis.get(key);  
            if(StringUtils.isEmpty(resultStr))  
                return null;  
            return ProtobuffSerializationUtil.deserialize(resultStr.getBytes("ISO-8859-1"), clazz);  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
            e.printStackTrace();  
        } finally{  
            shardedJedis.close();  
        }  
        return null;  
    }     
    /** 
     * @param key 
     * @param value 
     * @return 
     * 获取List 
     */  
    public <T> List<T> getList(String key,Class<T> clazz){  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return null;  
        }  
        try {  
            String resultStr = shardedJedis.get(key);  
            if(StringUtils.isEmpty(resultStr))  
                return null;  
            return ProtobuffSerializationUtil.deserializeList(resultStr.getBytes("ISO-8859-1"), clazz);  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
            e.printStackTrace();  
        } finally{  
            shardedJedis.close();  
        }  
        return null;  
    }     
    /** 
     * @param key 
     * @param value 
     * @return 
     * 判断key是否存在 
     */  
    public Boolean exists(String key){  
        Boolean result = false;  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return result;  
        }  
        try {  
            result = shardedJedis.exists(key);  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
        } finally{  
            shardedJedis.close();  
        }  
        return result;  
    }  
    /** 
     * @param key 
     * @param value 
     * @return 
     * 设置key的过期时间段 
     */  
    public Long expire(String key,int seconds){  
        Long result = null;  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return result;  
        }  
        try {  
            result = shardedJedis.expire(key, seconds);  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
        } finally{  
            shardedJedis.close();  
        }  
        return result;  
    }     
    /** 
     * @param key 
     * @param value 
     * @return 
     * 设置key的过期时间点 
     */  
    public Long expire(String key,long unixTime){  
        Long result = null;  
        ShardedJedis shardedJedis = shardedJedisPool.getResource();  
        if(shardedJedis == null){  
            return result;  
        }  
        try {  
            result = shardedJedis.expireAt(key, unixTime);  
        } catch (Exception e) {  
            log.error(e.getMessage(),e);  
        } finally{  
            shardedJedis.close();  
        }  
        return result;  
    }
}
