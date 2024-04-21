package com.tummosoft;

import java.lang.reflect.Method;
import java.util.Optional;

public class ParserTask{
    public void send(Class clazz, Method method) throws Exception {                
        method.invoke(clazz.newInstance());
        
    }
}

