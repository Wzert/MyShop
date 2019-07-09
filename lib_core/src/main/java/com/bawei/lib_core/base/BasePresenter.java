package com.bawei.lib_core.base;

import java.lang.ref.WeakReference;

/*
 *@Auther:王泽洋
 *@Date: 时间
 *@Description:功能
 * */
public class BasePresenter<M,V> {
    public M model;
    public V view;

    private WeakReference<V> vWeakReference;

    public void attach(M m,V v){
        model=m;
        vWeakReference=new WeakReference<>(v);
        view=vWeakReference.get();
    }
    public void detach(){
        if (vWeakReference!=null) {
            vWeakReference.clear();
            vWeakReference = null;
            this.view = null;
        }
    }
}
