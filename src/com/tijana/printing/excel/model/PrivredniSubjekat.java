package com.tijana.printing.excel.model;

public class PrivredniSubjekat {
	
	 	private String mb;
	    private String tip;
	    //private float grupa;
	 
	    public PrivredniSubjekat() {
	    }	 
	    public String getMb() {
			return mb;
		}
		public void setMb(String mb) {
			this.mb = mb;
		}

		public String getTip() {
			return tip;
		}
		public void setTip(String tip) {
			this.tip = tip;
		}
		public String toString() {
	        return String.format("%s - %s - %f", mb, tip);
	    }
	 

}
