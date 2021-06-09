package org.springframework.core.io;

/**
 * 资源加载器接口
 */
public interface ResourceLoader {

    Resource getResource(String location);
}
