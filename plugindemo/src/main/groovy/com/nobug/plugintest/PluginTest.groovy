package com.nobug.plugintest;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * 插件测试
 */
public class PluginTest implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        def log = project.logger;
        log.error("test11111111111111111");

    }
}
