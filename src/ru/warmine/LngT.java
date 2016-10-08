package ru.warmine;

public class LngT {
	//Main x
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
	public static final String MAIN_CMAX = "<b>Достигнут предел. Вы не можете захватить больше земли";
	public static final String MAIN_CPOW = "<b>Недостаточно силы для захвата территории.";
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
	
	//MPlayer entity class
	public static final String PLAYER_MOVED = "<i>setFactionId moved <h>%s <i>aka <h>%s <i>from <h>%s <i>aka <h>%s <i>to <h>%s <i>aka <h>%s<i>.";
	public static final String PLAYER_REMOVE_PL = "Игрок ";
	public static final String PLAYER_REMOVE_REM = " was auto-removed due to inactivity.";
	public static final String PLAYER_LEAVE_LEADER = "<b>You must give the leader role to someone else first.";
	public static final String PLAYER_LEAVE_NEGPOWER = "<b>You cannot leave until your power is positive.";
	public static final String PLAYER_LEAVE_LEFT = "%s<i> left %s<i>.";
	public static final String PLAYER_LEAVE_LOG = " left the faction: ";
	public static final String PLAYER_LEAVE_DISBAND = "%s <i>was disbanded since you were the last player.";
	public static final String PLAYER_LEAVE_DISBAND_ONE = "The faction ";
	public static final String PLAYER_LEAVE_DISBAND_TWO = " was disbanded due to the last player ";
	public static final String PLAYER_LEAVE_DISBAND_THREE = " leaving.";
	public static final String PLAYER_CLAIM_CHUNK = "<h>%s<i> %s <h>%d <i>chunk %s<i>.";
	public static final String PLAYER_CLAIM_CHUNKS = "<h>%s<i> %s <h>%d <i>chunks near %s<i>.";
	public static final String PLAYER_CLAIM_OWNS = "%s<i> already owns this land.";
	
	//TODO Econ integration class
	public static final String ECON_BALANCE = "<a>%s's<i> balance is <h>%s<i>.";
	public static final String ECON_LACK_WITHDRAW = "<h>%s<i> lack permission to withdraw money from <h>%s<i>.";
	public static final String ECON_LACK_DEPOSIT = "<h>%s<i> lack permission to deposit money to <h>%s<i>.";
	public static final String ECON_CANTAFORD = "<h>%s<b> can't afford to transfer <h>%s<b> to %s<b>.";
	public static final String ECON_UNABLE = "Unable to transfer %s<b> to <h>%s<b> from <h>%s<b>.";
	public static final String ECON_TRANS = "<h>%s<i> was transfered from <h>%s<i> to <h>%s<i>.";
	public static final String ECON_GAVE = "<h>%s<i> <h>gave %s<i> to <h>%s<i>.";
	public static final String ECON_TOOK = "<h>%s<i> <h>took %s<i> from <h>%s<i>.";
	public static final String ECON_TRANSFROM = "<h>%s<i> transfered <h>%s<i> from <h>%s<i> to <h>%s<i>.";
	public static final String ECON_HASCANTAFFORD = "<h>%s<i> can't afford <h>%s<i> %s.";
	public static final String ECON_GAINED = "<h>%s<i> gained <h>%s<i> since %s did %s.";
	public static final String ECON_LOST = "<h>%s<i> lost <h>%s<i> since %s did %s.";
	public static final String ECON_GETFAIL = "<h>%s<i> would have gained <h>%s<i> since %s did %s, but the deposit failed.";
	public static final String ECON_CANTAFFORDTO = "<h>%s<i> can't afford <h>%s<i> to %s.";
	
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
	
	public static final String CMD_INVITE_LIST_LIST = "Invited Players List";
	public static final String CMD_INVITE_LIST_ARE = "are";
	public static final String CMD_INVITE_LIST_IS = "is";
	public static final String CMD_INVITE_LIST_THE = "the";
	public static final String CMD_INVITE_LIST_OF = "of";
	public static final String CMD_INVITE_LIST_IN = "in";
	
