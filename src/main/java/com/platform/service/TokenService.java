package com.platform.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.dao.ApiTokenMapper;
import com.platform.entity.TokenEntity;
import com.platform.util.JwtUtils;
import com.platform.utils.CharUtil;


@Service
public class TokenService {
    
	@Autowired
    private ApiTokenMapper apiTokenMapper;
    //12小时后过期
    private final static int EXPIRE = 3600 * 12;

    public TokenEntity queryByUserId(Long userId) {
        return apiTokenMapper.queryByUserId(userId);
    }

    public TokenEntity queryByToken(String token) {
        return apiTokenMapper.queryByToken(token);
    }

    public void save(TokenEntity token) {
        apiTokenMapper.save(token);
    }

    public void update(TokenEntity token) {
        apiTokenMapper.update(token);
    }

    public Map<String, Object> createToken(long userId) {
        //生成一个token
        String token =JwtUtils.createJWT(userId+"", "token");
        //当前时间
        Date now = new Date();

        //过期时间
        Date expireTime = new Date(now.getTime() + EXPIRE * 1000);

        //判断是否生成过token
//        TokenEntity tokenEntity = queryByUserId(userId);
//        if (tokenEntity == null) {
//            tokenEntity = new TokenEntity();
//            tokenEntity.setUserId(userId);
//            tokenEntity.setToken(token);
//            tokenEntity.setUpdateTime(now);
//            tokenEntity.setExpireTime(expireTime);
//
//            //保存token
//            save(tokenEntity);
//        } else {
//            tokenEntity.setToken(token);
//            tokenEntity.setUpdateTime(now);
//            tokenEntity.setExpireTime(expireTime);
//
//            //更新token
//            update(tokenEntity);
//        }

        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("expire", EXPIRE);

        return map;
    }
}