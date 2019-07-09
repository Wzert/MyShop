package com.bawei.myshop.api;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

/*
 *@Auther:王泽洋
 *@Date: 时间
 *@Description:功能
 * */
public interface ApiLoginRegsite {
    @POST(Api.LOGIN)
    @FormUrlEncoded
    Observable<ResponseBody> login(@FieldMap HashMap<String,String> map);

    @POST(Api.REGISTE)
    @FormUrlEncoded
    Observable<ResponseBody> registe(@FieldMap HashMap<String,String> map);
}
