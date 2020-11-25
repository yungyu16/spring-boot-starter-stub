package com.github.yungyu16.spring.proxy.support;

import com.github.yungyu16.spring.proxy.annotation.ProxyStub;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * CreatedDate: 2020/11/24
 * Author: songjialin
 */
public class ClassPathStubBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

    public ClassPathStubBeanDefinitionScanner(BeanDefinitionRegistry registry, Environment environment) {
        super(registry, false, environment);
        addIncludeFilter(new AnnotationTypeFilter(ProxyStub.class, true, false));
        setBeanNameGenerator(new DefaultBeanNameGenerator());
    }

    @Override
    protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
        AnnotationMetadata metadata = beanDefinition.getMetadata();
        return metadata.isInterface() && !metadata.isAnnotation();
    }
}
