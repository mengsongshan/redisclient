package com.mengmiao.core;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Frame;

public class GeneralForm {

	Dialog form = null;

	public GeneralForm(Frame owner, String title) {
		form = new Dialog(owner, title);
		form.setLayout(new BorderLayout());
	}

}
