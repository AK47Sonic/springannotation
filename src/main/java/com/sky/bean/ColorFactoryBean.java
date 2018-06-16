package com.sky.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class ColorFactoryBean implements FactoryBean{
    @Nullable
    @Override
    public Object getObject() throws Exception {
        System.out.println("getObject");
        return new Color();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
