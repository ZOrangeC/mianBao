package com.orange.mianbao.constant;

/**
 * Redis常量
 */

public interface RedisConstant {
    /**
     * 用户签到记录的Redis key 前缀
     */

    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins";

    /**
     * 获取用户签到的Redis Key
     * @param year
     * @param userId
     * @return
     */
    static String getUserSignInRedisKey(int year,long userId){
        return String.format("%s,%s,%S",USER_SIGN_IN_REDIS_KEY_PREFIX,year,userId);
    }

}
