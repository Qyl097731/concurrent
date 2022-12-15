package com.nju.concurrent.ch03;

import java.util.HashSet;
import java.util.Set;

/**
 * @description 发布和逃逸测试
 * @date:2022/12/15 21:37
 * @author: qyl
 */
public class EscapeTest {
    // 发布UnsafeState，同时把内部的私有数据都发布了
    public static Set<UnsafeState> knowStates;

    public void initialize() {
        knowStates = new HashSet<> ( );
    }
}

class UnsafeState {
    private String[] states = new String[]{"ABC", "ACD"};

    public String[] getStates() {
        return states;
    }

    public void setStates(String[] states) {
        this.states = states;
    }
}
