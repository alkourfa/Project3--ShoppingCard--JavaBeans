/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alexia;

/**
 *
 * @author alexiaKourfali
 */



/*http://en.wikipedia.org/wiki/JavaBean*/

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
//import org.xml.sax.SAXException;




public class MyJavaBean implements java.io.Serializable
{   
    
    
    
    private double prices,FirstPrice=18.5,SecondPrice=6.95,ThirdPrice=1.29,Sum1,Sum2,Sum3,Total;
    private String FirstQuantity,SecondQuantity,ThirdQuantity;

        

 
/** No-arg constructor (takes no arguments). */    
    public MyJavaBean()
    {
                
        FirstQuantity="0";
        SecondQuantity="0";
        ThirdQuantity="0";
        
        Sum1=0.0;
        Sum2=0.0;
        Sum3=0.0;
        Total=0.0;

    }
    
/********************************************************************************
 *                                                                              *
 *                                  get Prices                                  *
 *                                                                              *
 ********************************************************************************/    
   /**
     * Property <code>name</code> (note capitalization) readable/writable.
     */  
    
    
    
    public double getFirstPrice()
   {
     return this.FirstPrice;
   }
    
    public double getSecondPrice()
   {
       return this.SecondPrice;
   }
    
    public double getThirdPrice()
   {
       return this.ThirdPrice;
   }
   
   
 
   
 /********************************************************************************
 *                                                                              *
 *                                  get Quantity                                  *
 *                                                                              *
 ********************************************************************************/      

   public String getFirstQuantity()
   {
       return this.FirstQuantity;
   }
     
   
   public String getSecondQuantity()
   {
       return this.SecondQuantity;
   }
   
   
   public String getThirdQuantity()
   {
       return this.ThirdQuantity;
   }
   

 /********************************************************************************
 *                                                                              *
 *                                  Set Quantity                                  *
 *                                                                              *
 ********************************************************************************/   
/**
     * Setter for property <code>name</code>.
     * @param name
     */
   
 public void setFirstQuantity(final String FirstQuantity)
   {
       this.FirstQuantity = FirstQuantity;
       this.Sum1 = Double.parseDouble(FirstQuantity)*FirstPrice;
       this.Total = Sum1+Sum2+Sum3;
   }  
 
 
 public void setSecondQuantity(final String SecondQuantity)
   {
       this.SecondQuantity = SecondQuantity;
       this.Sum2 = Double.parseDouble(SecondQuantity)*SecondPrice;
       this.Total = Sum1+Sum2+Sum3;
   }
 
 public void setThirdQuantity(final String ThirdQuantity)
   {
       this.ThirdQuantity = ThirdQuantity;
       this.Sum3 = Double.parseDouble(ThirdQuantity)*ThirdPrice;
       this.Total = Sum1+Sum2+Sum3;
   }
   
/********************************************************************************
 *                                                                              *
 *                                  get Sums                                  *
 *                                                                              *
 ********************************************************************************/      

 public double getSum1()
   {
       return this.Sum1;
   }
   

public double getSum2()
   {
       return this.Sum2;
   }
 
 
 public double getSum3()
   {
       return this.Sum3;
   }

   

public double getTotal() {
        return this.Total;
    } 
    
 /*******************************************************************************
 *                                                                              *
 *                          Parser                                              *
 *                                                                              *
 ********************************************************************************/   
 //http://www.java-tips.org/java-se-tips/javax.xml.parsers/how-to-read-xml-file-in-java.html   
private double my_ListParser(int itIs)
{
        
    double[] my_list = new double[3];
        
    try{            
          File fXmlFile = new File("/Users/alexiaKourfali/NetBeansProjects/mav_project3_part2/web/my_list.xml"); 
          DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
          DocumentBuilder db = dbf.newDocumentBuilder();
          Document doc = db.parse(fXmlFile);
          doc.getDocumentElement().normalize();

          //System.out.println("Root element " + doc.getDocumentElement().getNodeName());
          NodeList nodeLst = doc.getElementsByTagName("Entry");

          for (int s = 0; s < nodeLst.getLength(); s++) 
          {

            Node fstNode = nodeLst.item(s);

            if (fstNode.getNodeType() == Node.ELEMENT_NODE) 
            {
                  Element fstElmnt = (Element) fstNode;

                  NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Price");
                  Element fstNmElmnt = (Element)fstNmElmntLst.item(0);        
                  NodeList fstNm = fstNmElmnt.getChildNodes();
                  Node nV = (Node)fstNm.item(0);
                  /*not sureeeee*/           
                  my_list[s] = Double.parseDouble(nV.getNodeValue());
            }
          }
    }catch (Exception e) {}
                   
    if(itIs==0)
        return my_list[0];   
       
    if(itIs==1)
        return my_list[1];
    
    else
        return my_list[2];
  }



}