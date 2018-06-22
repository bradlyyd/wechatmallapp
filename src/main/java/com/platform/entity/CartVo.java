package com.platform.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-15 08:03:39
 */
public class CartVo implements Serializable {
    private static final long serialVersionUID = 1L;

    //涓婚敭
    private Integer id; 
    //浼氬憳Id
    private Long user_id;
    //sessionId
    private String session_id;
    //鍟嗗搧Id
    private Integer goods_id;
    //鍟嗗搧搴忓垪鍙�
    private String goods_sn;
    //浜у搧Id
    private Integer product_id;
    //浜у搧鍚嶇О
    private String goods_name;
    //甯傚満浠�
    private BigDecimal market_price;
    //闆跺敭浠锋牸
    private BigDecimal retail_price;
    //product琛ㄤ腑鐨勯浂鍞环鏍�
    private BigDecimal retail_product_price;
    //鏁伴噺
    private Integer number;
    //瑙勬牸灞炴�х粍鎴愮殑瀛楃涓诧紝鐢ㄦ潵鏄剧ず鐢�
    private String goods_specifition_name_value;
    //product琛ㄥ搴旂殑goods_specifition_ids
    private String goods_specifition_ids;
    //
    private Integer checked;
    // 鑺傜渷閲戦
    private BigDecimal crash_save_price;

    //鍟嗗搧鍥剧墖
    private String list_pic_url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(String goods_sn) {
        this.goods_sn = goods_sn;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public BigDecimal getMarket_price() {
        return market_price;
    }

    public void setMarket_price(BigDecimal market_price) {
        this.market_price = market_price;
    }

    public BigDecimal getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(BigDecimal retail_price) {
        this.retail_price = retail_price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getGoods_specifition_name_value() {
        return goods_specifition_name_value;
    }

    public void setGoods_specifition_name_value(String goods_specifition_name_value) {
        this.goods_specifition_name_value = goods_specifition_name_value;
    }

    public String getGoods_specifition_ids() {
        return goods_specifition_ids;
    }

    public void setGoods_specifition_ids(String goods_specifition_ids) {
        this.goods_specifition_ids = goods_specifition_ids;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public String getList_pic_url() {
        return list_pic_url;
    }

    public void setList_pic_url(String list_pic_url) {
        this.list_pic_url = list_pic_url;
    }

    public BigDecimal getRetail_product_price() {
        return retail_product_price;
    }

    public void setRetail_product_price(BigDecimal retail_product_price) {
        this.retail_product_price = retail_product_price;
    }

    public BigDecimal getCrash_save_price() {
        if (null == crash_save_price && null != retail_product_price && null != retail_price) {
            crash_save_price = retail_product_price.subtract(retail_price);
        }
        return crash_save_price;
    }

    public void setCrash_save_price(BigDecimal crash_save_price) {
        this.crash_save_price = crash_save_price;
    }
}
