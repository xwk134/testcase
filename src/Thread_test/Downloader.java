package Thread_test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Downloader {
    public void down(String url, String name) throws IOException {

        FileUtils.copyURLToFile(new URL(url),new File((name)));
    }


}
