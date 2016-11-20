package edu.ucsb.cs56.F16.CourseScraper;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;

/** GEscraper Class takes classes from a URL and displays them in a list.
    @author Brent Kirkland 
    @author Dylan Lynch 
    @version 03.04.15
*/

public class Test {
	//main	
	public static void main(String args[]){
		// Document doc=Jsoup.parse("");
		// try{
		// 	doc = Jsoup.connect("https://my.sa.ucsb.edu/catalog/Current/CollegesDepartments/ls-intro/ealcs.aspx?DeptTab=Courses").get();
		// }
		// //Catch bad URL
		// catch (MalformedURLException e) {
		// 	System.out.println("Area does not exist.");
		// 	System.exit(1);
		// }
		// //catch IOException
		// catch (IOException e) {
		// 	System.out.println("Check Internet.");
		// 	System.exit(1);
		// }
		// Elements content = doc.getElementsContainingText("CHIN 3.");
		// Element panel = content.get(content.size() - 2);
		// Elements des = panel.select("div[style=padding-left: 2px;]");
		// System.out.println(des.get(1).html());

		// Map table = new HashMap<String,String>();
		// table.put("ANTH","anth");
		// table.put("ART","art");
		// table.put("ARTHI","arthi");
		// table.put("AS AM","asam");
		// table.put("ASTRO","phys");
		// table.put("BL ST","blst");
		// table.put("CH ST","chst");
		// table.put("C LIT","complit");
		// table.put("CHEM","chem");
		// table.put("CHIN","ealcs");
		// table.put("CLASS","class");
		// table.put("CMPSC","compsci-engr");
		// table.put("COMM","comm");
		// table.put("DANCE","thtda");
		// table.put("EACS","ealcs");
		// table.put("EARTH","earthsci");
		// table.put("EARTHW","earthsci");
		// table.put("ECON","econ");
		// table.put("EEMB","eemb");
		// table.put("ENGL","engl");
		// // table.put("ENV","");
		// table.put("ENV S","envst");
		// // table.put("FAMST","");
		// table.put("FEMST","femst");
		// table.put("FR","frit");
		// table.put("GEOG","geog");
		// table.put("GER","gersl");
		// table.put("GLOBL","gis");
		// table.put("GREEK","class");
		// // table.put("HEB","");
		// table.put("HIST","hist");
		// table.put("ITAL","frit");
		// table.put("JAPAN","ealcs");
		// table.put("KOR","ealcs");
		// table.put("LAIS","lais");
		// table.put("LATIN","class");
		// table.put("LING","ling");
		// table.put("MATH","math");
		// table.put("MATRL","matrl");
		// table.put("MCDB","mcdb");
		// table.put("MUS","music");
		// // table.put("MS","");
		// table.put("PHIL","phil");
		// table.put("PHYS","phys");
		// table.put("POL S","polsci");
		// table.put("PORT","spanport");
		// table.put("PSTAT","stats");
		// table.put("PSY","psych");
		// table.put("RG ST","relst");
		// // table.put("SHS","");
		// // table.put("SLAV","");
		// table.put("SOC","soc");
		// table.put("SPAN","spanport");
		// table.put("THTR","thtda");


		// String s = (String)table.get("a");
		// System.out.println(s);
		String course = "SLAV 6GS - Intermediate French for Global Studies and Political Science";
		// String[] words = course.split(" - ");
		// String[] words2 = words[0].split(" [0-9]+");
		// String area = words2[0];
		// String courseId = words[0] + ".";

		// System.out.println(area + ".");
		// System.out.println(courseId);


		String[] words = course.split(" - ");
		String[] words2 = words[0].split(" [0-9]+");
		String area = words2[0];
		String courseId = words[0] + ".";
		AreaUrlMappingTable table = new AreaUrlMappingTable();
		String url = table.getUrl(area);
		Document doc=Jsoup.parse("");
		try{
			doc = Jsoup.connect(url).get();
		}
		//Catch bad URL
		catch (MalformedURLException e) {
			System.out.println("Area does not exist.");
		}
		//catch IOException
		catch (IOException e) {
			System.out.println("Check Internet.");
		}
		Elements content = doc.getElementsContainingText(courseId);
		System.out.println(content.size());
		// Element panel = content.get(content.size() - 2);
		// Elements des = panel.select("div[style=padding-left: 2px;]");
		// System.out.println(des.get(1).html());
	}//end main
    
}