package com.mp.spring.pojo;

public class TmpPojo {
	private int tmp;

	public TmpPojo() {
		this(-1);
	}
	
	public TmpPojo(int i) {
		this.tmp = i;
	}
	
	public int getTmp() {
		return tmp;
	}
	
	public void setTmp(int tmp) {
		this.tmp = tmp;
	}

	@Override
	public String toString() {
		return "\nTmpPojo [tmp=" + tmp + "]";
	}
}
