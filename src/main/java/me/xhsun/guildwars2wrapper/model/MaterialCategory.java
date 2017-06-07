package me.xhsun.guildwars2wrapper.model;

import java.util.List;

/**
 * For more info on Material Category API go <a href="https://wiki.guildwars2.com/wiki/API:2/materials">here</a><br/>
 * Material category model class
 *
 * @author xhsun
 * @see Item item info
 * @since 2017-02-07
 */

public class MaterialCategory extends Identifiable {
	private List<Integer> items;

	public List<Integer> getItems() {
		return items;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MaterialCategory that = (MaterialCategory) o;

		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public String toString() {
		return "MaterialCategory{" +
				"id=" + getId() +
				", name='" + getName() + '\'' +
				", items=" + items +
				'}';
	}
}
