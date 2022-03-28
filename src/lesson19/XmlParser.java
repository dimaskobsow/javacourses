package lesson19;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParser {
    public static void main(String[] args) {





    }
//        File file = new File("src/test.xml");
//        Root root = new Root();
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        Document doc = null;
//
//        try {
//            doc = factory.newDocumentBuilder().parse(file);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Node firstChild = doc.getFirstChild();
////        System.out.println(firstChild.getNodeName());
//        String nameFile = null;
//        NodeList nodeList = firstChild.getChildNodes();
//        NodeList chilNodesPeople = null;
//        List<People> peopleList = new ArrayList<>();
//        for (int i = 0; i < nodeList.getLength(); i++) {
//            if (nodeList.item(i).getNodeType() != Node.ELEMENT_NODE) {
//                continue;
//            }
//            System.out.println(nodeList.item(i).getNodeName());
//            switch (nodeList.item(i).getNodeName()) {
//                case "name": {
//                    nameFile = nodeList.item(i).getTextContent();
//                    break;
//                }
//                case "people": {
//                    chilNodesPeople = nodeList.item(i).getChildNodes();
//                    break;
//                }
//            }
//            root.setName(nameFile);
//            if (chilNodesPeople.item(i) == null) {
//                return;
//            }
//        }
//        String nameFile = null;
//        int agePeople = 0;
//        NodeList nodeListElement = first
//
//        String people = null;
//        for (int i = 0; i < chilNodesPeople.getLength(); i++) {
//            if (chilNodesPeople.item(i).getNodeType() != Node.ELEMENT_NODE) {
//                continue;
//            }
////           if(chilNodesPeople.item(i).getNodeName().equals("element") ){
////
////           }
//            nodeListElement = chilNodesPeople.item(i).getChildNodes();
//            for (int j = 0; j < nodeListElement.getLength(); j++) {
//                if (chilNodesPeople.item(i).getNodeType() != Node.ELEMENT_NODE) {
//                    continue;
//                }
//                switch (nodeListElement.item(j).getNodeName()) {
//
//                    case "name": {
//                        nameFile = nodeListElement.item(j).getTextContent();
//                        break;
//                    }
//                    case "age": {
//                        agePeople = Integer.parseInt(nodeListElement.item(j).getTextContent());
//                        break;
//                    }
//                }
//
//            }
////            people.setName(nameFile);
////            people.setAge(agePeople);
////            List.add(people);
////            root.setPeopleList(list);
//        }
//
//    }
}
