package com.javacodegeeks.snippets.enterprise;

//import java.awt.Dimension;
//import java.awt.Toolkit;
import java.io.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.io.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.jsoup.Jsoup;
//import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//import com.javacodegeeks.snippets.enterprise.Parser;
//import javax.swing.JFrame;
import java.io.IOException;
import javax.swing.JFrame;

//import java.net.URL;

public class DownloadImages extends JFrame{

	// Globabl variables
	private static int threadCount = 0;
	private static String[] threadCount2 = new String[150];
	private static String boardChoice = "";
	private static boolean isRefreshed = false;
	private static final String[] boardList = { "/a/", "/b/", "/c/", "/d/",
			"/e/", "/g/", "/gif/", "/h/", "/hr/", "/k/", "/m/", "/o/",
			"/p/", "/r/", "/s/", "/t/", "/u/", "/v/", "/vg/", "/vr/", "/w/",
			"/wg/", "/i/", "/ic/", "/r9k/", "/s4s/", "/cm/", "/hm/",
			"/lgbt/", "/y/", "/3/", "/adv/", "/an/", "/asp/", "/biz/",
			"/ck/", "/co/", "/diy/", "/fa/", "/fit/", "/gd/", "/hc/",
			"/int/", "/jp/", "/lit/", "/mlp/", "/toy/", "/trv/", "/tv/",
			"/vp/", "/wsg/", "/x/" };
	private static String[][] threadList = new String[boardList.length][150];
	private static int boardIndex;

	// The path of the folder that you want to save the images to
	private static String folderPath;
	private static boolean GUI_DONE = false;
	static ImageGUI u;
	
	
	
	public static void main(String[] args) {
		ImageGUI gui = new ImageGUI();
		gui.setVisible(true);
	
		// Program loop
		while (!GUI_DONE) {
			//while (!isRefreshed) {

				for (int i = 0; i < threadCount; i++) {
					try {
						System.out.println("here");
						// Connect to the website and get the html
						System.out.println(threadCount2[i]);
						Document doc = Jsoup.connect(threadCount2[i])
								.get();

						// Get all elements with img tag ,
						Elements img = doc
								.getElementsByClass("fileThumb");
						

						for (Element el : img) {

							// for each element get the srs url
							String src = el.absUrl("href");

							System.out.println("Image Found!");
							System.out.println("src attribute is : "
									+ src);

							getImages(src);

						}
						
					}
					catch (IOException ex) {
						System.err.println("There was an error");
						Logger.getLogger(DownloadImages.class.getName())
								.log(Level.SEVERE, null, ex);
						System.out.println("Catch");
					}
					isRefreshed = true;
					System.out.println("Done!");
					threadCount = 0;
					ImageGUI.setConsole("All images were downloaded!");
					ImageGUI.setBar(150);
					
				}
				try {
					Thread.sleep(300);
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//}
		}

		gui.setVisible(false);
	}

	private static void getImages(String src) throws IOException {

		String folder = null;

		// Exctract the name of the image from the src attribute
		int indexname = src.lastIndexOf("/");

		if (indexname == src.length()) {
			src = src.substring(1, indexname);
		}

		indexname = src.lastIndexOf("/");
		String name = src.substring(indexname, src.length());

		System.out.println(name);

		// Open a URL Stream
		URL url = new URL(src);

		InputStream in = url.openStream();

		OutputStream out = new BufferedOutputStream(new FileOutputStream(
				folderPath + name));

		for (int b; (b = in.read()) != -1;) {
			out.write(b);
		}
		out.close();
		in.close();
	}

	public static void setFile(String file) {
		folderPath = file;
	}

	// gets URL index
	public static void setURLs(int[] urls) {
		for (int i = 0; i < urls.length; i++) {
			threadCount2[i] = threadList[boardIndex][urls[i]];
		}
		threadCount = urls.length;
	}

	// setter to stop program loop
	public static void isDone(boolean isDone) {
		GUI_DONE = isDone;
	}

	// setter for board of choice
	public static void setBoard(int board) {
		boardChoice = boardList[board];
		System.out.println(boardChoice);
		boardIndex = board;
	}

	// sets bool variable to run refresh loop
	public static void setRefreshed(boolean b) {
		isRefreshed = b;
	}

	// gathers links for each thread
	public static void threads() {

		// counter threads; used by threadList as index
		int q = 0;
		// retrieves the thread urls
		for (int j = 0; j < 10; j++) {

			try {
				// connects to board
				int g = j+1;
				
				Document doc2;
				if(g > 1){
					doc2 = Jsoup.connect("http://boards.4chan.org" + boardChoice+g).get();
				}
				else{
					doc2 = Jsoup.connect("http://boards.4chan.org" + boardChoice).get();
				}
				
				// Get all elements with img tag ,

				Elements img2 = doc2.getElementsByClass("thread");

				// collects links and stores them in threadList
				for (Element el : img2) {

					// for each element get the srs url
					String src2 = el.select("a").attr("href");
					System.out.println(src2);
					
					
					threadList[boardIndex][q] = "http://boards.4chan.org"
							+ boardChoice + src2;
					
					
					q++;
				}
				ImageGUI.setBar(q);
				
			}
			catch (IOException ex) {
				// foundAll = true;
				System.err.println("There was an error");
				Logger.getLogger(DownloadImages.class.getName()).log(
						Level.SEVERE, null, ex);
				// }
			}
		}
		ImageGUI.setConsole("All threads found!");
	}

	// calls threads() and returns them
	public static String[] getThreads() {
		threads();
		String[] temp = new String[150];
		for (int u = 0; u < 150; u++) {
			temp[u] = threadList[boardIndex][u];
			System.out.println(temp[u] + u);
		}
		
		return temp;
	}

}
