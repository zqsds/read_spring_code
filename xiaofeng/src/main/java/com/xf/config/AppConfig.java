package com.xf.config;

import com.xf.imports.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @program spring
 * @description:
 * @author: xiaoFeng
 * @create: 2020/07/08 19:45
 */
@ComponentScan("com.xf")
@Configuration
@Import(MyImportSelector.class)
public class AppConfig {}
