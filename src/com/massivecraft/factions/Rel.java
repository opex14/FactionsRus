package com.massivecraft.factions;

import java.util.Collections;
import java.util.Set;

import org.bukkit.ChatColor;

import com.massivecraft.factions.entity.MConf;
import com.massivecraft.massivecore.collections.MassiveSet;


public enum Rel
{
	// -------------------------------------------- //
	// ENUM
	// -------------------------------------------- //
	
	ENEMY(
		"враг", "враги", "вражеская фракция", "вражеские фракции",
		"Враг"
	),
	NEUTRAL(
		"нейтральный", "нейтральные", "нейтральная фракция", "нейтральные фракции",
		"Нейтральный"
	),
	TRUCE(
		"в перемирии", "в перемирии", "фракция в перемирии", "фракции в перемирии",
		"Перемирие"
	),
	ALLY(
		"союзник", "союзники", "союзная фракция", "союзные фракции",
		"Союз"
	),
	RECRUIT(
		"рекрут в вашей фракции", "рекруты в вашей фракции", "", "",
		"Рекрут"
	),
	MEMBER(
		"член вашей фракции", "члены вашей фракции", "ваша фракция", "ваши фракции",
		"Участник"
	),
	OFFICER
	(
		"офицер вашей фракции", "офицеры вашей фракции", "", "",
		"Офицер", "Модератор"
	),
	LEADER("лидер вашей фракции", "лидер вашей фракции", "", "",
		"Лидер", "Админ", "Владелец"
	),
	
	// END OF LIST
	;
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	public int getValue() { return this.ordinal(); }
	
	private final String descPlayerOne;
	public String getDescPlayerOne() { return this.descPlayerOne; }
	
	private final String descPlayerMany;
	public String getDescPlayerMany() { return this.descPlayerMany; }
	
	private final String descFactionOne;
	public String getDescFactionOne() { return this.descFactionOne; }
	
	private final String descFactionMany;
	public String getDescFactionMany() { return this.descFactionMany; }
	
	private final Set<String> names;
	public Set<String> getNames() { return this.names; }
	public String getName() { return this.getNames().iterator().next(); }
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	private Rel(String descPlayerOne, String descPlayerMany, String descFactionOne, String descFactionMany, String... names)
	{
		this.descPlayerOne = descPlayerOne;
		this.descPlayerMany = descPlayerMany;
		this.descFactionOne = descFactionOne;
		this.descFactionMany = descFactionMany;
		this.names = Collections.unmodifiableSet(new MassiveSet<String>(names));
	}
	
	// -------------------------------------------- //
	// UTIL
	// -------------------------------------------- //
	
	public boolean isAtLeast(Rel rel)
	{
		return this.getValue() >= rel.getValue();
	}
	
	public boolean isAtMost(Rel rel)
	{
		return this.getValue() <= rel.getValue();
	}
	
	public boolean isLessThan(Rel rel)
	{
		return this.getValue() < rel.getValue();
	}
	
	public boolean isMoreThan(Rel rel)
	{
		return this.getValue() > rel.getValue();
	}
	
	public boolean isRank()
	{
		return this.isAtLeast(Rel.RECRUIT);
	}
	
	// Used for friendly fire.
	public boolean isFriend()
	{
		return this.isAtLeast(TRUCE);
	}
	
	public ChatColor getColor()
	{
		if (this.isAtLeast(RECRUIT))
			return MConf.get().colorMember;
		else if (this == ALLY)
			return MConf.get().colorAlly;
		else if (this == NEUTRAL)
			return MConf.get().colorNeutral;
		else if (this == TRUCE)
			return MConf.get().colorTruce;
		else
			return MConf.get().colorEnemy;
	}
	
	public String getPrefix()
	{
		if (this == LEADER)
		{
			return MConf.get().prefixLeader;
		} 
		
		if (this == OFFICER)
		{
			return MConf.get().prefixOfficer;
		}
		
		if (this == MEMBER)
		{
			return MConf.get().prefixMember;
		}
		
		if (this == RECRUIT)
		{
			return MConf.get().prefixRecruit;
		}
		
		return "";
	}
	
}
