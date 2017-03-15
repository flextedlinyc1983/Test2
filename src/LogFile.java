import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;


public class LogFile {
	
	private Writer out;
	
	public LogFile(File f) throws IOException {
		FileWriter fw = new FileWriter(f);
		this.out = new BufferedWriter(fw); 
				
	}
	
	public void writeEntry(String message) throws IOException {
		Date d = new Date();
		out.write(d.toString());
		out.write("\t");
		out.write(message);
		out.write("\r\n");
	}
	public void writeEntryForLoop(String message) throws IOException {
		for(int i = 0; i <100000;i++){
			Date d = new Date();
			out.write(d.toString());
			out.write("\t");							
			out.write(message);
			out.write("\r\n");
		}
	}
	
	public void close() throws IOException {
		out.flush();
		out.close();
	}
}
