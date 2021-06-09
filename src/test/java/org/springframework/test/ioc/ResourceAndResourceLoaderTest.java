package org.springframework.test.ioc;

import cn.hutool.core.io.IoUtil;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;

public class ResourceAndResourceLoaderTest {

    @Test
    public void testResourceLoader() throws Exception {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();

        //加载classPath下的资源
        Resource resource = resourceLoader.getResource("classpath:hello.txt");
        InputStream inputStream = resource.getInputStrean();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
        Assert.assertEquals(content, "hello world");

        //加载文件系统资源
        resource = resourceLoader.getResource("src/test/resources/hello.txt");
        Assert.assertTrue(resource instanceof FileSystemResource);
        inputStream = resource.getInputStrean();
        content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
        Assert.assertEquals(content, "hello world");

        //加载url资源
        resource = resourceLoader.getResource("https://github.com/LOG-HORIZON-BIAO/little-spring/blob/main/README.md");
        Assert.assertTrue(resource instanceof UrlResource);
        inputStream = resource.getInputStrean();
        content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
}
