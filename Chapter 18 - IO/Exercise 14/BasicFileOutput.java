import java.io.*;

public class BasicFileOutput {
	static String file = "src\\BasicFileOutput.txt";
	static String file2 = "src\\BasicFileOutput2.txt";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("src\\BasicFileOutput.java")));
		// this PrintWriter is buffered:
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		String s;
		long startBuffered = System.nanoTime();
		while ((s = in.readLine()) != null)
			out.println(lineCount++ + ": " + s);
		long durationBuffered = System.nanoTime() - startBuffered;
		out.close();
		
		BufferedReader in2 = new BufferedReader(new StringReader(BufferedInputFile.read("src\\BasicFileOutput.java")));
		// this PrintWriter is not buffered:
		PrintWriter out2 = new PrintWriter(new FileWriter(file2));
		int lineCount2 = 1;
		String s2;
		long startNotBuffered = System.nanoTime();
		while ((s2 = in2.readLine()) != null)
			out2.println(lineCount2++ + ": " + s2);
		long durationNotBuffered = System.nanoTime() - startNotBuffered;
		out2.close();
		// Show the stored files:
		System.out.println(BufferedInputFile.read(file));
		System.out.println(BufferedInputFile.read(file2));
		System.out.println("Buffered writing to file duration:     " + durationBuffered + " nanoseconds");
		System.out.println("Unbuffered writing to file duration:   " + durationNotBuffered + " nanoseconds");
	}
}

/* Output (Sample):
1: import java.io.*;
2: 
3: public class BasicFileOutput {
4: 	static String file = "src\\BasicFileOutput.txt";
5: 	static String file2 = "src\\BasicFileOutput2.txt";
6: 
7: 	public static void main(String[] args) throws IOException {
8: 		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("src\\BasicFileOutput.java")));
9: 		// this PrintWriter is buffered:
10: 		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
11: 		int lineCount = 1;
12: 		String s;
13: 		long startBuffered = System.nanoTime();
14: 		while ((s = in.readLine()) != null)
15: 			out.println(lineCount++ + ": " + s);
16: 		long durationBuffered = System.nanoTime() - startBuffered;
17: 		out.close();
18: 		
19: 		BufferedReader in2 = new BufferedReader(new StringReader(BufferedInputFile.read("src\\BasicFileOutput.java")));
20: 		// this PrintWriter is not buffered:
21: 		PrintWriter out2 = new PrintWriter(new FileWriter(file2));
22: 		int lineCount2 = 1;
23: 		String s2;
24: 		long startNotBuffered = System.nanoTime();
25: 		while ((s2 = in2.readLine()) != null)
26: 			out2.println(lineCount2++ + ": " + s2);
27: 		long durationNotBuffered = System.nanoTime() - startNotBuffered;
28: 		out2.close();
29: 		// Show the stored files:
30: 		System.out.println(BufferedInputFile.read(file));
31: 		System.out.println(BufferedInputFile.read(file2));
32: 		System.out.println("Buffered writing to file duration:     " + durationBuffered + " nanoseconds");
33: 		System.out.println("Unbuffered writing to file duration:   " + durationNotBuffered + " nanoseconds");
34: 	}
35: }

1: import java.io.*;
2: 
3: public class BasicFileOutput {
4: 	static String file = "src\\BasicFileOutput.txt";
5: 	static String file2 = "src\\BasicFileOutput2.txt";
6: 
7: 	public static void main(String[] args) throws IOException {
8: 		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("src\\BasicFileOutput.java")));
9: 		// this PrintWriter is buffered:
10: 		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
11: 		int lineCount = 1;
12: 		String s;
13: 		long startBuffered = System.nanoTime();
14: 		while ((s = in.readLine()) != null)
15: 			out.println(lineCount++ + ": " + s);
16: 		long durationBuffered = System.nanoTime() - startBuffered;
17: 		out.close();
18: 		
19: 		BufferedReader in2 = new BufferedReader(new StringReader(BufferedInputFile.read("src\\BasicFileOutput.java")));
20: 		// this PrintWriter is not buffered:
21: 		PrintWriter out2 = new PrintWriter(new FileWriter(file2));
22: 		int lineCount2 = 1;
23: 		String s2;
24: 		long startNotBuffered = System.nanoTime();
25: 		while ((s2 = in2.readLine()) != null)
26: 			out2.println(lineCount2++ + ": " + s2);
27: 		long durationNotBuffered = System.nanoTime() - startNotBuffered;
28: 		out2.close();
29: 		// Show the stored files:
30: 		System.out.println(BufferedInputFile.read(file));
31: 		System.out.println(BufferedInputFile.read(file2));
32: 		System.out.println("Buffered writing to file duration:     " + durationBuffered + " nanoseconds");
33: 		System.out.println("Unbuffered writing to file duration:   " + durationNotBuffered + " nanoseconds");
34: 	}
35: }

Buffered writing to file duration:     464097 nanoseconds
Unbuffered writing to file duration:   756631 nanoseconds
*/