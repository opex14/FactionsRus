package ru.warmine;

public class LngT {
	//Main
	public static final String MAIN_DESC = "Описание";
	public static final String MAIN_FAGE = "Возраст";
	public static final String MAIN_FLAG = "Флаги";
	public static final String MAIN_DEF = "<silver><italic>default";
	public static final String MAIN_BON = " (бонус: ";
	public static final String MAIN_PEN = " (штраф: ";
	public static final String MAIN_LPM = "Земли / Сила / Макс. сила";
	public static final String MAIN_COST = "Общая стоимость земель";
	public static final String MAIN_BANK = "Банк";
	public static final String MAIN_NONE = "<silver><italic>нет";
	public static final String MAIN_ALL = "<italic>*ВСЕ*";
	public static final String MAIN_REL = "<a>Отношения: %s%s<a> (%d):";
	public static final String MAIN_PLON = "<a>Игроки онлайн (%s):";
	public static final String MAIN_PLOFF = "<a>Игроки офлайн (%s):";
	public static final String MAIN_CDIS = "<b>Land claiming is disabled in <h>%s<b>.";
	public static final String MAIN_CMEM = "<b>Factions must have at least <h>%s<b> members to claim land.";
	public static final String MAIN_CMAX = "<b>Limit reached. You can't claim more land.";
	public static final String MAIN_CPOW = "<b>Недостаточно силы для захваты территории.";
	public static final String MAIN_CCONE = "<b>You can only claim additional land which is connected to your first claim or controlled by another faction!";
	public static final String MAIN_CCON = "<b>You can only claim additional land which is connected to your first claim!";
	public static final String MAIN_COTH = "<b>You may not claim land from others.";
	public static final String MAIN_CREL = "<b>You can't claim this land due to your relation with the current owner.";
	public static final String MAIN_CSTR = "%s<i> owns this land and is strong enough to keep it.";
	public static final String MAIN_CBOR = "<b>You must start claiming land at the border of the territory.";
	public static final String MAIN_AST = "<i>You have standard access to this area.";
	public static final String MAIN_AEL = "<g>You have elevated access to this area.";
	public static final String MAIN_AED = "<b>You have decreased access to this area.";
	public static final String MAIN_DLOST = "<i>You didn't lose any power since the territory you died in works that way.";
	public static final String MAIN_DLOSW = "<i>You didn't lose any power due to the world you died in.";
	public static final String MAIN_YPOW = "<i>Your power is now <h>%.2f / %.2f";
	public static final String MAIN_PVPDIS = "<i>PVP запрещено в %s.";
	public static final String MAIN_HFJ = "<i>You can't hurt other players until you join a faction.";
	public static final String MAIN_HOFJ = "<i>You can't hurt players who are not currently in a faction.";
	public static final String MAIN_HC = "<i>You can't hurt %s<i>.";
	public static final String MAIN_HTE = "<i>You can't hurt %s<i> in their own territory unless you declare them as an enemy.";
	public static final String MAIN_TH = "%s<i> tried to hurt you.";
	public static final String MAIN_EDR = "<i>Enemy damage reduced by <rose>%s<i>.";
	public static final String MAIN_YCUP = "<b>You can't use \"<h>/%s<b>\" as member of a permanent faction.";
	public static final String MAIN_CTER = "<b>You can't use \"<h>/%s<b>\" in %s territory.";
	public static final String MAIN_PBLD = "<b>It is painful to build in the territory of %s<b>.";
	
	//CMDS
	// f create
	public static final String CMD_CREATE_USED = "<b>Название занято.";
	public static final String CMD_CREATE_CRE = "<i>Вы создали фракцию %s";
	public static final String CMD_CREATE_CAN = "Теперь вы можете: ";
	public static final String CMD_CREATE_GLOBAL = " создал новую фракцию: ";
	
	//f desc
	public static final String CMD_DESC_SET = "<i>%s <i>сменил девиз вашей фракции на:\n%s";
	
	
	public static final String CMD_DISBAND_PERM = "<i>This faction is designated as permanent, so you cannot disband it.";
	public static final String CMD_DISBAND_OK = "<h>%s<i> распустил вашу фракцию.";
	public static final String CMD_DISBAND_YOU = "<i>Вы распустили <h>%s<i>.";
	public static final String CMD_DISBAND_OK_GLOBAL = "<i>Фракция <h>%s <i>(<h>%s<i>) была распущена игроком <h>%s<i>.";
	
	public static final String CMD_F_HEAD = "Фракция ";
	//Вывод с команды прописан в секции Main

	public static final String CMD_FLAG_LIST_AVAL = "Available Faction Flags";
	//Список флагов в MFlag.java
	
	public static final String CMD_FLAG_SET_NE = "<b>The flag <h>%s <b>is not editable.";
	public static final String CMD_FLAG_SET_AL = "%s <i>already has %s <i>set to %s<i>.";
	public static final String CMD_FLAG_SET_SET = "<h>%s <i>set a flag for <h>%s<i>.";
	public static final String CMD_FLAG_SET_GLOBAL = "<h>%s <i>set a flag for <h>%s<i>.";
	
	public static final String CMD_FLAG_SHOW_FF = "Flag for ";

	public static final String CMD_HOME_OFF = "<b>Sorry, the ability to teleport to Faction homes is disabled on this server.";
	public static final String CMD_HOME_FOR = "home for ";
	public static final String CMD_HOME_HOMELESS = "<b>%s <b>does not have a home.";
	public static final String CMD_HOME_SHOULD = "<i>You should:";
	public static final String CMD_HOME_ENEMY = "<b>You cannot teleport to %s <b>while in the territory of an enemy faction.";
	public static final String CMD_HOME_WORLD = "<b>You cannot teleport to %s <b>while in a different world.";
	public static final String CMD_HOME_NEAR = "<b>You cannot teleport to %s <b>while an enemy is within %f blocks of you.";
	
	public static final String CMD_INVITE_MEMBER = "%s<i> is already a member of %s<i>.";
	public static final String CMD_INVITE_YOU = "%s<i> invited you to %s<i>.";
	public static final String CMD_INVITE_INVYR = "%s<i> invited %s<i> to your faction.";
	public static final String CMD_INVITE_CLICK = "<i>Click to <c>%s<i>.";
	public static final String CMD_INVITE_MREM = "You might want to remove him. ";
	public static final String CMD_INVITE_CLICKTO = "Click to ";
	public static final String CMD_INVITE_ALREADY = "%s <i>is already invited to %s<i>.";
	
	
	
}
