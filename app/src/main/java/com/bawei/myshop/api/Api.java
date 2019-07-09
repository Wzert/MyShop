package com.bawei.myshop.api;

/*
 *@Auther:王泽洋
 *@Date: 时间
 *@Description:功能
 * */
public class Api {

    public static final String BASE="http://172.17.8.100/";
    //登录
    public static final String LOGIN="small/user/v1/login/";
    public static final String REGISTE="small/user/v1/register/";
    //展示主页
    public static final String SHOPLIST="small/commodity/v1/commodityList";
    public static final String BANNER="small/commodity/v1/bannerShow";

    //购物车
    public static final String SHOPCAR="small/order/verify/v1/findShoppingCart/";
    //用户
    public static final String USER="small/user/verify/v1/getUserById";
    //上传头像
    public static final String HEADPIC="small/user/verify/v1/modifyHeadPic";
    //详情
    public static final String DETAILS="small/commodity/v1/findCommodityDetailsById";
    //订单
    public static final String DINGDAN="small/order/verify/v1/findOrderListByStatus";
    public static final String DELETE="small/order/verify/v1/deleteOrder";
}
