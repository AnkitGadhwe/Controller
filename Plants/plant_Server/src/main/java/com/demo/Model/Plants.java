package com.demo.Model;

public class Plants {
	private String PID;
	private String PTITLE;
	private String PDESCRIPTION;
	private Double PRATING;
	private String PPRICE;
	private Integer PSTOCKAVAILABILITY;
	private String PIMAGES;
	
	

	public Plants() {
		super();
	}
	
	public Plants(String pID, String pTITLE, String pDESCRIPTION, double pRATING, String pPRICE, int pSTOCKAVAILABILITY,
			String pIMAGES) {
		super();
		PID = pID;
		PTITLE = pTITLE;
		PDESCRIPTION = pDESCRIPTION;
		PRATING = pRATING;
		PPRICE = pPRICE;
		PSTOCKAVAILABILITY = pSTOCKAVAILABILITY;
		PIMAGES = pIMAGES;
	}

	public String getPID() {
		return PID;
	}

	public void setPID(String pID) {
		PID = pID;
	}

	public String getPTITLE() {
		return PTITLE;
	}

	public void setPTITLE(String pTITLE) {
		PTITLE = pTITLE;
	}

	public String getPDESCRIPTION() {
		return PDESCRIPTION;
	}

	public void setPDESCRIPTION(String pDESCRIPTION) {
		PDESCRIPTION = pDESCRIPTION;
	}

	public double getPRATING() {
		return PRATING;
	}

	public void setPRATING(double pRATING) {
		PRATING = pRATING;
	}

	public String getPPRICE() {
		return PPRICE;
	}

	public void setPPRICE(String pPRICE) {
		PPRICE = pPRICE;
	}

	public int getPSTOCKAVAILABILITY() {
		return PSTOCKAVAILABILITY;
	}

	public void setPSTOCKAVAILABILITY(int pSTOCKAVAILABILITY) {
		PSTOCKAVAILABILITY = pSTOCKAVAILABILITY;
	}

	public String getPIMAGES() {
		return PIMAGES;
	}

	public void setPIMAGES(String pIMAGES) {
		PIMAGES = pIMAGES;
	}

	@Override
	public String toString() {
		return "Plants [PID=" + PID + ", PTITLE=" + PTITLE + ", PDESCRIPTION=" + PDESCRIPTION + ", PRATING=" + PRATING
				+ ", PPRICE=" + PPRICE + ", PSTOCKAVAILABILITY=" + PSTOCKAVAILABILITY + ", PIMAGES=" + PIMAGES + "]";
	}
	
}
