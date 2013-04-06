package dulw;

import java.io.Serializable;
import java.util.List;

public class SignalWrapper implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 131910896835914776L;
	private int simplingFrequency;
	private ValuesType valuesType;
	private SignalType signalType;
	private List<double[]> data;
	private boolean isRecovered;
	
	private double t1;
	private double d;
	private double A;
	private double T;
	private double kw;
	private double ts;
	private int ns;
	private double probability ;
	private double f;
	
	
	public int getSimplingFrequency() {
		return simplingFrequency;
	}
	public void setSimplingFrequency(int simplingFrequency) {
		this.simplingFrequency = simplingFrequency;
	}
	public ValuesType getValuesType() {
		return valuesType;
	}
	public void setValuesType(ValuesType valuesType) {
		this.valuesType = valuesType;
	}
	public List<double[]> getData() {
		return data;
	}
	public void setData(List<double[]> data) {
		this.data = data;
	}
	public double getT1() {
		return t1;
	}
	public void setT1(double t1) {
		this.t1 = t1;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public double getA() {
		return A;
	}
	public void setA(double a) {
		A = a;
	}
	public double getT() {
		return T;
	}
	public void setT(double t) {
		T = t;
	}
	public double getKw() {
		return kw;
	}
	public void setKw(double kw) {
		this.kw = kw;
	}
	public double getTs() {
		return ts;
	}
	public void setTs(double ts) {
		this.ts = ts;
	}
	public int getNs() {
		return ns;
	}
	public void setNs(int ns) {
		this.ns = ns;
	}
	public double getProbability() {
		return probability;
	}
	public void setProbability(double probability) {
		this.probability = probability;
	}
	public double getF() {
		return f;
	}
	public void setF(double f) {
		this.f = f;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setSignalType(SignalType signalType) {
		this.signalType = signalType;
	}
	public SignalType getSignalType() {
		return signalType;
	}
	public void setIsRecovered(boolean isRecovered) {
		this.isRecovered = isRecovered;
	}
	public boolean getIsRecovered() {
		return isRecovered;
	}
	
	
	

}
