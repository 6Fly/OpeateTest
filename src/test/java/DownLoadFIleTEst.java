import com.project.pratice.Utills.FileUploadItemunzip;

public class DownLoadFIleTEst {
    public static void main(String[] args) {
        String downloadUrl = "http://dfs.baofoo.com/group1/M00/00/58/wKi-H19Pb32AO7JlAACmzAQu82o788.zip?token=91cacfdff8f5bb9e3d60ec3025880a2d&ts=159904140";
        String savePaths = "D:/usr/local/123.pdf";
        FileUploadItemunzip.downLoadFileFromUrlSSLAndUnzip(downloadUrl,savePaths);
    }
}
