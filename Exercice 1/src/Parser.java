import java.io.File;
import java.io.FileInputStream;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Parser {

    private File file;

    public Parser(File file) {
        this.file = file;
    }

    public File getFile(){
        return this.file;
    }

    public static void main(String[] args) throws Exception {
        Parser parser = new Parser(new File("./book.xml"));
        FileInputStream fileIS = new FileInputStream(parser.getFile());
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse(fileIS);
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "/library/book";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);
        System.out.println(nodeList);
        expression = "/library/book[@type=" + '"' + "roman" + '"'  + "]";
        nodeList = (NodeList) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);
        System.out.println(nodeList);
        expression = "/library/book[@type=" + '"' + "bd" + '"'  + "]";
        nodeList = (NodeList) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);
        System.out.println(nodeList.getLength());

        //4 La liste des livres?
    }
}
