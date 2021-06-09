package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlResource implements Resource {

    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStrean() throws IOException {
        URLConnection urlConnection = this.url.openConnection();
        return urlConnection.getInputStream();
    }
}
