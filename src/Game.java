import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
///////////
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.io.File;

public class Game extends Application {
	public static void main(String[] args) {

		try{



		XmlFile f=new XmlFile();
		File inputFile = new File("./src//HighScore.xml");
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(inputFile);
		Node game = doc.getFirstChild();
		Element savedGame = doc.createElement("SavedGame");
		game.appendChild(savedGame);


			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			System.out.println("-----------Modified File-----------");
			StreamResult consoleResult = new StreamResult(inputFile);
			transformer.transform(source, consoleResult);


		}
		catch(Exception e){

		}
		launch(args);

	}

	public void start(Stage primaryStage) throws Exception {
		Parent LoginUserGUI = FXMLLoader.load(getClass().getResource("Start.fxml"));
		primaryStage.setTitle("Fruit Ninja");
		primaryStage.setScene(new Scene(LoginUserGUI, 500, 500));
//        primaryStage.setResizable(false);
		primaryStage.show();
	}

}