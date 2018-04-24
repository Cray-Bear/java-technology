package cn.fty1.javase.lambda.predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class UrlUtils {


    private static Logger logger = LoggerFactory.getLogger(UrlUtils.class);




    public static UrlEvent opurl(UrlEvent urlEvent) {
        return opurl(urlEvent.getUrl());
    }

    public static UrlEvent opurl(String urlString) {

        UrlEvent urlEvent = new UrlEvent();
        urlEvent.setUrl(urlString);
        urlEvent.setStatus(false);
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {


            Random random = new Random(34);
            int randomInt = random.nextInt(5);
            Thread.sleep(randomInt*1000L);


            URL url = new URL(urlString);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);

            inputStream = httpURLConnection.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();//此处可以用Stringbuffer等接收
            byte[] b = new byte[200];
            int len = 0;
            while (true) {
                len = inputStream.read(b);
                byteArrayOutputStream.write(b, 0, len);
                break;
            }
            urlEvent.setStatus(true);
            urlEvent.setText(byteArrayOutputStream.toString());
            urlEvent.setCurTime(System.currentTimeMillis());
            return urlEvent;

        } catch (IOException e) {
            e.printStackTrace();
            logger.debug("Open URL Error.",e);
            return urlEvent;

        } catch (InterruptedException e) {
            e.printStackTrace();
            return urlEvent;
        } finally {
            try {
                inputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            httpURLConnection.disconnect();
        }
    }

}
