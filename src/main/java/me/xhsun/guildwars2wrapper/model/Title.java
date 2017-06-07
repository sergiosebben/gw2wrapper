package me.xhsun.guildwars2wrapper.model;

import me.xhsun.guildwars2wrapper.model.achievements.Achievement;

import java.util.List;

/**
 * For more info on titles API go <a href="https://wiki.guildwars2.com/wiki/API:2/titles">here</a><br/>
 * Model class for title
 *
 * @author xhsun
 * @since 2017-06-06
 */
public class Title extends Identifiable {
	private int achievement;
	private List<Integer> achievements;
	private int ap_required;

	/**
	 * @return {@link Achievement} id
	 */
	public int getAchievement() {
		return achievement;
	}

	/**
	 * @return list of {@link Achievement} id
	 */
	public List<Integer> getAchievements() {
		return achievements;
	}

	public int getApRequired() {
		return ap_required;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Title title = (Title) o;

		return getId() == title.getId();
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public String toString() {
		return "Title{" +
				"id=" + getId() +
				", name='" + getName() + '\'' +
				", achievement=" + achievement +
				", achievements=" + achievements +
				", ap_required=" + ap_required +
				'}';
	}
}
