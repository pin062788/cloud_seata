package com.alibaba.fescar.core.context;

import com.alibaba.fescar.common.loader.LoadLevel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weilz
 * @date 2019/6/16
 */
@LoadLevel(name = "ThreadLocalContextCore", order = Integer.MIN_VALUE)
public class ThreadLocalContextCore implements ContextCore {

    private ThreadLocal<Map<String, String>> threadLocal = new InheritableThreadLocal<Map<String, String>>() {
        @Override
        protected Map<String, String> initialValue() {
            return new HashMap<String, String>();
        }

    };

    public String put(String key, String value) {
        return threadLocal.get().put(key, value);
    }

    public String get(String key) {
        return threadLocal.get().get(key);
    }

    public String remove(String key) {
        return threadLocal.get().remove(key);
    }
}
