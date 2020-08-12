package com.xf.imports;

import com.xf.dao.IndexDao2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program spring
 * @description:
 * @author: xiaoFeng
 * @create: 2020/07/13 22:21
 */
public class MyImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    return new String[] {IndexDao2.class.getName()};
  }
}
