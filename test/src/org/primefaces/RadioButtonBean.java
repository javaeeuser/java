package org.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@ViewScoped
public class RadioButtonBean {

	private boolean one;
	private boolean oneone;

	private boolean onetwo;
	private boolean onetwoone;

	private boolean onetwotwo;
	private boolean two;
	private boolean twoone;
	private boolean twotwo;
	private boolean twotwoone;
	private boolean twotwotwo;

	public void print(){
		if(one && oneone && onetwoone)
			System.out.println("nice work");
		
	}

	public void toggleOne(AjaxBehaviorEvent e) {
		if (!one) {
			oneone = false;
			onetwo = false;
			onetwoone = false;
			onetwotwo = false;
		}
		if (one && two) {
			two = false;
		}
		if (one && !two) {
			twotwo = false;
			twoone = false;
			twotwoone = false;
			twotwotwo = false;
		}

	}

	public void toggleOneOne(AjaxBehaviorEvent e) {

		if (oneone && onetwo) {
			onetwo = false;
		}
	}

	public void toggleOneTwo(AjaxBehaviorEvent e) {
		if (oneone && onetwo) {
			oneone = false;
		}

	}

	public void toggleOneTwoOne(AjaxBehaviorEvent e) {
		if (onetwoone && onetwotwo) {
			onetwotwo = false;
		}
	}

	public void toggleOneTwoTwo(AjaxBehaviorEvent e) {
		if (onetwoone && onetwotwo) {
			onetwoone = false;
		}
	}

	public void toggleTwo(AjaxBehaviorEvent e) {

		if (!two) {
			twoone = false;
			twotwo = false;
			twotwoone = false;
			twotwotwo = false;
		}
		if (two && one) {
			one = false;
		}
		if (two && !one) {
			onetwo = false;
			oneone = false;
			onetwoone = false;
			onetwotwo = false;
		}
	}

	public void toggleTwoOne(AjaxBehaviorEvent e) {

		if (twoone && twotwo) {
			twotwo = false;
		}
	}

	public void toggleTwoTwo(AjaxBehaviorEvent e) {

		if (twoone && twotwo) {
			twoone = false;
		}
	}

	public void toggleTwoTwoOne(AjaxBehaviorEvent e) {
		if (twotwoone && twotwotwo) {
			twotwotwo = false;
		}
	}

	public void toggleTwoTwoTwo(AjaxBehaviorEvent e) {

		if (twotwoone && twotwotwo) {
			twotwoone = false;
		}
	}

	public boolean isOne() {
		return one;
	}

	public void setOne(boolean one) {
		this.one = one;
	}

	public boolean isOneone() {
		return oneone;
	}

	public void setOneone(boolean oneone) {
		this.oneone = oneone;
	}

	public boolean isOnetwo() {
		return onetwo;
	}

	public void setOnetwo(boolean onetwo) {
		this.onetwo = onetwo;
	}

	public boolean isOnetwoone() {
		return onetwoone;
	}

	public void setOnetwoone(boolean onetwoone) {
		this.onetwoone = onetwoone;
	}

	public boolean isOnetwotwo() {
		return onetwotwo;
	}

	public void setOnetwotwo(boolean onetwotwo) {
		this.onetwotwo = onetwotwo;
	}

	public boolean isTwo() {
		return two;
	}

	public void setTwo(boolean two) {
		this.two = two;
	}

	public boolean isTwoone() {
		return twoone;
	}

	public void setTwoone(boolean twoone) {
		this.twoone = twoone;
	}

	public boolean isTwotwo() {
		return twotwo;
	}

	public void setTwotwo(boolean twotwo) {
		this.twotwo = twotwo;
	}

	public boolean isTwotwoone() {
		return twotwoone;
	}

	public void setTwotwoone(boolean twotwoone) {
		this.twotwoone = twotwoone;
	}

	public boolean isTwotwotwo() {
		return twotwotwo;
	}

	public void setTwotwotwo(boolean twotwotwo) {
		this.twotwotwo = twotwotwo;
	}

}
