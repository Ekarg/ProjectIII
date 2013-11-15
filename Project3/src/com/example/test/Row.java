package com.example.test;

public class Row {

   private int index;        

   private int branch;  

   private float x_val;
   
   private float y_val;

   private float z_val;
   
   private float radius;  
   
   private int second_index;
   
   public int getIndex() { return index; }
   public int getBranch() { return branch; }
   public float getX() { return x_val; }
   public float getY() { return y_val; }
   public float getZ() { return z_val; }
   public float getRadius() { return radius; }
   public int getSecondIndex() { return second_index; }
   
   public Row() {
	   super();
   }
   
   public Row(int index, int branch, float x_val, float y_val, float z_val, float radius,  int second_index) {
	   this.index = index;
	   this.branch = branch;
	   this.x_val = x_val;
	   this.y_val = y_val;
	   this.z_val = z_val;
	   this.radius = radius;
	   this.second_index = second_index;
   }
   
}