	public static final String CMD_INVITE_REMOVE_NOTINV = "<b>Your faction has not invited anyone.";
	public static final String CMD_INVITE_REMOVE_WKICK = "You might want to kick him. ";
	public static final String CMD_INVITE_REMOVE_ALREADY = "%s<i> is already a member of %s<i>.";
	public static final String CMD_INVITE_REMOVE_REVOKED = "%s<i> revoked your invitation to <h>%s<i>.";
	public static final String CMD_INVITE_REMOVE_REVOKED_F = "%s<i> revoked %s's<i> invitation.";
	public static final String CMD_INVITE_REMOVE_WINV = "You might want to invite him. ";
	public static final String CMD_INVITE_REMOVE_INFMSG = "%s <i>is not invited to %s<i>.";
	public static final String CMD_INVITE_REMOVE_FREV = "%s<i> revoked ";
	public static final String CMD_INVITE_REMOVE_FPEN = "<i>all <h>%s <i>pending invitations";
	public static final String CMD_INVITE_REMOVE_FROM = " from your faction.";
	
	public static final String CMD_JOIN_NOPERM = "<b>You do not have permission to move other players into a faction.";
	public static final String CMD_JOIN_ARE = " are";
	public static final String CMD_JOIN_IS = " is";
	public static final String CMD_JOIN_ALRM = " already a member of ";
	public static final String CMD_JOIN_LIMIT = " <b>!<white> The faction %s is at the limit of %d members, so %s cannot currently join.";
	public static final String CMD_JOIN_MUST = " must leave ";
	public static final String CMD_JOIN_YOUR = "your";
	public static final String CMD_JOIN_THEIR = "their";
	public static final String CMD_JOIN_CURRENT = " current faction first.";
	public static final String CMD_JOIN_NEGPOW = "<b>%s cannot join a faction with a negative power level.";
	public static final String CMD_JOIN_INVREQ = "<i>This faction requires invitation.";
	public static final String CMD_JOIN_TRIED = "%s<i> tried to join your faction.";
	public static final String CMD_JOIN_MOVEDYOU = "<i>%s <i>moved you into the faction %s<i>.";
	public static final String CMD_JOIN_FJOINED = "<i>%s <i>joined <lime>your faction<i>.";
	public static final String CMD_JOIN_PJOINED = "<i>%s <i>successfully joined %s<i>.";
	public static final String CMD_JOIN_LOG = "%s joined the faction %s.";
	public static final String CMD_JOIN_LOGMV = "%s moved the player %s into the faction %s.";

	public static final String CMD_KICK_YOURSELFT = "<b>You can't kick yourself.";
	public static final String CMD_KICK_MIGHT = "You might want to: ";
	public static final String CMD_KICK_LEADER = "<b>The leader cannot be kicked.";
	public static final String CMD_KICK_HRANK = "<b>You can't kick people of higher rank than yourself.";
	public static final String CMD_KICK_SRANK = "<b>You can't kick people of the same rank as yourself.";
	public static final String CMD_KICK_POWERPOS = "<b>You can't kick that person until their power is positive.";
	public static final String CMD_KICK_FKICKED = "%s<i> kicked %s<i> from the faction! :O";
	public static final String CMD_KICK_PKICKED = "%s<i> kicked you from %s<i>! :O";
	public static final String CMD_KICK_YKICKED = "<i>You kicked %s<i> from the faction %s<i>!";
	public static final String CMD_KICK_KICKED = " kicked ";
	public static final String CMD_KICK_FROMF = " from the faction ";
	
	public static final String CMD_LIST_FLIST = "Faction List";
	public static final String CMD_LIST_FLESS = "<i>Factionless<i> %d online";
	public static final String CMD_LIST_RSTR = "%s<i> %d/%d online, %d/%d/%d";
	
	public static final String CMD_MAP_ON = "<i>Map auto update <green>ENABLED.";
	public static final String CMD_MAP_OFF = "<i>Map auto update <red>DISABLED.";
	
