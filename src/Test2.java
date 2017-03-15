import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;
public class Test2 {
	
	public final static int PORT = 13;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test2 t = new Test2();
//		System.out.println("Test3");
		
		
		
//		try (ServerSocket server = new ServerSocket(PORT)){
//			while (true) {
//				try {
//					Socket connection = server.accept();
//					Thread task = new DaytimeThread(connection); 
//					task.start();
//				} catch (IOException xe) {
//					// TODO: handle exception
//				}
//			}
//		} catch (IOException ex) {
//			// TODO: handle exception
//			System.err.println("Count not start server");
//		}
		
		
		
//		try{
//			URL u = new URL("https://tw.yahoo.com/");
//			InputStream in = u.openStream();
//			int c;
//			while ((c = in.read()) != -1) {
//				System.out.write(c);
//			}
//			in.close();
//		} catch (IOException ex) {
//		//	 TODO: handle exception
//			System.err.println("Count not start server");
//		}
		
		
//		OutputStream out = null;
//		try{
//			out = new FileOutputStream("data.txt");
//			
////			byte[] buffer = new byte[1024];
//			byte[] bytes = ByteBuffer.allocate(4).putInt(1695609641).array();
//			for (byte b : bytes) {
//				   System.out.format("0x%x ", b);
//			}
//			out.write(bytes, 0, bytes.length);
//			out.flush();
//		}catch (IOException ex) {
//		//	 TODO: handle exception
//			System.err.println("Count not start server");
//		} finally {
//			if(out != null){
//				try {
//	                out.close();
//	            } catch (IOException e) {
//	                // ignore;
//	            }	
//			}
//            
//        }
		
		
//		InputStream in = null;
//		try{
//			in = new FileInputStream("data.txt");
//			byte[] buffer = new byte[1024]; 
//			int idx = 0; 
//			while ((idx = in.read(buffer)) != -1) { 
//				for (byte b : buffer) {
//             	   System.out.format("0x%x ", b);
//				}
//			}      
//			
//	         
//		}catch (IOException ex) {
//		//	 TODO: handle exception
//			System.err.println("Count not start server");
//		} finally {
//			if(in != null){
//				try {
//	                in.close();
//	            } catch (IOException e) {
//	                // ignore;
//	            }	
//			}
//            
//        }
		
//		InputStream in = null;
//		try{
////			in = new FileInputStream("data.txt");
//			in = new FileInputStream("dataFile.txt");
//			byte[] buffer = new byte[1024]; 
//			int idx = 0; 
//			while ((idx = in.read(buffer)) != -1) { 
//				for (byte b : buffer) {
//             	   System.out.format("0x%x ", b);
//				}
//			}      
////			System.out.println(getTestString(in));
//	         
//		}catch (IOException ex) {
//		//	 TODO: handle exception
//			System.err.println("Count not start server");
//		} finally {
//			if(in != null){
//				try {
//	                in.close();
//	            } catch (IOException e) {
//	                // ignore;
//	            }	
//			}
//            
//        }
		
//		try{
//			java.io.File f = new java.io.File("dataFile.txt");
//			LogFile logFile = new LogFile(f);
//			logFile.writeEntry("test");
//			logFile.close();
//		}catch (IOException ex) {
//		}
		
		
		
//			try{
//				java.io.File f = new java.io.File("dataFile.txt");
//				LogFile logFile = new LogFile(f);
//				logFile.writeEntryForLoop("test");
//				logFile.close();
//			}catch (IOException ex) {
//				
//			}
		

			java.io.File f = new java.io.File("dataFile.txt");
			GZipRunnable gZipRun = new GZipRunnable(f);
			gZipRun.run();

	}
	
	public static String getTestString(InputStream in) throws IOException {
		StringBuilder sb = new StringBuilder();
		InputStreamReader r = new InputStreamReader(in, "MacCyrillic");
		int c;
		while ((c = r.read()) != -1) {
			sb.append((char) c);
		}
		return sb.toString();
	}
	
	private static class DaytimeThread extends Thread {

        private Socket connection;

        DaytimeThread(Socket connection) {
            this.connection = connection;
        }

        @Override
        public void run() {
            try {
                Writer out = new OutputStreamWriter(connection.getOutputStream());
                Date now = new Date();
                out.write(now.toString() + "\r\n");
                out.flush();
            } catch (IOException ex) {
                System.err.println(ex);
            } finally {
                try {
                    connection.close();
                } catch (IOException e) {
                    // ignore;
                }
            }
        }
    }
}
