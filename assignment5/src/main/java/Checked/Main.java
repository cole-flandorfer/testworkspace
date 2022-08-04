package Checked;
import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File f = new File("C:/foo/bar.txt");
		Scanner stream = new Scanner(f);
	
		stream.close();

	}

}
