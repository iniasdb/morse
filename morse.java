import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class morse{

	public static void main(String[] args) throws IOException {
		
		String exportPath = "C:\\Users\\'yourname'\\Desktop\\morse.txt";	//replace 'yourname'
		
		//create new file in exportPath variable, create FileWriter and PrintWriter
		File file = new File(exportPath);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
			
		String input = JOptionPane.showInputDialog("type sentence or word");
		String zin = input.toLowerCase();
		String zinOut = "";
			
		//for loop splits words in characters, switch runs through all possible cases the character can be
		for (int i = 0; i < zin.length();) {
			String x = zin.substring(i, i+1);
			
			switch (x) {
			  case "a":
				zinOut += "  .-";
				break;
			  case "b":
				zinOut += "  -...";
				break;
			  case "c":
				zinOut += "  -.-.";
				break;
			  case "d":
				zinOut += "  -..";
				break;
			  case "e":
				zinOut += "  .";
				break;
			  case "f":
				zinOut += "  ..-.";
				break;
			  case "g":
				zinOut += "  --.";
				break;
			  case "h":
				zinOut += "  ....";
				break;
			  case "i":
				zinOut += "  ..";
				break;
			  case "j":
				zinOut += "  .---";
				break;
			  case "k":
				zinOut += "  -.-";
				break;
			  case "l":
				zinOut += "  .-..";
				break;
			case "m":
				zinOut += "  --";
				break;
			case "n":
				zinOut += "  -.";
				break;
			case "o":
				zinOut += "  ---";
				break;
			case "p":
				zinOut += "  .--.";
				break;
			case "q":
				zinOut += "  --.-";
				break;
			case "r":
				zinOut += "  .-.";
				break;
			case "s":
				zinOut += "  ...";
				break;
			case "t":
				zinOut += "  -";
				break;
			case "u":
				zinOut += "  ..-";
				break;
			case "v":
				zinOut += "  ...-";
				break;
			case "w":
				zinOut += "  .--";
				break;
			case "x":
				zinOut += "  -..-";
				break;
			case "y":
				zinOut += "  -.--";
				break;
			case "z":
				zinOut += "  --..";
				break;
			case "0":
				zinOut += "  -----";
				break;
			case "1":
				zinOut += "  .----";
				break;
			case "2":
				zinOut += "  ..---";
				break;
			case "3":
				zinOut += "  ...--";
				break;
			case "4":
				zinOut += "  ....-";
				break;
			case "5":
				zinOut += "  .....";
				break;
			case "6":
				zinOut += "  -....";
				break;
			case "7":
				zinOut += "  --...";
				break;
			case "8":
				zinOut += "  ---..";
				break;
			case "9":
				zinOut += "  ----.";
				break;
			case " ":
				zinOut += "      ";
				break;
			}
				
			i++;
		}
			
		//get local date and time
		LocalDateTime myDateObj = LocalDateTime.now();
		//format the date and time to dd-MM-yyyy  HH:mm:ss
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		//print date and time + sentence + morse sentence to txt file
		pw.println(formattedDate + "\n" + zin + "\n" + zinOut);
		//print morse sentence to frame
		JOptionPane.showMessageDialog(null, zinOut);
		//print exportPath to frame
		JOptionPane.showMessageDialog(null, "output in " + exportPath );

		
		pw.close();
		fw.close();
	}
}
