package IO;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import taxonomy.Taxon;
import taxonomy.TaxonRank;

public class TaxonDescriptionTxtIO {
	protected static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(TaxonDescriptionTxtIO.class);
	public void inputTxtFile(String filepath, String outPath)
			throws IOException {
		BufferedReader br;
		br = new BufferedReader(new FileReader(filepath));

		String sCurrentLine;

		int i = 0;

		Taxon taxon = new Taxon();

		while ((sCurrentLine = br.readLine()) != null) {
			sCurrentLine = skipBlanks(sCurrentLine);
			if (sCurrentLine.length() == 0)
				continue;

			System.out.println(sCurrentLine);
			LOGGER.info(sCurrentLine);

			if (sCurrentLine.indexOf("Description") >= 0) {
				sCurrentLine = br.readLine();
				if (sCurrentLine == null)
					break;

				sCurrentLine = skipBlanks(sCurrentLine);
				while (sCurrentLine.length() == 0) {
					sCurrentLine = br.readLine();
					sCurrentLine = skipBlanks(sCurrentLine);
				}
				String description = sCurrentLine;
				taxon.setDescription(description);
				i++;
				outputXML4Taxon(outPath + "/" + String.valueOf(i)
						+ ".xml", taxon);
				taxon = new Taxon();
			} else {
				TaxonRank rank = extractTaxonRank(sCurrentLine);
				String rankName = extractRankName(sCurrentLine, rank);

				taxon.setRankName(rank, rankName);
			}
		}
		br.close();
	}
	
	public void outputXML4Taxon(String filepath, Taxon taxon) throws IOException{
		Element taxonElement = taxon.createTreatmentElement();
		Document doc = new Document(taxonElement);
		FileOutputStream fout = null;

		XMLOutputter xmlOutput = new XMLOutputter();
		xmlOutput.setFormat(Format.getPrettyFormat().setEncoding(
				"UTF-8")); 
		
		fout = new FileOutputStream(filepath);
		xmlOutput.output(doc, fout);
		if (fout != null) {
			fout.close();
		}
	}
	
	public String skipBlanks(String line) {
		while (line.length() >= 1
				&& (line.substring(0, 1) == " " || line.substring(0, 1) == "\t"
						|| line.substring(0, 1) == "\r" || line.substring(0, 1) == "\n")) {
			line = line.substring(1);
		}
		return line;
	}
	
	public String extractRankName(String line, TaxonRank rank) {
		String name = "";
		line = skipBlanks(line);
		String upper = line.toUpperCase();
		if (upper.indexOf(rank.toString(), 0) >= 0) {
			int index = upper.indexOf(rank.toString());
			name = line.substring(index + rank.toString().length() + 1);
			if (name.indexOf(":")>=0){
				name  = name.substring(name.indexOf(":")+1);
			}
		}
		return name;
	}
	
	public TaxonRank extractTaxonRank(String line) {
		String rank = "";
		if (line.indexOf(":", 0) >= 0) {
			int index = line.indexOf(":");
			rank = line.substring(0,index);
			while(rank.indexOf(" ")==0)
				rank = rank.substring(1);
			if (rank.indexOf(" ")>0)
				rank = rank.substring(0,rank.indexOf(" "));
		}
		
		for (TaxonRank r : TaxonRank.values()) { 
			if (r.name().equalsIgnoreCase(rank))
				return r;
		}
		return null;
	}

}