	//MONEY LOGS
	public static final String CMD_MONEY_DEPOSITE = "%s deposited %s in the faction bank: %s";
	public static final String CMD_MONEY_TRANSFERFF = "%s transferred %s from the faction \"%s\" to the faction \"%s\"";
	public static final String CMD_MONEY_TRANSEFFP = "%s transferred %s from the faction \"%s\" to the player \"%s\"";
	public static final String CMD_MONEY_TRANSEFPF = "%s transferred %s from the player \"%s\" to the faction \"%s\"";
	public static final String CMD_MONEY_WITHDRAW = "%s withdrew %s from the faction bank: %s";

	public static final String CMD_MOTD_NO = "<silver>nothing";
	public static final String CMD_MOTD_ALREADY = "<i>The motd for %s <i>is already: <h>%s";
	public static final String CMD_MOTD_SET = "<i>%s <i>set your faction motd to:\n%s";
	
	public static final String CMD_NAME_TAKEN = "<b>That name is already taken";
	public static final String CMD_NAME_CHANGED = "%s<i> changed your faction name to %s";
	public static final String CMD_NAME_YOUCHANGED = "<i>You changed the faction name to %s";

	public static final String CMD_OVERRIDE_ENABLED = "<g>ENABLED";
	public static final String CMD_OVERRIDE_DISABLED = "<b>DISABLED";
	public static final String CMD_OVERRIDE_PMSG = "<i>%s %s <i>override mode.";

	public static final String CMD_PERM_LIST_AVAIL = "Available Faction Perms";
	public static final String CMD_PERM_SET_NOTEDIT = "<b>The perm <h>%s <b>is not editable.";
	public static final String CMD_PERM_SET_ALREADY = "%s <i>already has %s <i>set to %s <i>for %s<i>.";
	public static final String CMD_PERM_SET_YES = "<g>YES";
	public static final String CMD_PERM_SET_NO = "<b>NOO";
	public static final String CMD_PERM_SET_PERMFOR = "Perm for ";
	public static final String CMD_PERM_SET_SETPERM = "<h>%s <i>set a perm for <h>%s<i>.";
	
	public static final String CMD_PLAYER_HEADER = "Player ";
	public static final String CMD_PLAYER_POWERBAR = "<a>Power: <v>%s";
	public static final String CMD_PLAYER_POWERTXT = "<a>Power: <v>%.2f / %.2f";
	public static final String CMD_PLAYER_BOOST = "bonus";
	public static final String CMD_PLAYER_PENALTY = "penalty";
	public static final String CMD_PLAYER_POWERBOOST = "<a>Power Boost: <v>%f <i>(a manually granted %s)";
	public static final String CMD_PLAYER_LEFTMAX = " <i>(%s <i>left till max)";
	public static final String CMD_PLAYER_POWERHOUR = "<a>Power per Hour: <v>%.2f%s";
	public static final String CMD_PLAYER_POWERDEATH = "<a>Power per Death: <v>%.2f";
	public static final String CMD_PLAYER_AUTOREMOVE = "<i>Automatic removal after %s <i>of inactivity:";
	
	public static final String CMD_POWERBOOST_SPECIFY = "<b>You must specify \"p\" or \"player\" to target a player or \"f\" or \"faction\" to target a faction.";
	public static final String CMD_POWERBOOST_EXAMPLE = "<b>ex. /f powerboost p SomePlayer 0.5  -or-  /f powerboost f SomeFaction -5";
	public static final String CMD_POWERBOOST_PLAYER = "Player ";
	public static final String CMD_POWERBOOST_FACTION = "Faction ";
	public static final String CMD_POWERBOOST_MSG_NOWHAS = " now has a power bonus/penalty of ";
	public static final String CMD_POWERBOOST_MSG_PLVL = " to min and max power levels.";
	public static final String CMD_POWERBOOST_LOG_HAS = " has set the power bonus/penalty for ";
	public static final String CMD_POWERBOOST_LOG_TO = " to ";
	
