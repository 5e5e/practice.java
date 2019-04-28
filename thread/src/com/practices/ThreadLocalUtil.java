package com.practices;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalUtil {
	static private final ThreadLocal<List<Integer>> intThreadLocal = new ThreadLocal<>();
	static private final ThreadLocal<List<String>> strThreadLocal = new ThreadLocal<>();

	static public List<Integer> getIntList() {
		return intThreadLocal.get();
	}

	static public List<String> getStrList() {
		return strThreadLocal.get();
	}

	static public void addInt(Integer intNum) {
		List<Integer> list = intThreadLocal.get();
		if (list == null) list = new ArrayList<>();
		list.add(intNum);
		intThreadLocal.set(list);
	}

	static public void addStr(String str) {
		List<String> list = strThreadLocal.get();
		if (list == null) list = new ArrayList<>();
		list.add(str);
		strThreadLocal.set(list);
	}
}
