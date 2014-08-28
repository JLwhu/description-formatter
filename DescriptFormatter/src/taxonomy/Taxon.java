package taxonomy;

import org.jdom2.Attribute;
import org.jdom2.Element;

public class Taxon {
	private TaxonRank rank;
	
	private String VARIETYname="";
	private String SUBSPECIESname="";
	private String SPECIESname="";
	private String SUBSECTIONname="";
	private String SECTIONname="";
	private String SUBGENUSname="";
	private String GENUSname="";
	private String SUBTRIBEname="";
	private String TRIBEname="";
	private String SUBFAMILYname="";
	private String FAMILYname="";
	private String SUPERFAMILYname="";
	private String SUBORDERname="";
	private String ORDERname="";
	private String SUPERORDERname="";
	private String SUBCLASSname="";
	private String CLASSname="";
	private String SUPERCLASSname="";
	private String SUBDIVISIONname="";
	private String DIVISIONname="";
	private String SUPERDIVISIONname="";
	private String SUBPHYLUMname="";
	private String PHYLUMname="";
	private String KINGDOMname="";
	private String DOMAINname="";
	
	private String description;
	
	public TaxonRank getRank(){
		return rank;
	};
	
	public void setRank(TaxonRank rank){
		this.rank = rank;
	};
	
	public void setRankName(TaxonRank rank,String name){
		switch (rank) {
		case DOMAIN:
			setDOMAINname(name);
			break;
		case KINGDOM:
			setKINGDOMname(name);
			break;
		case PHYLUM:
			setPHYLUMname(name);
			break;
		case SUBPHYLUM:
			setSUBPHYLUMname(name);
			break;
		case SUPERDIVISION:
			setSUPERDIVISIONname(name);
			break;
		case DIVISION:
			setDIVISIONname(name);
			break;
		case SUBDIVISION:
			setSUBDIVISIONname(name);
			break;
		case SUPERCLASS:
			setSUPERCLASSname(name);
			break;
		case CLASS:
			setCLASSname(name);
			break;
		case SUBCLASS:
			setSUBCLASSname(name);
			break;
		case ORDER:
			setORDERname(name);
			break;
		case SUBORDER:
			setSUBORDERname(name);
			break;
		case SUPERFAMILY:
			setSUPERFAMILYname(name);
			break;
		case FAMILY:
			setFAMILYname(name);
			break;
		case SUBFAMILY:
			setSUBFAMILYname(name);
			break;
		case TRIBE:
			setTRIBEname(name);
			break;
		case SUBTRIBE:
			setSUBTRIBEname(name);
			break;
		case GENUS:
			setGENUSname(name);
			break;
		case SUBGENUS:
			setSUBGENUSname(name);
			break;
		case SECTION:
			setSECTIONname(name);
			break;
		case SUBSECTION:
			setSUBSECTIONname(name);
			break;
		case SPECIES:
			setSPECIESname(name);
			break;
		case SUBSPECIES:
			setSUBSPECIESname(name);
			break;
		case VARIETY:
			setVARIETYname(name);
			break;
		}
	}
	
	public void getRankName(TaxonRank rank){
		switch (rank) {
		case DOMAIN:
			getDOMAINname();
			break;
		case KINGDOM:
			getKINGDOMname();
			break;
		case PHYLUM:
			getPHYLUMname();
			break;
		case SUBPHYLUM:
			getSUBPHYLUMname();
			break;
		case SUPERDIVISION:
			getSUPERDIVISIONname();
			break;
		case DIVISION:
			getDIVISIONname();
			break;
		case SUBDIVISION:
			getSUBDIVISIONname();
			break;
		case SUPERCLASS:
			getSUPERCLASSname();
			break;
		case CLASS:
			getCLASSname();
			break;
		case SUBCLASS:
			getSUBCLASSname();
			break;
		case ORDER:
			getORDERname();
			break;
		case SUBORDER:
			getSUBORDERname();
			break;
		case SUPERFAMILY:
			getSUPERFAMILYname();
			break;
		case FAMILY:
			getFAMILYname();
			break;
		case SUBFAMILY:
			getSUBFAMILYname();
			break;
		case TRIBE:
			getTRIBEname();
			break;
		case SUBTRIBE:
			getSUBTRIBEname();
			break;
		case GENUS:
			getGENUSname();
			break;
		case SUBGENUS:
			getSUBGENUSname();
			break;
		case SECTION:
			getSECTIONname();
			break;
		case SUBSECTION:
			getSUBSECTIONname();
			break;
		case SPECIES:
			getSPECIESname();
			break;
		case SUBSPECIES:
			getSUBSPECIESname();
			break;
		case VARIETY:
			getVARIETYname();
			break;
		}
	}
	
	public String getVARIETYname(){
		return VARIETYname;
	};
	
	public void setVARIETYname(String name){
		VARIETYname = name;
	};
	
	public String getSUBSPECIESname(){
		return SUBSPECIESname;
	};
	