	public static final String CMD_RANK_DOESNT = "%s <b>doesn't use ranks sorry :(";
	public static final String CMD_RANK_YOURSELFT = "<b>The target player mustn't be yourself.";
	public static final String CMD_RANK_NOTSAMEF = "%s <b>is not in the same faction as you.";
	public static final String CMD_RANK_CANTCHG = "<b>You can't change %s's <b>faction.";
	public static final String CMD_RANK_MUSTHIGHER = "<b>You must be <h>%s <b>or higher to change ranks.";
	public static final String CMD_RANK_CANTMANAGE = "<h>%s <b>can't manage eachother.";
	public static final String CMD_RANK_CANTHIGHER = "<b>You can't manage people of higher rank.";
	public static final String CMD_RANK_CANTEQUAL = "<b>You can't set ranks equal to your own.";
	public static final String CMD_RANK_CANTSETHIGHER = "<b>You can't set ranks higher than your own.";
	public static final String CMD_RANK_ALREADY = "%s <b>is already %s.";
	public static final String CMD_RANK_ARE = "are";
	public static final String CMD_RANK_IS = "is";
	public static final String CMD_RANK_THE = "the";
	public static final String CMD_RANK_OF = "of";
	public static final String CMD_RANK_IN = "in";
	public static final String CMD_RANK_FLESS = "%s <i>%s factionless";
	public static final String CMD_RANK_CANNOTREMOVELEAD = "<b>You cannot remove the present leader. Demote them first.";
	public static final String CMD_RANK_WASMOVED = "%s <i>was moved from <i>%s to <i>%s<i>.";
	public static final String CMD_RANK_MOVEDLOG = "%s moved %s from %s to %s.";
	public static final String CMD_RANK_YOUDEMOTED = "<i>You have been demoted from the position of faction leader by %s<i>.";
	public static final String CMD_RANK_ADMIN = "A server admin";
	public static final String CMD_RANK_GAVE = "%s<i> gave %s<i> the leadership of %s<i>.";
	public static final String CMD_RANK_TARGETDEMOTED = "<i>The target was a leader and got demoted. The faction disbanded and no rank was set.";
	public static final String CMD_RANK_DEMOTED = "demoted";
	public static final String CMD_RANK_PROMOTED = "promoted";
	public static final String CMD_RANK_WERE = "were";
	public static final String CMD_RANK_WAS = "was";
	public static final String CMD_RANK_FROM = "%s<i> %s %s from %s to <h>%s <i>in %s<i>.";
	
	public static final String CMD_RELATION_YOURSELF = "<b>Nope! You can't declare a relation to yourself :)";
	public static final String CMD_RELATION_ALREADY = "<b>You already have that relation wish set with %s.";
	public static final String CMD_RELATION_ISNOW = "%s<i> is now %s."; //2X
	public static final String CMD_RELATION_WISHES = "%s<i> wishes to be %s. ";
	public static final String CMD_RELATION_INFORMED = "%s<i> were informed that you wish to be %s<i>.";
	public static final String CMD_RELATION_PEACEFUL = "<i>This will have no effect while your faction is peaceful.";

	public static final String CMD_SC_ON = "<g>ON";
	public static final String CMD_SC_OFF = "<b>OFF";
	public static final String CMD_SC_ALREADY = "<i>See Chunk is already %s<i>.";
	public static final String CMD_SC_ISNOW = "<i>See Chunk is now %s<i>.";
	
	//Одинаково для claimer и unlcaimer. Обычные /f claim и unclaim дальше.
	public static final String CMD_CLAIMER_ALL_CHUNK = "<h>%s<i> %s <h>%d <i>chunk using "; //2x
	public static final String CMD_CLAIMER_ALL_CHUNKS = "<h>%s<i> %s <h>%d <i>chunks using "; //2x
	public static final String CMD_CLAIMER_ALL_WHICH = "<b>You must specify which map from console.";
	
	public static final String CMD_CLAIMER_AUTO_DISABLED = "<i>Disabled auto-setting as you walk around.";
	public static final String CMD_CLAIMER_AUTO_ENABLED = "<i>Now auto-setting <h>%s<i> land.";

