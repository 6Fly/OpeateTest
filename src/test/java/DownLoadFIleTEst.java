import com.project.pratice.Utills.FileUploadItemunzip;

public class DownLoadFIleTEst {
    public static void main(String[] args) {
        String downloadUrl = "http://dfs.baofoo.com";
        String savePaths = "D:/usr/local/123.pdf";
        FileUploadItemunzip.downLoadFileFromUrlSSLAndUnzip(downloadUrl,savePaths);
    }
}