	public void setSUBSPECIESname(String name){
		SUBSPECIESname = name;
	};
	
	public String getSPECIESname(){
		return SPECIESname;
	};
	
	public void setSPECIESname(String name){
		SPECIESname = name;
	};
	
	public String getSUBSECTIONname(){
		return SUBSECTIONname;
	};
	
	public void setSUBSECTIONname(String name){
		SUBSECTIONname = name;
	};
	
	public String getSECTIONname(){
		return SECTIONname;
	};
	
	public void setSECTIONname(String name){
		SECTIONname = name;
	};
	
	public String getSUBGENUSname(){
		return SUBGENUSname;
	};
	
	public void setSUBGENUSname(String name){
		SUBGENUSname = name;
	};
	
	public String getGENUSname(){
		return GENUSname;
	};
	
	public void setGENUSname(String name){
		GENUSname = name;
	};
	
	public String getSUBTRIBEname(){
		return SUBTRIBEname;
	};
	
	public void setSUBTRIBEname(String name){
		SUBTRIBEname = name;
	};
	
	public String getTRIBEname(){
		return TRIBEname;
	};
	
	public void setTRIBEname(String name){
		TRIBEname = name;
	};
	
	public String getSUBFAMILYname(){
		return SUBFAMILYname;
	};
	
	public void setSUBFAMILYname(String name){
		SUBFAMILYname = name;
	};
	
	public String getFAMILYname(){
		return FAMILYname;
	};
	
	public void setFAMILYname(String name){
		FAMILYname = name;
	};
	
	public String getSUPERFAMILYname(){
		return SUPERFAMILYname;
	};
	
	public void setSUPERFAMILYname(String name){
		SUPERFAMILYname = name;
	};
	
	public String getSUBORDERname(){
		return SUBORDERname;
	};
	
	public void setSUBORDERname(String name){
		SUBORDERname = name;
	};
	
	public String getORDERname(){
		return ORDERname;
	};
	
	public void setORDERname(String name){
		ORDERname = name;
	};
	
	public String getSUPERORDERname(){
		return SUPERORDERname;
	};
	
	public void setSUPERORDERname(String name){
		SUPERORDERname = name;
	};

	public String getSUBCLASSname(){
		return SUBCLASSname;
	};
	
	public void setSUBCLASSname(String name){
		SUBCLASSname = name;
	};

	public String getCLASSname(){
		return CLASSname;
	};
	
	public void setCLASSname(String name){
		CLASSname = name;
	};
	
	public String getSUPERCLASSname(){
		return SUPERCLASSname;
	};
	
	public void setSUPERCLASSname(String name){
		SUPERCLASSname = name;
	};
	
	public String getSUBDIVISIONname(){
		return SUBDIVISIONname;
	};
	
	public void setSUBDIVISIONname(String name){
		SUBDIVISIONname = name;
	};
	
	public String getDIVISIONname(){
		return DIVISIONname;
	};
	
	public void setDIVISIONname(String name){
		DIVISIONname = name;
	};
	
	public String getSUPERDIVISIONname(){
		return SUPERDIVISIONname;
	};
	
	public void setSUPERDIVISIONname(String name){
		SUPERDIVISIONname = name;
	};
	
	public String getSUBPHYLUMname(){
		return SUBPHYLUMname;
	};
	
	public void setSUBPHYLUMname(String name){
		SUBPHYLUMname = name;
	};
	
	public String getKINGDOMname(){
		return KINGDOMname;
	};
	
	public void setKINGDOMname(String name){
		KINGDOMname = name;
	};
	
	public String getPHYLUMname(){
		return PHYLUMname;
	};
	
	public void setPHYLUMname(String name){
		PHYLUMname = name;
	};
	
	public String getDOMAINname(){
		return DOMAINname;
	};
	
	public void setDOMAINname(String name){
		DOMAINname = name;
	};
	
	public String getDescription(){
		return description;
	};
	
	public void setDescription(String description){
		this.description = description;
	};
	
