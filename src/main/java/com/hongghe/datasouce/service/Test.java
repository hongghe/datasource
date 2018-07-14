package com.hongghe.datasouce.service;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Long> parameterList =null;
        parameterList.add(1L);
        parameterList.add(2L);

        Gson gson = new Gson();
        JsonElement jsonElement = null;
        List<Long> newLists = Lists.newArrayList();
        JsonArray jsonElements = null;
    }
}
