/**
 * 
 */
package com.shrvn.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Shravan
 *
 */
public class CutTheSticks {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int stickCount = Integer.parseInt(br.readLine());
			System.out.println("Stick Count " +stickCount);
			String sticks = br.readLine();
			List<String> stickList_ = Arrays.asList(sticks.split(" "));

			List<Integer> stickList = new ArrayList<Integer>();
			for (String str : stickList_) {
				stickList.add(Integer.parseInt((String)str));
			}

			while (stickList.size() > 0){
				int positiveNumbers = 0;
				ListIterator<Integer> iter = stickList.listIterator();
				int currentMin = Collections.min(stickList);
				while (iter.hasNext()) {
					int next = iter.next();
					positiveNumbers++;
					iter.set(next -= currentMin);
					if (next <= 0){
						iter.remove();
					}


				}
				System.out.println(positiveNumbers);
			}
		}
		catch (IOException io){
			io.printStackTrace();
		}
	}
}
