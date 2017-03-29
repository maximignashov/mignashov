package ru.job4j.loop;

/**
* Paint.
* @author mignashov
* @since 29.03.2017
* @version 1.0
*/
public class Paint {
	/**
	* Painting pyramid.
	* @param h  - height.
	* @return pyramid.
	*/
	public String piramid(int h) {
		StringBuilder sBuilder = new StringBuilder();
		int pWidth = h - 1 + h;
		for (int height = 1; height <= h; height++) {
			int spaces = h - height;
			int endPir = pWidth - spaces;
			for (int width = 1; width <= pWidth; width++) {
				if ((spaces < width) & (width <= endPir)) {
					sBuilder.append("^");
				} else {
					sBuilder.append(" ");
				}
			}
			if (height != h) {
				sBuilder.append(System.getProperty("line.separator"));
			}
		}
		return sBuilder.toString();
	}
}