	public Element createTreatmentElement(){
		Element treatment = new Element("treatment");
		Element taxonid = new Element("TaxonIdentification")
				.setAttribute(new Attribute("Status", "ACCEPTED"));
		Element taxonhier = new Element("TaxonHierarchy");
		Element descript = new Element("description").setText(description);
		
		String taxonhierText = "";
		

		if (DOMAINname.length()>0){
			taxonid.addContent(new Element("domain_name")
			.setText(DOMAINname));
			taxonhierText += "domain " + DOMAINname + ";";
		}
		
		if (KINGDOMname.length()>0){
			taxonid.addContent(new Element("kingdom_name")
			.setText(KINGDOMname));
			taxonhierText += "kingdom " + KINGDOMname + ";";
		}
		
		if (PHYLUMname.length()>0){
			taxonid.addContent(new Element("phylum_name")
			.setText(PHYLUMname));
			taxonhierText += "phylum " + PHYLUMname + ";";
		}
		
		if (SUBPHYLUMname.length()>0){
			taxonid.addContent(new Element("subphylum_name")
			.setText(SUBPHYLUMname));
			taxonhierText += "subphylum " + SUBPHYLUMname + ";";
		}
		
		if (SUPERDIVISIONname.length()>0){
			taxonid.addContent(new Element("superdivision_name")
			.setText(SUPERDIVISIONname));
			taxonhierText += "superdivision " + SUPERDIVISIONname + ";";
		}
		
		if (DIVISIONname.length()>0){
			taxonid.addContent(new Element("division_name")
			.setText(DIVISIONname));
			taxonhierText += "division " + DIVISIONname + ";";
		}
		
		if (SUBDIVISIONname.length()>0){
			taxonid.addContent(new Element("subdivision_name")
			.setText(SUBDIVISIONname));
			taxonhierText += "subdivision " + SUBDIVISIONname + ";";
		}
		
		if (SUPERCLASSname.length()>0){
			taxonid.addContent(new Element("superclass_name")
			.setText(SUPERCLASSname));
			taxonhierText += "superclass " + SUPERCLASSname + ";";
		}
		
		if (CLASSname.length()>0){
			taxonid.addContent(new Element("class_name")
			.setText(CLASSname));
			taxonhierText += "class " + CLASSname + ";";
		}
		
		if (SUBCLASSname.length()>0){
			taxonid.addContent(new Element("subclass_name")
			.setText(SUBCLASSname));
			taxonhierText += "subclass " + SUBCLASSname + ";";
		}
		
		if (SUPERORDERname.length()>0){
			taxonid.addContent(new Element("superorder_name")
			.setText(SUPERORDERname));
			taxonhierText += "superorder " + SUPERORDERname + ";";
		}
		
		if (ORDERname.length()>0){
			taxonid.addContent(new Element("order_name")
			.setText(ORDERname));
			taxonhierText += "order" + ORDERname + ";";
		}
		
		if (SUBORDERname.length()>0){
			taxonid.addContent(new Element("suborder_name")
			.setText(SUBORDERname));
			taxonhierText += "suborder " + SUBORDERname + ";";
		}
		
		if (SUPERFAMILYname.length()>0){
			taxonid.addContent(new Element("superfamily_name")
			.setText(SUPERFAMILYname));
			taxonhierText += "superfamily " + SUPERFAMILYname + ";";
		}
		
		if (FAMILYname.length()>0){
			taxonid.addContent(new Element("family_name")
			.setText(FAMILYname));
			taxonhierText += "family " + FAMILYname + ";";
		}
		
		if (SUBFAMILYname.length()>0){
			taxonid.addContent(new Element("subfamily_name")
			.setText(SUBFAMILYname));
			taxonhierText += "subfamily " + SUBFAMILYname + ";";
		}
		
		if (TRIBEname.length()>0){
			taxonid.addContent(new Element("tribe_name")
			.setText(TRIBEname));
			taxonhierText += "tribe " + TRIBEname + ";";
		}
		
		if (SUBTRIBEname.length()>0){
			taxonid.addContent(new Element("subtribe_name")
			.setText(SUBTRIBEname));
			taxonhierText += "subtribe " + SUBTRIBEname + ";";
		}
		
		if (GENUSname.length()>0){
			taxonid.addContent(new Element("genus_name")
			.setText(GENUSname));
			taxonhierText += "genus " + GENUSname + ";";
		}
		
		if (SUBGENUSname.length()>0){
			taxonid.addContent(new Element("subgenus_name")
			.setText(SUBGENUSname));
			taxonhierText += "subgenus " + SUBGENUSname + ";";
		}
		
		if (SECTIONname.length()>0){
			taxonid.addContent(new Element("section_name")
			.setText(SECTIONname));
			taxonhierText += "section " + SECTIONname + ";";
		}
		
		if (SUBSECTIONname.length()>0){
			taxonid.addContent(new Element("subsection_name")
			.setText(SUBSECTIONname));
			taxonhierText += "subsection " + SUBSECTIONname + ";";
		}
		
		if (SPECIESname.length()>0){
			taxonid.addContent(new Element("species_name")
			.setText(SPECIESname));
			taxonhierText += "species " + SPECIESname + ";";
		}
		
		if (SUBSPECIESname.length()>0){
			taxonid.addContent(new Element("subspecies_name")
			.setText(SUBSPECIESname));
			taxonhierText += "subspecies " + SUBSPECIESname + ";";
		}
		
		if (VARIETYname.length()>0){
			taxonid.addContent(new Element("variety_name")
			.setText(VARIETYname));
			taxonhierText += "variety " + VARIETYname + ";";
		}
		
		taxonhier.setText(taxonhierText);

		treatment.addContent(taxonid);
		treatment.addContent(taxonhier);
		treatment.addContent(descript);
		
		return treatment;

	}

}
