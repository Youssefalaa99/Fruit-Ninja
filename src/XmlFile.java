import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XmlFile {

    public void saveGame(int highScore){

        try{
            File inputFile = new File("./src//HighScore.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            Node HighScore = doc.getFirstChild();
            HighScore.setTextContent(Integer.toString(highScore));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            System.out.println("-----------Modified File-----------");
            StreamResult consoleResult = new StreamResult(inputFile);
            transformer.transform(source, consoleResult);
        }
        catch (Exception e) {
            e.printStackTrace();
        }




    }

    public int getHighScore(){
        int highScore = 0;

        try{

            File inputFile = new File("./src//HighScore.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            Node HighScore = doc.getFirstChild();
            highScore=Integer.parseInt(HighScore.getTextContent());

        }

        catch (Exception e) {
            e.printStackTrace();
        }




        return highScore;
    }
}
