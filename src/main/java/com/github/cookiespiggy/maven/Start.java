package com.github.cookiespiggy.maven;

import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class Start {
    public static void main(String[] args) {
        Yaml yaml = new Yaml();
        Map map = yaml.loadAs(Start.class.getResourceAsStream("/es/test.yml"), Map.class);
        System.out.println(map);
        System.out.println(((Map) map.get("params")).get("url"));
    }
}
