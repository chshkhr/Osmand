package net.osmand.plus.mapmarkers;

import androidx.annotation.DrawableRes;

public class GroupHeader {

	@DrawableRes
	private int iconRes;
	private ItineraryGroup group;

	public GroupHeader(int iconRes, ItineraryGroup group) {
		this.iconRes = iconRes;
		this.group = group;
	}

	@DrawableRes
	public int getIconRes() {
		return iconRes;
	}

	public ItineraryGroup getGroup() {
		return group;
	}
}
