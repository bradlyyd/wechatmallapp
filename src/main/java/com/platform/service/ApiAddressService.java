package com.platform.service;

import com.platform.dao.ApiAddressMapper;
import com.platform.entity.AddressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ApiAddressService {
    @Autowired
    private ApiAddressMapper apiAddressMapper;


    public AddressVo queryObject(Integer id) {
        return apiAddressMapper.queryObject(id);
    }


    public List<AddressVo> queryList(Map<String, Object> map) {
        return apiAddressMapper.queryList(map);
    }


    public int queryTotal(Map<String, Object> map) {
        return apiAddressMapper.queryTotal(map);
    }


    public void save(AddressVo address) {
        apiAddressMapper.save(address);
    }


    public void update(AddressVo address) {
        apiAddressMapper.update(address);
    }


    public void delete(Integer id) {
        apiAddressMapper.delete(id);
    }


    public void deleteBatch(Integer[] ids) {
        apiAddressMapper.deleteBatch(ids);
    }

}
