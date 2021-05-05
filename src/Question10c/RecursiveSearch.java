/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10c;

import java.util.ArrayList;

/**
 *
 * @author Pruthvi Raj Padthe
 */
public class RecursiveSearch {
    
         public int recSearch(ArrayList arr, int l, int r, int x)
	     {
	          if (r < l)
	             return -1;
	          if (arr.get(l).equals(x))
	             return l;
	          if (arr.get(r).equals(x))
	             return r;
	          return recSearch(arr, l+1, r-1, x);
	     }
	 }