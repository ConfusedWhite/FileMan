package cn.com.liboke.boy;



import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;


public class CopyUtils {

    /**
     * The default size of the buffer.
     */
    private static final int DEFAULT_BUFFER_SIZE = 1024 * 4;
	public static void copy(File source ,File address){
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(source);
				fos = new FileOutputStream(address);
				byte[] temp = new byte[DEFAULT_BUFFER_SIZE];
				int len = 0;
				while((len = fis.read(temp))!=-1){
					fos.write(temp, 0, len);
				}
			} catch (Exception e) {
				// TODO: handle exception
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
