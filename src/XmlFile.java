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
import org.w3c.dom.NodeList;

public class XmlFile {

    private int temp;

    public void saveHighScore(int highScore){

        try{
            File inputFile = new File("./src//HighScore.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            Node Game = doc.getFirstChild();
            Node HighScore =Game.getFirstChild();
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
            Node Game = doc.getFirstChild();
            Node HighScore = Game.getFirstChild();
            highScore=Integer.parseInt(HighScore.getTextContent());

        }

        catch (Exception e) {
            e.printStackTrace();
        }




        return highScore;
    }


    public void saveGame(Model model){
        int levelInt;

        try{
        File inputFile = new File("./src//HighScore.xml");
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(inputFile);
        Node Game = doc.getFirstChild();
        Node HighScore = Game.getFirstChild();
        HighScore.setTextContent(Integer.toString(model.getHighScore()));
        Node savedGame = HighScore.getNextSibling();
        Game.removeChild(savedGame);
        Element SavedGame = doc.createElement("SavedGame");
        Element lives = doc.createElement("NumberOfLives");
        lives.setTextContent(Integer.toString(model.getLives()));
        SavedGame.appendChild(lives);
        Element score = doc.createElement("CurrentScore");
        score.setTextContent(Integer.toString(model.getCurrentScore()));
        SavedGame.appendChild(score);
        Element level = doc.createElement("Level");
        if(model.getLevel() instanceof EasyLevel )
          levelInt=1;
        else if (model.getLevel() instanceof NormalLevel)
            levelInt=2;
        else
            levelInt=3;
        level.setTextContent(Integer.toString(levelInt));
        SavedGame.appendChild(level);
        Game.appendChild(SavedGame);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        System.out.println("-----------Modified File-----------");
        StreamResult consoleResult = new StreamResult(inputFile);
        transformer.transform(source, consoleResult);
        }
        catch(Exception e){
            e.printStackTrace();
        }




    }

    public Model loadGame(){
        Model model =new Model();
        try{
            

        File inputFile = new File("./src//HighScore.xml");
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(inputFile);
        Node Game = doc.getFirstChild();
        Node HighScore = Game.getFirstChild();
        model.setHighScore(Integer.parseInt(HighScore.getTextContent()));
        Node SavedGame = HighScore.getNextSibling();
        Node lives = SavedGame.getFirstChild();
        model.setLives(Integer.parseInt(lives.getTextContent()));
        Node score = lives.getNextSibling();
        model.setCurrentScore(Integer.parseInt(score.getTextContent()));
        Node levelNode = score.getNextSibling();
        int levelInt = Integer.parseInt(levelNode.getTextContent());
        switch(levelInt){

            case 1:{
                Level level = new EasyLevel();
                model.setLevel(level);
                break;
            }
            case  2:{
                Level level = new NormalLevel();
                model.setLevel(level);
                break;
            }
            case 3 :{
                Level level = new HardLevel();
                model.setLevel(level);
                break;
            }

        }
        
        }
        catch (Exception e){
            
            e.printStackTrace();
        }


        System.out.println(model.getCurrentScore());
        System.out.println(model.getLives());
        return model;
    }
}
