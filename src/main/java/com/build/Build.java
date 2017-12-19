package com.build;

import com.generator.MyGenerator.MyGenerator;

public class Build {
	public static void main(String[] args) {
		MyGenerator generator = new MyGenerator("com", "javen_config.txt", true);
		generator.generate();
	}
}
