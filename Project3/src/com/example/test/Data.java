package com.example.test;

import java.util.ArrayList;

public class Data {
	
	private ArrayList<Row> _array;
	
	public ArrayList<Row> getArray() { return _array; }
	
	public void setArray(ArrayList<Row> _a) { _array = _a; }
	
	public Data() {
		_array = new ArrayList<Row>();
	}
	
	public Data(ArrayList<Row> array) {
		this._array = array;
	}
}
