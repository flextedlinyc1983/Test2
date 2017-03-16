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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;
import org.tensorflow.TensorFlow;

import deepDriver.dl.aml.ann.ArtifactNeuroNetwork;
import deepDriver.dl.aml.ann.InputParameters;
import deepDriver.dl.aml.ann.imp.LogicsticsActivationFunction;
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
		

//			java.io.File f = new java.io.File("dataFile.txt");
//			GZipRunnable gZipRun = new GZipRunnable(f);
//			gZipRun.run();
			
			
//			Thread thr = Thread.currentThread();
//	        System.out.println("目前執行緒名稱:"+thr.getName());
//	        thr.setName("DEMO");
//	        System.out.println("更改後的名稱:"+thr.getName());
		
//			Runnable runnbale = new Runnable() {
//			    public void run() {
//			    	System.out.println("run me!");
//			    }
//			};			
//			runnbale.run(); 

//			try{
//				threadTest(5);			
//			}catch (Exception ex) {
//			
//			}
		
//			LogicsticsActivationFunction tanhAf = new LogicsticsActivationFunction();			
//			System.out.println(tanhAf.activate(-1199999990));
//			System.out.println(tanhAf.deActivate(0));
			
//			ArtifactNeuroNetwork ann = new ArtifactNeuroNetwork();
//			InputParameters parameters = new InputParameters();		
//			double [][] inputs = new double[2000][2];
//			parameters.setInput(inputs);
//			double [] y = new double[inputs.length];
//			parameters.setResult(y);
//			parameters.setLayerNum(3);			
//			ann.trainModel(parameters);
		
		

//			int N = 3;
//			double[] dI = new double[N];
//			double[][] a = new double[N][N];
//			int[] q = new int[]{0,2,2,1,2,0,0,1,2,0};
//			
//			dI[0] = 0.5;
//			dI[1] = 0.2;
//			dI[2] = 0.3;
//			
//			a[0][0] = 0.1;
//			a[0][1] = 0.3;
//			a[0][2] = 0.6;
//			
//			a[1][0] = 0.8;
//			a[1][1] = 0.1;
//			a[1][2] = 0.1;
//			
//			a[2][0] = 0.3;
//			a[2][1] = 0.3;
//			a[2][2] = 0.4;
//			
//			double p = probability(dI, a, q, q.length);
//			System.out.println("p: " + p);
		
//			System.out.println("I'm using TensorFlow version: " +  TensorFlow.version());
		
//			System.out.println("Hello");
//			HSSFWorkbook wb;
//			try{
//				POIFSFileSystem fs= new POIFSFileSystem(new FileInputStream("Book1.xls"));
//				wb = new HSSFWorkbook(fs);
//				
//				HSSFSheet sheet = wb.getSheetAt(0);
//				HSSFRow row = sheet.getRow(0);
//				HSSFCell cell = row.getCell((short) 0);
////				String msg = cell.getStringCellValue();
//				String msg= cell.toString();
//				System.out.println("Hello " + msg);
				
//			}catch (IOException ex) {
//				
//			}
		
//			System.loadLibrary("jri");      
			Rengine re=new Rengine (new String [] {"--vanilla"}, false, null);
	        if (!re.waitForR())
	        {
	            System.out.println ("Cannot load R");
	            return;
	        }	       
	        // 計算3*5並印出結果
//	        System.out.println (re.eval ("x<-3*5").asDouble ());	    
	        REXP rexp = re.eval ("matrix(c(2:5), nrow = 2, ncol = 2)");
	        int[] iArray = rexp.asIntArray();
	        for (int i = 0; i < iArray.length; i++) {
	        	System.out.println (iArray[i]);	
			}
	        
	        // 結束
	        re.end();
	}
	
	
	
	public static double probability(double[] dI, double[][] a, int[] q, int T)
	{
		
	    double p = dI[q[0]];
	    for (int i=1; i<T; ++i){
	        p *= a[q[i-1]][q[i]];
	    }
	    return p;
	}
	
	public static void threadTest(int count) throws Exception {
	    ExecutorService service = Executors.newFixedThreadPool(5);
	    for (int i = 0; i < count; i++) {
	      Process process = new Process(i);
	      Future<?> result = service.submit(process);
	      try {
	        System.out.println(result.get());
	      }
	      catch (Exception e) {
	        e.printStackTrace();
	      }
	    }
	    service.shutdown();
	}
	
	
	private static class Process implements Runnable {
	    int id;
	    
	    public Process(int id) {
	      super();
	      this.id = id;
	    }
	 
	    public void run() {
	      System.out.println("Process[" + id + "] running!");
//	      String a = null;
//	      System.out.println("a is empty?" + (a.equals("")));
	    }
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
