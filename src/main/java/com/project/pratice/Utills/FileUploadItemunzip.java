package com.project.pratice.Utills;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by xiaogang on 2018/1/26.
 */
public class FileUploadItemunzip {

    private static Logger logger = LoggerFactory.getLogger(FileUploadItemunzip.class);

    /**
     * <p>Title: downLoadFileFromUrl</p>
     * <p>Description: 从网络下载文件并且解压</p>
     *
     * @param sourceUrl 网络路径
     * @param savePaths =   保存路径（以“/”结尾） +保存到文件名
     * @throws IOException
     * @author LiuZhao
     */
    public static void downLoadFileFromUrlSSLAndUnzip(String sourceUrl,String savePaths) {

        InputStream is = null;
        byte[] getData;
        FileOutputStream fos = null;
        HttpURLConnection conn = null;
        try {
            URL url = new URL(sourceUrl);
            //如果是https请求，设置信任所有SSL证书
            if ("https".equalsIgnoreCase(url.getProtocol())) {
                SslUtils.ignoreSsl();
            }
            //防止网络问题，出现网关502问题时
            //进行再次连接此次数3次,间隔0.5s
            boolean flag = true;
            int count = 0;
            while (flag){
                conn = (HttpURLConnection) url.openConnection();
                // 防止屏蔽程序抓取而返回403错误
                conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
                logger.info("连接状态"+conn.getResponseCode());
                if (conn.getResponseCode() != 200 || count >=15){
                    flag = false;
                }else {
                    count +=5;
                    conn.disconnect();
//                    Thread.sleep(count*1000);

                }
            }

            // 设置超时间为3秒
            conn.setConnectTimeout(3 * 1000);


            // 得到输入流
            is = conn.getInputStream();
            //使用文件压缩流
            ZipInputStream zis = new ZipInputStream(is);
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File file = new File(savePaths);
                fos = new FileOutputStream(file);
                int len;
                byte[] bytes = new byte[1024];
                while ((len = zis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                zis.closeEntry();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert is != null;
                is.close();
                conn.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
