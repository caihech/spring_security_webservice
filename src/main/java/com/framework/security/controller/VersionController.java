package com.framework.security.controller;

import com.framework.security.utils.PropertiesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by caihe on 2019/4/24.
 */

@RestController
@RequestMapping("/versions")
public class VersionController {

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public Map getVersions() {
        Map<String, String> versionMap = new HashMap<>(16);
        versionMap.put("name", PropertiesUtils.getProperty("name"));
        versionMap.put("version", PropertiesUtils.getProperty("version"));
        Calendar calendar = Calendar.getInstance();
        versionMap.put("time", String.valueOf(calendar.getTimeInMillis()));
        return versionMap;
    }
}
