package org.springframework.core.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * classpath下的资源
 */
public class ClassPathResource implements Resource {

    private final String path;

    public ClassPathResource(String path) {
        this.path = path;
    }

    @Override
    public InputStream getInputStrean() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(this.path);
        if (inputStream == null) {
            throw new FileNotFoundException(this.path + " cannot be opened because it does not exist");
        }
        return inputStream;
    }
}
