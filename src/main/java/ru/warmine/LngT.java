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
	public static final String MAIN_CDIS = "<b>Приват земель выключен в <h>%s<b>.";
	public static final String MAIN_CMEM = "<b>В клане должно быть минимум <h>%s<b> чтобы захватить территорию.";
	public static final String MAIN_CMAX = "<b>Достигнут предел. Вы не можете захватить больше земли";
	public static final String MAIN_CPOW = "<b>Недостаточно силы для захвата территории.";
	public static final String MAIN_CCONE = "<b>Вы можете заприватить новую территорию, если она соединена с вашим основным приватом или под контролем другого клана!";
	public static final String MAIN_CCON = "<b>Вы можете заприватить новую территорию если она соединена с вашим основным приватом!";
	public static final String MAIN_COTH = "<b>Вы не можете захватывать территорию других кланов.";
	public static final String MAIN_CREL = "<b>Вы не можете захватить эту территорию из-за дружественных отношений с данной фракцией.";
	public static final String MAIN_CSTR = "%s<i> достаточно сильны для удерживания данной территории.";
	public static final String MAIN_CBOR = "<b>Вы должны начинать захват территории с края привата.";
	public static final String MAIN_AST = "<i>У вас стандартные права на этой территории.";
	public static final String MAIN_AEL = "<g>У вас есть полный доступ к данной территории.";
	public static final String MAIN_AED = "<b>У вас нет прав на данной территории.";
	public static final String MAIN_DLOST = "<i>Вы не теряете силу умирая на данной территории.";
	public static final String MAIN_DLOSW = "<i>Вы не теряете силу умирая в данном мире.";
	public static final String MAIN_YPOW = "<i>Теперь ваша сила <h>%.2f / %.2f";
	public static final String MAIN_PVPDIS = "<i>PVP запрещено в %s.";
	public static final String MAIN_HFJ = "<i>Вы не можете атаковать других игроков, пока не вступите в клан.";
	public static final String MAIN_HOFJ = "<i>Вы не можете атаковать игроков у которых нет клана.";
	public static final String MAIN_HC = "<i>Вы не можете навредить %s<i>.";
	public static final String MAIN_HTE = "<i>Вы не можете навредить %s<i> на его территории пока не обьявите войну.";
	public static final String MAIN_TH = "%s<i> попытался вас ударить.";
	public static final String MAIN_EDR = "<i>Урон по врагу снижен на <rose>%s<i>.";
	public static final String MAIN_YCUP = "<b>Вы не можете использовать \"<h>/%s<b>\" как член фракции.";
	public static final String MAIN_CTER = "<b>Вы не можете использовать \"<h>/%s<b>\" на %s территории.";
	public static final String MAIN_PBLD = "<b>Это больно стоить на данной территории %s<b>.";
	
	//MPlayer entity class
	public static final String PLAYER_MOVED = "<i>setFactionId moved <h>%s <i>aka <h>%s <i>from <h>%s <i>aka <h>%s <i>to <h>%s <i>aka <h>%s<i>.";
	public static final String PLAYER_REMOVE_PL = "Игрок ";
	public static final String PLAYER_REMOVE_REM = " Был кикнут за долгое афк.";
	public static final String PLAYER_LEAVE_LEADER = "<b>Вначале вы должны передать лидера кому-то другому.";
	public static final String PLAYER_LEAVE_NEGPOWER = "<b>Вы не можете выйти пока у вас позитивная сила.";
	public static final String PLAYER_LEAVE_LEFT = "%s<i> Покинул %s<i>.";
	public static final String PLAYER_LEAVE_LOG = " Покинул клан: ";
	public static final String PLAYER_LEAVE_DISBAND = "%s <i>Фракция была распущена, так как вы были последним игроком.";
	public static final String PLAYER_LEAVE_DISBAND_ONE = "Фракция ";
	public static final String PLAYER_LEAVE_DISBAND_TWO = " была распущена из-за последниго игрока ";
	public static final String PLAYER_LEAVE_DISBAND_THREE = " Покидает.";
	public static final String PLAYER_CLAIM_CHUNK = "<h>%s<i> %s <h>%d <i>chunk %s<i>.";
	public static final String PLAYER_CLAIM_CHUNKS = "<h>%s<i> %s <h>%d <i>chunks near %s<i>.";
	public static final String PLAYER_CLAIM_OWNS = "%s<i> Эта территория уже захвачена.";
	
	//TODO Econ integration class
	public static final String ECON_BALANCE = "<a>%s's<i> вашь баланс <h>%s<i>.";
	public static final String ECON_LACK_WITHDRAW = "<h>%s<i> Не достаточно прав чтоб забирать деньги из <h>%s<i>.";
	public static final String ECON_LACK_DEPOSIT = "<h>%s<i> Не достаточно прав для вклада денег <h>%s<i>.";
	public static final String ECON_CANTAFORD = "<h>%s<b> Не достаточно денег для перевода <h>%s<b> to %s<b>.";
	public static final String ECON_UNABLE = "Не возможно совершить транзакцию %s<b> для <h>%s<b> от <h>%s<b>.";
	public static final String ECON_TRANS = "<h>%s<i> деньги были перенесены из <h>%s<i> для <h>%s<i>.";
	public static final String ECON_GAVE = "<h>%s<i> <h>дал %s<i> для <h>%s<i>.";
	public static final String ECON_TOOK = "<h>%s<i> <h>забрал %s<i> из <h>%s<i>.";
	public static final String ECON_TRANSFROM = "<h>%s<i> совершил транзакцию <h>%s<i> из <h>%s<i> для <h>%s<i>.";
	public static final String ECON_HASCANTAFFORD = "<h>%s<i> не достаточно средств <h>%s<i> %s.";
	public static final String ECON_GAINED = "<h>%s<i> gained <h>%s<i> since %s did %s.";
	public static final String ECON_LOST = "<h>%s<i> lost <h>%s<i> since %s did %s.";
	public static final String ECON_GETFAIL = "<h>%s<i> would have gained <h>%s<i> since %s did %s, but the deposit failed.";
	public static final String ECON_CANTAFFORDTO = "<h>%s<i> не достаточно средств <h>%s<i> для %s.";
	
	//CMDS
	// f create
	public static final String CMD_CREATE_USED = "<b>Название занято.";
	public static final String CMD_CREATE_CRE = "<i>Вы создали фракцию %s";
	public static final String CMD_CREATE_CAN = "Теперь вы можете уствновить девиз фракции: ";
	public static final String CMD_CREATE_GLOBAL = " создал новую фракцию: ";
	
	//f desc
	public static final String CMD_DESC_SET = "<i>%s <i>сменил девиз вашей фракции на:\n%s";
	
	
	public static final String CMD_DISBAND_PERM = "<i>Данную фракцию нельзя распустить.";
	public static final String CMD_DISBAND_OK = "<h>%s<i> распустил вашу фракцию.";
	public static final String CMD_DISBAND_YOU = "<i>Вы распустили <h>%s<i>.";
	public static final String CMD_DISBAND_OK_GLOBAL = "<i>Фракция <h>%s <i>(<h>%s<i>) была распущена игроком <h>%s<i>.";
	
	public static final String CMD_F_HEAD = "Фракция ";
	//Вывод с команды прописан в секции Main

	public static final String CMD_FLAG_LIST_AVAL = "Available Faction Flags";
	//Список флагов в MFlag.java
	
	public static final String CMD_FLAG_SET_NE = "<b>Этот флаг <h>%s <b>нельзя изменять.";
	public static final String CMD_FLAG_SET_AL = "%s <i>уже имеет %s <i>set to %s<i>.";
	public static final String CMD_FLAG_SET_SET = "<h>%s <i>установить флаг для <h>%s<i>.";
	public static final String CMD_FLAG_SET_GLOBAL = "<h>%s <i>установить флаг для <h>%s<i>.";
	
	public static final String CMD_FLAG_SHOW_FF = "Флаг для ";

	public static final String CMD_HOME_OFF = "<b>Извините, телепортация домой запрещена на этом сервере.";
	public static final String CMD_HOME_FOR = "Дом для ";
	public static final String CMD_HOME_HOMELESS = "<b>%s <b>не имеет дома.";
	public static final String CMD_HOME_SHOULD = "<i>Вы должны:";
	public static final String CMD_HOME_ENEMY = "<b>Вы не можете телепортироваться %s <b>пока находитесь на вражеской территории.";
	public static final String CMD_HOME_WORLD = "<b>Вы не можете телепортироваться %s <b>пока находитесь в другом мире.";
	public static final String CMD_HOME_NEAR = "<b>Вы не можете телепортироваться %s <b>пока враг находится в %f блоков от вас.";
	
	public static final String CMD_INVITE_MEMBER = "%s<i> уже состоит в %s<i>.";
	public static final String CMD_INVITE_YOU = "%s<i> пригласил вас в %s<i>.";
	public static final String CMD_INVITE_INVYR = "%s<i> пригласил %s<i> в вашу фракцию.";
	public static final String CMD_INVITE_CLICK = "<i>Нажмите чтобы отменить <c>%s<i>.";
	public static final String CMD_INVITE_MREM = "Может быть вы хотите убрать его. ";
	public static final String CMD_INVITE_CLICKTO = "Нажмите для ";
	public static final String CMD_INVITE_ALREADY = "%s <i>Уже приглашен в %s<i>.";
	
	public static final String CMD_INVITE_LIST_LIST = "Список приглашённых игроков";
	public static final String CMD_INVITE_LIST_ARE = "are";
	public static final String CMD_INVITE_LIST_IS = "is";
	public static final String CMD_INVITE_LIST_THE = "the";
	public static final String CMD_INVITE_LIST_OF = "of";
	public static final String CMD_INVITE_LIST_IN = "in";
	
	public static final String CMD_INVITE_REMOVE_NOTINV = "<b>Ваша фракция никого не приглашала.";
	public static final String CMD_INVITE_REMOVE_WKICK = "Может быть вы хотите выгнать его. ";
	public static final String CMD_INVITE_REMOVE_ALREADY = "%s<i> уже состоит в %s<i>.";
	public static final String CMD_INVITE_REMOVE_REVOKED = "%s<i> забрал ваше приглашение <h>%s<i>.";
	public static final String CMD_INVITE_REMOVE_REVOKED_F = "%s<i> забрал у %s's<i> приглашение.";
	public static final String CMD_INVITE_REMOVE_WINV = "Может быть вы хотите пригласить его. ";
	public static final String CMD_INVITE_REMOVE_INFMSG = "%s <i>не приглашен в %s<i>.";
	public static final String CMD_INVITE_REMOVE_FREV = "%s<i> забрал ";
	public static final String CMD_INVITE_REMOVE_FPEN = "<i>все <h>%s <i>приглашённый игроки";
	public static final String CMD_INVITE_REMOVE_FROM = " из вашей фракции.";
	
	public static final String CMD_JOIN_NOPERM = "<b>У вас нет доступа для переноса игроков в другую фракцию.";
	public static final String CMD_JOIN_ARE = " are";
	public static final String CMD_JOIN_IS = " is";
	public static final String CMD_JOIN_ALRM = " уже состоит в ";
	public static final String CMD_JOIN_LIMIT = " <b>!<white> У фракции %s есть лимит %d игроков, поэтому %s вы не можете присоединится.";
	public static final String CMD_JOIN_MUST = " должен покинуть ";
	public static final String CMD_JOIN_YOUR = "your";
	public static final String CMD_JOIN_THEIR = "their";
	public static final String CMD_JOIN_CURRENT = " current faction first.";
	public static final String CMD_JOIN_NEGPOW = "<b>%s не может присоединится к фракции из-за негативное силы.";
	public static final String CMD_JOIN_INVREQ = "<i>Для вступления в эту фракцию нужно приглашение.";
	public static final String CMD_JOIN_TRIED = "%s<i> попытался присоединиться к вашей фракции.";
	public static final String CMD_JOIN_MOVEDYOU = "<i>%s <i>перенес вас в фракцию %s<i>.";
	public static final String CMD_JOIN_FJOINED = "<i>%s <i>присоединился <lime>к вашей фракции<i>.";
	public static final String CMD_JOIN_PJOINED = "<i>%s <i>успешно присоединился %s<i>.";
	public static final String CMD_JOIN_LOG = "%s присоединился к фракции %s.";
	public static final String CMD_JOIN_LOGMV = "%s перенес игрока %s в фракцию %s.";

	public static final String CMD_KICK_YOURSELFT = "<b>Вы не можете кикнуть себя.";
	public static final String CMD_KICK_MIGHT = "Может быть вы хотите: ";
	public static final String CMD_KICK_LEADER = "<b>Вы не можете выгнать лидера фракции.";
	public static final String CMD_KICK_HRANK = "<b>Вы не можете выгнать игрока выше рангом.";
	public static final String CMD_KICK_SRANK = "<b>Вы не можете выгнать игрока вашего ранга.";
	public static final String CMD_KICK_POWERPOS = "<b>Вы не можете выгнать этого игрока пока его сила негативна.";
	public static final String CMD_KICK_FKICKED = "%s<i> выгнал %s<i> из фракции! :O";
	public static final String CMD_KICK_PKICKED = "%s<i> выгнал вас из %s<i>! :O";
	public static final String CMD_KICK_YKICKED = "<i>Вы выгнали %s<i> из фракции %s<i>!";
	public static final String CMD_KICK_KICKED = " выгнан ";
	public static final String CMD_KICK_FROMF = " из фракции ";
	
	public static final String CMD_LIST_FLIST = "Список Фракций";
	public static final String CMD_LIST_FLESS = "<i>Factionless<i> %d онлайн";
	public static final String CMD_LIST_RSTR = "%s<i> %d/%d онлайн, %d/%d/%d";
	
	public static final String CMD_MAP_ON = "<i>Автоматическое обновление карты <green>ВКЛЮЧЕНО.";
	public static final String CMD_MAP_OFF = "<i>Автоматическое обновление карты <red>ВЫКЛЮЧЕНО.";
	
	//MONEY LOGS
	public static final String CMD_MONEY_DEPOSITE = "%s вложил %s в банк фракции: %s";
	public static final String CMD_MONEY_TRANSFERFF = "%s перевел %s из фракции \"%s\" в фракцию \"%s\"";
	public static final String CMD_MONEY_TRANSEFFP = "%s перевел %s из фракции \"%s\" игроку \"%s\"";
	public static final String CMD_MONEY_TRANSEFPF = "%s перевел %s от игрока \"%s\" в фракцию \"%s\"";
	public static final String CMD_MONEY_WITHDRAW = "%s снял %s из банка фракции: %s";

	public static final String CMD_MOTD_NO = "<silver>ничего";
	public static final String CMD_MOTD_ALREADY = "<i>Новости дня %s <i>уже имеются: <h>%s";
	public static final String CMD_MOTD_SET = "<i>%s <i>установил новости дня:\n%s";
	
	public static final String CMD_NAME_TAKEN = "<b>Это название уже занято";
	public static final String CMD_NAME_CHANGED = "%s<i> изменил название фракции на %s";
	public static final String CMD_NAME_YOUCHANGED = "<i>Вы изменили название фракции на %s";

	public static final String CMD_OVERRIDE_ENABLED = "<g>ВКЛЮЧЕНО";
	public static final String CMD_OVERRIDE_DISABLED = "<b>ВЫКЛЮЧЕНО";
	public static final String CMD_OVERRIDE_PMSG = "<i>%s %s <i>режим администратора фракции.";

	public static final String CMD_PERM_LIST_AVAIL = "Доступные права фракций";
	public static final String CMD_PERM_SET_NOTEDIT = "<b>Права <h>%s <b>не могут быть отредактированы.";
	public static final String CMD_PERM_SET_ALREADY = "%s <i>уже %s <i>установлены %s <i>для %s<i>.";
	public static final String CMD_PERM_SET_YES = "<g>YES";
	public static final String CMD_PERM_SET_NO = "<b>NOO";
	public static final String CMD_PERM_SET_PERMFOR = "Perm for ";
	public static final String CMD_PERM_SET_SETPERM = "<h>%s <i>set a perm for <h>%s<i>.";
	
	public static final String CMD_PLAYER_HEADER = "Игрок ";
	public static final String CMD_PLAYER_POWERBAR = "<a>Сила: <v>%s";
	public static final String CMD_PLAYER_POWERTXT = "<a>Сила: <v>%.2f / %.2f";
	public static final String CMD_PLAYER_BOOST = "бонус";
	public static final String CMD_PLAYER_PENALTY = "штраф";
	public static final String CMD_PLAYER_POWERBOOST = "<a>Дополнительная сила: <v>%f <i>(a manually granted %s)";
	public static final String CMD_PLAYER_LEFTMAX = " <i>(%s <i>до максимальной силы)";
	public static final String CMD_PLAYER_POWERHOUR = "<a>Восстановление силы в час: <v>%.2f%s";
	public static final String CMD_PLAYER_POWERDEATH = "<a>Потеря силы за смерть: <v>%.2f";
	public static final String CMD_PLAYER_AUTOREMOVE = "<i>Автоматическое понижение силы после %s <i>неактивности игрока:";
	
	public static final String CMD_POWERBOOST_SPECIFY = "<b>Вы должны указать \"p\" или \"player\" чтобы выделить игрока или \"f\" или \"faction\" для выделения фракции.";
	public static final String CMD_POWERBOOST_EXAMPLE = "<b>ex. /f powerboost p SomePlayer 0.5  -or-  /f powerboost f SomeFaction -5";
	public static final String CMD_POWERBOOST_PLAYER = "Игрок ";
	public static final String CMD_POWERBOOST_FACTION = "Фракция ";
	public static final String CMD_POWERBOOST_MSG_NOWHAS = " теперь имеет бонус / фтраф ";
	public static final String CMD_POWERBOOST_MSG_PLVL = " до минимального и максимального уровня силы.";
	public static final String CMD_POWERBOOST_LOG_HAS = " установил бонус / фтраф силы для ";
	public static final String CMD_POWERBOOST_LOG_TO = " to ";
	
	public static final String CMD_RANK_DOESNT = "%s <b>не использует систему рангов, извините :(";
	public static final String CMD_RANK_YOURSELFT = "<b>выделенный игрок не может быть вами.";
	public static final String CMD_RANK_NOTSAMEF = "%s <b>выделенный игрок не находится в вашей фракции.";
	public static final String CMD_RANK_CANTCHG = "<b>вы не можете заменять %s's <b>фракции.";
	public static final String CMD_RANK_MUSTHIGHER = "<b>Вы должны быть <h>%s <b>или выше чтобы менять ранги.";
	public static final String CMD_RANK_CANTMANAGE = "<h>%s <b>can't manage eachother.";
	public static final String CMD_RANK_CANTHIGHER = "<b>Вы не можете менять статус игрока выше вас по рангу.";
	public static final String CMD_RANK_CANTEQUAL = "<b>Вы не можете повысить игрока до вашего ранга.";
	public static final String CMD_RANK_CANTSETHIGHER = "<b>Вы больше не можете повысить данного игрока.";
	public static final String CMD_RANK_ALREADY = "%s <b>уже %s.";
	public static final String CMD_RANK_ARE = "are";
	public static final String CMD_RANK_IS = "is";
	public static final String CMD_RANK_THE = "the";
	public static final String CMD_RANK_OF = "of";
	public static final String CMD_RANK_IN = "in";
	public static final String CMD_RANK_FLESS = "%s <i>%s без фракции";
	public static final String CMD_RANK_CANNOTREMOVELEAD = "<b>Вы не можете понизить лидера фракции.";
	public static final String CMD_RANK_WASMOVED = "%s <i>был отправлен из <i>%s в <i>%s<i>.";
	public static final String CMD_RANK_MOVEDLOG = "%s отправлен %s из %s в %s.";
	public static final String CMD_RANK_YOUDEMOTED = "<i>Вас понизил с позиции лидера фракции %s<i>.";
	public static final String CMD_RANK_ADMIN = "Администратор сервера";
	public static final String CMD_RANK_GAVE = "%s<i> выдал %s<i> главу фракции %s<i>.";
	public static final String CMD_RANK_TARGETDEMOTED = "<i>Лидер фракции был понижен. И фракция была распущена.";
	public static final String CMD_RANK_DEMOTED = "demoted";
	public static final String CMD_RANK_PROMOTED = "promoted";
	public static final String CMD_RANK_WERE = "were";
	public static final String CMD_RANK_WAS = "was";
	public static final String CMD_RANK_FROM = "%s<i> %s %s from %s to <h>%s <i>in %s<i>.";
	
	public static final String CMD_RELATION_YOURSELF = "<b>Нет! Вы не можете установить отношения с вашей фракцией :)";
	public static final String CMD_RELATION_ALREADY = "<b>Вы уже установили данные отношения с %s.";
	public static final String CMD_RELATION_ISNOW = "%s<i> теперь %s."; //2X
	public static final String CMD_RELATION_WISHES = "%s<i> желают быть с вами %s. ";
	public static final String CMD_RELATION_INFORMED = "%s<i> были проинформированы что вы желаете стать %s<i>.";
	public static final String CMD_RELATION_PEACEFUL = "<i>Это не будет иметь никакого эффекта в то время как ваша фракция носит мирный характер.";

	public static final String CMD_SC_ON = "<g>ON";
	public static final String CMD_SC_OFF = "<b>OFF";
	public static final String CMD_SC_ALREADY = "<i>See Chunk is already %s<i>.";
	public static final String CMD_SC_ISNOW = "<i>See Chunk is now %s<i>.";
	
	//Одинаково для claimer и unlcaimer. Обычные /f claim и unclaim дальше.
	public static final String CMD_CLAIMER_ALL_CHUNK = "<h>%s<i> %s <h>%d <i>chunk using "; //2x
	public static final String CMD_CLAIMER_ALL_CHUNKS = "<h>%s<i> %s <h>%d <i>chunks using "; //2x
	public static final String CMD_CLAIMER_ALL_WHICH = "<b>You must specify which map from console.";
	
	public static final String CMD_CLAIMER_AUTO_DISABLED = "<i>Автоматический приват земель был отключен.";
	public static final String CMD_CLAIMER_AUTO_ENABLED = "<i>Автоматический приват <h>%s<i> земель включен.";

	public static final String CMD_CLAIMER_FILL_CHUNK = "<h>%s<i> %s <h>%d <i>chunk %s<i> using fill.";
	public static final String CMD_CLAIMER_FILL_CHUNKS = "<h>%s<i> %s <h>%d <i>chunks near %s<i> using fill.";
	public static final String CMD_CLAIMER_FILL_LIMIT = "<b>Fill limit of <h>%d <b>reached.";

	public static final String CMD_CLAIMER_SQUARE_CHUNK = "<h>%s<i> %s <h>%d <i>chunk %s<i> using square.";
	public static final String CMD_CLAIMER_SQUARE_CHUNKS = "<h>%s<i> %s <h>%d <i>chunks near %s<i> using square.";
	
	//а вот и claim
	public static final String CMD_CLAIM_CHUNK = "<h>%s<i> %s <h>%d <i>чанк %s<i>.";
	public static final String CMD_CLAIM_CHUNKS = "<h>%s<i> %s <h>%d <i>чанков рядом с %s<i>.";
	public static final String CMD_CLAIM_IFRAD_MIN = "<b>Если вы указываете радиус, он должен быть не менее 1.";
	public static final String CMD_CLAIM_IFRAD_MAX = "<b>Максимально доступный радиус <h>%s<b>.";
	
	public static final String CMD_SETHOME_INSIDEONLY = "<b>Извините, но дом фракции можно установить только на захваченной вами территории.";
	public static final String CMD_SETHOME_SET = "%s<i> установил дом для вашей фракции. Теперь вы можете телепортироваться на дом фракции:";
	public static final String CMD_SETHOME_FMSG = "<i>Вы установили дом для фракции ";
	
	public static final String CMD_SETPOWER_ALREADY = "%s's <i>power is already <h>%.2f<i>.";
	public static final String CMD_SETPOWER_YOUCHANGED = "<i>You changed %s's <i>power from <h>%.2f <i>to <h>%.2f<i>.";
	public static final String CMD_SETPOWER_HECHANGED = "%s <i>changed your power from <h>%.2f <i>to <h>%.2f<i>.";
	
	public static final String CMD_STATUS_OF = "<i>Статистика %s<i>.";
	public static final String CMD_STATUS_POWER = "<art>Сила: %s%.0f<gray>/<green>%.0f";
	public static final String CMD_STATUS_ONLIINE = "<lime>Сейчас онлайн.";
	public static final String CMD_STATUS_LAST = "<i>Последний раз был онлайн: ";
	
	public static final String CMD_TT_ON = "<g>ON";
	public static final String CMD_TT_OFF = "<b>OFF";
	public static final String CMD_TT_ALREADY = "<i>Territory titles is already %s<i>.";
	public static final String CMD_TT_SET = "<i>Territory titles is now %s<i>.";
	
	public static final String CMD_TITLE_CANTHIGH = "<b>Вы не можете меня титул игрока выше вас рангом.";
	public static final String CMD_TITLE_CHANGED = "%s<i> сменил титул: %s";
	
	public static final String CMD_UNSETHOME_ALREADY = "<i>%s <i>уже не имеют дома фракции.";
	public static final String CMD_UNSETHOME_FMSG = "%s<i> удалил дом вашей фракции.";
	public static final String CMD_UNSETHOME_YOUMSG = "<i>вы удалили дом вашей фракции ";
	
	public static final String CMD_UNSTUCK_NOSTUCK = "<b>Не похоже чтобы вы застряли :(";
	public static final String CMD_UNSTUCK_NONEAR = "<b>Поблизости нету чанков с %s<b> правом на постройку.";
	
	//DENR
	public static final String CMD_ALLYHOME_NOTALLY = " У вас нет мирных отношения с данной фракцией!";
	public static final String CMD_ALLYHOME_NOYOURS = "%s %sне установили %s дом для вашей ";
	public static final String CMD_ALLYHOME_OF = " home of ";
	public static final String CMD_SETALLYHOME_YOU = "%sВы успешно установили %s дом для фракции: %s";
	public static final String CMD_SETALLYHOME_FACTION = "%s %sУстановили %s дом для вашей фракции\nдля телепортации напишите: %s/f %shome %s";
	public static final String CMD_HISTORY_HEADER = "%s*** История транзакций, %sстраница %d%s ***";
	public static final String CMD_HISTORY_NO = "%sЗаписей не найдено!";
	public static final String CMD_HISTORY_PAGEINT = "%sНомер страницы должен быть положительным числом!";
        
}