	public static final String CMD_CLAIMER_FILL_CHUNK = "<h>%s<i> %s <h>%d <i>chunk %s<i> using fill.";
	public static final String CMD_CLAIMER_FILL_CHUNKS = "<h>%s<i> %s <h>%d <i>chunks near %s<i> using fill.";
	public static final String CMD_CLAIMER_FILL_LIMIT = "<b>Fill limit of <h>%d <b>reached.";

	public static final String CMD_CLAIMER_SQUARE_CHUNK = "<h>%s<i> %s <h>%d <i>chunk %s<i> using square.";
	public static final String CMD_CLAIMER_SQUARE_CHUNKS = "<h>%s<i> %s <h>%d <i>chunks near %s<i> using square.";
	
	//а вот и claim
	public static final String CMD_CLAIM_CHUNK = "<h>%s<i> %s <h>%d <i>чанк %s<i>.";
	public static final String CMD_CLAIM_CHUNKS = "<h>%s<i> %s <h>%d <i>чанков рядом с %s<i>.";
	public static final String CMD_CLAIM_IFRAD_MIN = "<b>If you specify a radius, it must be at least 1.";
	public static final String CMD_CLAIM_IFRAD_MAX = "<b>The maximum radius allowed is <h>%s<b>.";
	
	public static final String CMD_SETHOME_INSIDEONLY = "<b>Sorry, your faction home can only be set inside your own claimed territory.";
	public static final String CMD_SETHOME_SET = "%s<i> set the home for your faction. You can now use:";
	public static final String CMD_SETHOME_FMSG = "<i>You have set the home for ";
	
	public static final String CMD_SETPOWER_ALREADY = "%s's <i>power is already <h>%.2f<i>.";
	public static final String CMD_SETPOWER_YOUCHANGED = "<i>You changed %s's <i>power from <h>%.2f <i>to <h>%.2f<i>.";
	public static final String CMD_SETPOWER_HECHANGED = "%s <i>changed your power from <h>%.2f <i>to <h>%.2f<i>.";
	
	public static final String CMD_STATUS_OF = "<i>Status of %s<i>.";
	public static final String CMD_STATUS_POWER = "<art>Power: %s%.0f<gray>/<green>%.0f";
	public static final String CMD_STATUS_ONLIINE = "<lime>Online right now.";
	public static final String CMD_STATUS_LAST = "<i>Last active: ";
	
	public static final String CMD_TT_ON = "<g>ON";
	public static final String CMD_TT_OFF = "<b>OFF";
	public static final String CMD_TT_ALREADY = "<i>Territory titles is already %s<i>.";
	public static final String CMD_TT_SET = "<i>Territory titles is now %s<i>.";
	
	public static final String CMD_TITLE_CANTHIGH = "<b>You can not edit titles for higher ranks.";
	public static final String CMD_TITLE_CHANGED = "%s<i> changed a title: %s";
	
	public static final String CMD_UNSETHOME_ALREADY = "<i>%s <i>does already not have a home.";
	public static final String CMD_UNSETHOME_FMSG = "%s<i> unset the home for your faction.";
	public static final String CMD_UNSETHOME_YOUMSG = "<i>You have unset the home for ";
	
	public static final String CMD_UNSTUCK_NOSTUCK = "<b>You don't seem to be stuck.";
	public static final String CMD_UNSTUCK_NONEAR = "<b>No nearby chunk with %s<b> or build rights found.";
	
	//DENR
	public static final String CMD_ALLYHOME_NOTALLY = " is not ally or truce for your faction!";
	public static final String CMD_ALLYHOME_NOYOURS = "%s %sdidn't set %s home for your faction";
	public static final String CMD_ALLYHOME_OF = " home of ";
	public static final String CMD_SETALLYHOME_YOU = "%sYou have successfully set %s home for faction: %s";
	public static final String CMD_SETALLYHOME_FACTION = "%s %shas just set %s home for your faction\nTo teleport use: %s/f %shome %s";
	public static final String CMD_HISTORY_HEADER = "%s*** История транзакций, %sстраница %d%s ***";
	public static final String CMD_HISTORY_NO = "%sЗаписей не найдено!";
	public static final String CMD_HISTORY_PAGEINT = "%sНомер страницы должен быть положительным числом!";
}
