package BlockEffects;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

@SuppressWarnings({"unchecked", "rawtypes"})
public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	public static Map<String, Object> globalVariables = new HashMap<>();

	public static PluginMain getInstance() {
		return instance;
	}

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		saveDefaultConfig();
		PluginMain.createResourceFile("database.yml");
		try {
			Object $be38e0c90f5bd77541fb43f60b0a67d9 = null;
			PluginMain.globalVariables.put("databaseFile",
					new java.io.File(String.valueOf(PluginMain.getInstance().getDataFolder()), "database.yml"));
			PluginMain.globalVariables.put("databaseData",
					org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(PluginMain
							.resolve_object(PluginMain.globalVariables.get("databaseFile"), java.io.File.class)));
			Object $TEMP_XOsmCNyerOy5rRhH = $be38e0c90f5bd77541fb43f60b0a67d9;
			new org.bukkit.scheduler.BukkitRunnable() {
				Object $FINAL_vrzEAyxLWQbGeSh8 = $TEMP_XOsmCNyerOy5rRhH;

				public void run() {
					try {
						if ((((double) PluginMain
								.resolve_object(org.bukkit.Bukkit.getOnlinePlayers(), java.util.List.class)
								.size()) >= ((double) 1))) {
							for (Object $FINAL_loopValue1 : PluginMain
									.resolve_object(PluginMain
											.resolve_object(PluginMain.globalVariables.get("databaseData"),
													org.bukkit.configuration.file.YamlConfiguration.class)
											.getKeys(false), java.lang.Iterable.class)) {
								if (String
										.valueOf(PluginMain
												.resolve_object(PluginMain.globalVariables.get("databaseData"),
														org.bukkit.configuration.file.YamlConfiguration.class)
												.get((String.valueOf($FINAL_loopValue1) + ".condition")))
										.contains(PluginMain.resolve_object("none", java.lang.CharSequence.class))) {
									org.bukkit.Bukkit
											.getWorld(String.valueOf(PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf($FINAL_loopValue1) + ".world"))))
											.spawnParticle(org.bukkit.Particle.valueOf(String.valueOf(PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf($FINAL_loopValue1) + ".type")))),
													java.lang.Double.parseDouble(String.valueOf(PluginMain
															.resolve_object(PluginMain.resolve_object(
																	PluginMain.globalVariables.get("databaseData"),
																	org.bukkit.configuration.file.YamlConfiguration.class)
																	.get((String.valueOf($FINAL_loopValue1)
																			+ ".location")),
																	java.util.List.class)
															.get(0))),
													java.lang.Double.parseDouble(String.valueOf(PluginMain
															.resolve_object(PluginMain.resolve_object(
																	PluginMain.globalVariables.get("databaseData"),
																	org.bukkit.configuration.file.YamlConfiguration.class)
																	.get((String.valueOf($FINAL_loopValue1)
																			+ ".location")),
																	java.util.List.class)
															.get(1))),
													java.lang.Double.parseDouble(String.valueOf(PluginMain
															.resolve_object(PluginMain.resolve_object(
																	PluginMain.globalVariables.get("databaseData"),
																	org.bukkit.configuration.file.YamlConfiguration.class)
																	.get((String.valueOf($FINAL_loopValue1)
																			+ ".location")),
																	java.util.List.class)
															.get(2))),
													java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
															PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
															.get((String.valueOf($FINAL_loopValue1) + ".amount")))),
													java.lang.Double.parseDouble(String.valueOf(PluginMain
															.resolve_object(PluginMain.resolve_object(
																	PluginMain.globalVariables.get("databaseData"),
																	org.bukkit.configuration.file.YamlConfiguration.class)
																	.get((String.valueOf($FINAL_loopValue1)
																			+ ".offset")),
																	java.util.List.class)
															.get(0))),
													java.lang.Double.parseDouble(String.valueOf(PluginMain
															.resolve_object(PluginMain.resolve_object(
																	PluginMain.globalVariables.get("databaseData"),
																	org.bukkit.configuration.file.YamlConfiguration.class)
																	.get((String.valueOf($FINAL_loopValue1)
																			+ ".offset")),
																	java.util.List.class)
															.get(1))),
													java.lang.Double.parseDouble(String.valueOf(PluginMain
															.resolve_object(PluginMain.resolve_object(
																	PluginMain.globalVariables.get("databaseData"),
																	org.bukkit.configuration.file.YamlConfiguration.class)
																	.get((String.valueOf($FINAL_loopValue1)
																			+ ".offset")),
																	java.util.List.class)
															.get(2))),
													java.lang.Double.parseDouble(String.valueOf(PluginMain
															.resolve_object(
																	PluginMain.globalVariables.get("databaseData"),
																	org.bukkit.configuration.file.YamlConfiguration.class)
															.get((String.valueOf($FINAL_loopValue1) + ".speed")))),
													PluginMain.function("getParticleData",
															PluginMain.resolve_object(
																	new ArrayList(Arrays.asList($FINAL_loopValue1)),
																	java.util.List.class)),
													true);
								} else {
									$FINAL_vrzEAyxLWQbGeSh8 = $FINAL_loopValue1;
									for (Object $FINAL_loopValue2 : PluginMain.resolve_object(
											org.bukkit.Bukkit.getOnlinePlayers(), java.lang.Iterable.class)) {
										if (PluginMain.checkEquals(
												me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
														PluginMain.resolve_object($FINAL_loopValue2,
																org.bukkit.entity.Player.class),
														String.valueOf(PluginMain
																.resolve_object(PluginMain.resolve_object(
																		PluginMain.globalVariables.get("databaseData"),
																		org.bukkit.configuration.file.YamlConfiguration.class)
																		.get((String.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																				+ ".condition")),
																		java.util.List.class)
																.get(0))),
												me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
														PluginMain.resolve_object($FINAL_loopValue2,
																org.bukkit.entity.Player.class),
														String.valueOf(PluginMain
																.resolve_object(PluginMain.resolve_object(
																		PluginMain.globalVariables.get("databaseData"),
																		org.bukkit.configuration.file.YamlConfiguration.class)
																		.get((String.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																				+ ".condition")),
																		java.util.List.class)
																.get(1))))) {
											PluginMain.resolve_object($FINAL_loopValue2, org.bukkit.entity.Player.class)
													.spawnParticle(org.bukkit.Particle.valueOf(String.valueOf(PluginMain
															.resolve_object(
																	PluginMain.globalVariables.get("databaseData"),
																	org.bukkit.configuration.file.YamlConfiguration.class)
															.get((String.valueOf($FINAL_vrzEAyxLWQbGeSh8) + ".type")))),
															java.lang.Double.parseDouble(String.valueOf(
																	PluginMain.resolve_object(PluginMain.resolve_object(
																			PluginMain.globalVariables
																					.get("databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																			.get((String
																					.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																					+ ".location")),
																			java.util.List.class).get(0))),
															java.lang.Double.parseDouble(String.valueOf(
																	PluginMain.resolve_object(PluginMain.resolve_object(
																			PluginMain.globalVariables
																					.get("databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																			.get((String
																					.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																					+ ".location")),
																			java.util.List.class).get(1))),
															java.lang.Double.parseDouble(String.valueOf(
																	PluginMain.resolve_object(PluginMain.resolve_object(
																			PluginMain.globalVariables
																					.get("databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																			.get((String
																					.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																					+ ".location")),
																			java.util.List.class).get(2))),
															java.lang.Integer.parseInt(String.valueOf(PluginMain
																	.resolve_object(
																			PluginMain.globalVariables.get(
																					"databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																	.get((String.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																			+ ".amount")))),
															java.lang.Double.parseDouble(String.valueOf(PluginMain
																	.resolve_object(PluginMain.resolve_object(
																			PluginMain.globalVariables
																					.get("databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																			.get((String
																					.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																					+ ".offset")),
																			java.util.List.class)
																	.get(0))),
															java.lang.Double.parseDouble(String.valueOf(PluginMain
																	.resolve_object(PluginMain.resolve_object(
																			PluginMain.globalVariables
																					.get("databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																			.get((String
																					.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																					+ ".offset")),
																			java.util.List.class)
																	.get(1))),
															java.lang.Double.parseDouble(String.valueOf(PluginMain
																	.resolve_object(PluginMain.resolve_object(
																			PluginMain.globalVariables
																					.get("databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																			.get((String
																					.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																					+ ".offset")),
																			java.util.List.class)
																	.get(2))),
															java.lang.Double.parseDouble(String.valueOf(PluginMain
																	.resolve_object(
																			PluginMain.globalVariables.get(
																					"databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																	.get((String.valueOf($FINAL_vrzEAyxLWQbGeSh8)
																			+ ".speed")))),
															PluginMain.function("getParticleData",
																	PluginMain.resolve_object(
																			new ArrayList(Arrays
																					.asList($FINAL_vrzEAyxLWQbGeSh8)),
																			java.util.List.class)),
															true);
										}
									}
								}
							}
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}.runTaskTimer(PluginMain.getInstance(), 0, ((long) 20));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("blockeffects")) {
			try {
				Object $b726a8c9f2037c8d9434f988ac84752e = null;
				Object $850bd423e857c5b68ae4e05925774d0e = null;
				Object $01f78d57244de193f3ac7900c43bd3b3 = null;
				Object $e9f4753b240e3d7cf6f623bba9e530ec = null;
				Object $e8e9447b9549849d754aa8f2d85cf4cc = null;
				Object $c2bf9c437d0cabf5d3713b8464945d64 = null;
				if (PluginMain.resolve_object(commandSender, org.bukkit.permissions.Permissible.class)
						.hasPermission("blockeffects.*")) {
					if (PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "reload")) {
						PluginMain.resolve_object(PluginMain.getInstance(), org.bukkit.plugin.Plugin.class)
								.reloadConfig();
						PluginMain
								.resolve_object(PluginMain.globalVariables.get("databaseData"),
										org.bukkit.configuration.file.YamlConfiguration.class)
								.load(PluginMain.resolve_object(PluginMain.globalVariables.get("databaseFile"),
										java.io.File.class));
						PluginMain.procedure("sendMessage", PluginMain.resolve_object(
								new ArrayList(Arrays.asList(commandSender, "reload",
										PluginMain.resolve_object(PluginMain.getInstance(),
												org.bukkit.plugin.Plugin.class).getDescription().getVersion())),
								java.util.List.class));
					} else if (PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "create")) {
						if ((((double) List.of(commandArgs).size()) >= java.lang.Double
								.parseDouble(
										PluginMain
												.resolve_object(
														PluginMain.checkEquals(commandSender,
																org.bukkit.Bukkit.getConsoleSender()),
														java.lang.Boolean.class)
												.toString().replaceAll("false", "3").replaceAll("true", "2")))) {
							try {
								if (!PluginMain.checkEquals(commandSender, org.bukkit.Bukkit.getConsoleSender())) {
									$850bd423e857c5b68ae4e05925774d0e = new ArrayList(
											Arrays.asList(
													java.math.BigDecimal
															.valueOf(
																	PluginMain
																			.resolve_object(commandSender,
																					org.bukkit.entity.Player.class)
																			.getX())
															.setScale(2, java.math.RoundingMode.HALF_UP),
													java.math.BigDecimal
															.valueOf(
																	PluginMain
																			.resolve_object(commandSender,
																					org.bukkit.entity.Player.class)
																			.getY())
															.setScale(2, java.math.RoundingMode.HALF_UP),
													java.math.BigDecimal
															.valueOf(
																	PluginMain
																			.resolve_object(commandSender,
																					org.bukkit.entity.Player.class)
																			.getZ())
															.setScale(2, java.math.RoundingMode.HALF_UP)));
									$e8e9447b9549849d754aa8f2d85cf4cc = PluginMain
											.resolve_object(commandSender, org.bukkit.entity.Player.class).getWorld()
											.getName();
								} else {
									$850bd423e857c5b68ae4e05925774d0e = new ArrayList(
											Arrays.asList(
													PluginMain
															.resolve_object(PluginMain.getInstance().getConfig()
																	.get("defaults.location"), java.util.List.class)
															.get(0),
													PluginMain.resolve_object(PluginMain.getInstance().getConfig()
															.get("defaults.location"), java.util.List.class).get(1),
													PluginMain
															.resolve_object(PluginMain.getInstance().getConfig()
																	.get("defaults.location"), java.util.List.class)
															.get(2)));
									$e8e9447b9549849d754aa8f2d85cf4cc = PluginMain.getInstance().getConfig()
											.get("defaults.world");
								}
								$b726a8c9f2037c8d9434f988ac84752e = new ArrayList(Arrays.asList(
										(commandArgs.length > 1 ? commandArgs[1] : null), ((Object) null),
										((commandArgs.length > 1 ? commandArgs[1] : null) + ".type"),
										org.bukkit.Particle
												.valueOf((commandArgs.length > 2 ? commandArgs[2] : null).toUpperCase())
												.name(),
										((commandArgs.length > 1 ? commandArgs[1] : null) + ".amount"),
										PluginMain.getInstance().getConfig().get("defaults.speed"),
										((commandArgs.length > 1 ? commandArgs[1] : null) + ".speed"),
										PluginMain.getInstance().getConfig().get("defaults.speed"),
										((commandArgs.length > 1 ? commandArgs[1] : null) + ".world"),
										$e8e9447b9549849d754aa8f2d85cf4cc,
										((commandArgs.length > 1 ? commandArgs[1] : null) + ".location"),
										$850bd423e857c5b68ae4e05925774d0e,
										((commandArgs.length > 1 ? commandArgs[1] : null) + ".offset"),
										new ArrayList(Arrays.asList(
												PluginMain.resolve_object(PluginMain.getInstance().getConfig()
														.get("defaults.offset"), java.util.List.class).get(0),
												PluginMain.resolve_object(
														PluginMain.getInstance().getConfig().get("defaults.offset"),
														java.util.List.class).get(1),
												PluginMain.resolve_object(
														PluginMain.getInstance().getConfig().get("defaults.offset"),
														java.util.List.class).get(2))),
										((commandArgs.length > 1 ? commandArgs[1] : null) + ".condition"),
										new ArrayList(Arrays.asList(
												PluginMain.resolve_object(
														PluginMain.getInstance().getConfig().get("defaults.condition"),
														java.util.List.class).get(0),
												PluginMain
														.resolve_object(PluginMain.getInstance().getConfig()
																.get("defaults.condition"), java.util.List.class)
														.get(1)))));
								for (int loopNumber1 = 0; loopNumber1 < PluginMain
										.resolve_object($b726a8c9f2037c8d9434f988ac84752e, java.util.List.class)
										.size(); loopNumber1 += 2) {
									int $FINAL_loopNumber1 = loopNumber1;
									PluginMain
											.resolve_object(PluginMain.globalVariables.get("databaseData"),
													org.bukkit.configuration.file.YamlConfiguration.class)
											.set(String
													.valueOf(
															PluginMain
																	.resolve_object($b726a8c9f2037c8d9434f988ac84752e,
																			java.util.List.class)
																	.get($FINAL_loopNumber1)),
													PluginMain
															.resolve_object($b726a8c9f2037c8d9434f988ac84752e,
																	java.util.List.class)
															.get(((int) (((double) $FINAL_loopNumber1)
																	+ ((double) 1)))));
								}
								PluginMain.procedure("assignParticleData", PluginMain.resolve_object(
										new ArrayList(Arrays.asList((commandArgs.length > 1 ? commandArgs[1] : null),
												(commandArgs.length > 2 ? commandArgs[2] : null))),
										java.util.List.class));
								PluginMain
										.resolve_object(PluginMain.globalVariables.get("databaseData"),
												org.bukkit.configuration.file.YamlConfiguration.class)
										.save(PluginMain.resolve_object(PluginMain.globalVariables.get("databaseFile"),
												java.io.File.class));
								PluginMain.procedure("sendMessage",
										PluginMain.resolve_object(
												new ArrayList(Arrays.asList(commandSender, "create",
														(commandArgs.length > 1 ? commandArgs[1] : null),
														(commandArgs.length > 2 ? commandArgs[2] : null))),
												java.util.List.class));
							} catch (Exception $executionException1) {
								PluginMain.procedure("sendMessage",
										PluginMain.resolve_object(
												new ArrayList(Arrays.asList(commandSender, "unknown_particle",
														(commandArgs.length > 2 ? commandArgs[2] : null))),
												java.util.List.class));
							}
						} else if ((((double) List.of(commandArgs).size()) >= ((double) 2))) {
							PluginMain.procedure("sendMessage",
									PluginMain.resolve_object(
											new ArrayList(Arrays.asList(commandSender, "missing_particle")),
											java.util.List.class));
						} else {
							PluginMain.procedure("sendMessage",
									PluginMain.resolve_object(
											new ArrayList(Arrays.asList(commandSender, "missing_display_name")),
											java.util.List.class));
						}
					} else if (PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "remove")) {
						if ((((double) List.of(commandArgs).size()) >= ((double) 2))) {
							if (PluginMain
									.resolve_object(PluginMain
											.resolve_object(PluginMain.globalVariables.get("databaseData"),
													org.bukkit.configuration.file.YamlConfiguration.class)
											.getKeys(false), java.util.List.class)
									.contains((commandArgs.length > 1 ? commandArgs[1] : null))) {
								PluginMain
										.resolve_object(PluginMain.globalVariables.get("databaseData"),
												org.bukkit.configuration.file.YamlConfiguration.class)
										.set((commandArgs.length > 1 ? commandArgs[1] : null), ((Object) null));
								PluginMain
										.resolve_object(PluginMain.globalVariables.get("databaseData"),
												org.bukkit.configuration.file.YamlConfiguration.class)
										.save(PluginMain.resolve_object(PluginMain.globalVariables.get("databaseFile"),
												java.io.File.class));
								PluginMain.procedure("sendMessage",
										PluginMain.resolve_object(
												new ArrayList(Arrays.asList(commandSender, "remove",
														(commandArgs.length > 1 ? commandArgs[1] : null))),
												java.util.List.class));
							} else {
								PluginMain.procedure("sendMessage",
										PluginMain.resolve_object(
												new ArrayList(Arrays.asList(commandSender, "unknown_effect",
														(commandArgs.length > 1 ? commandArgs[1] : null))),
												java.util.List.class));
							}
						} else {
							PluginMain.procedure("sendMessage",
									PluginMain.resolve_object(
											new ArrayList(Arrays.asList(commandSender, "missing_effect")),
											java.util.List.class));
						}
					} else if (PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")) {
						if ((((double) List.of(commandArgs).size()) >= ((double) 4))) {
							if (PluginMain
									.resolve_object(PluginMain
											.resolve_object(PluginMain.globalVariables.get("databaseData"),
													org.bukkit.configuration.file.YamlConfiguration.class)
											.getKeys(false), java.util.List.class)
									.contains((commandArgs.length > 1 ? commandArgs[1] : null))) {
								if (PluginMain
										.resolve_object(PluginMain
												.resolve_object(PluginMain.globalVariables.get("databaseData"),
														org.bukkit.configuration.file.YamlConfiguration.class)
												.getConfigurationSection(
														(commandArgs.length > 1 ? commandArgs[1] : null))
												.getKeys(false), java.util.List.class)
										.contains((commandArgs.length > 2 ? commandArgs[2] : null))) {
									if ((((double) PluginMain
											.resolve_object(PluginMain.globalVariables.get("databaseData"),
													org.bukkit.configuration.file.YamlConfiguration.class)
											.getStringList(((commandArgs.length > 1 ? commandArgs[1] : null) + "."
													+ (commandArgs.length > 2 ? commandArgs[2] : null)))
											.size()) > ((double) 0))) {
										$01f78d57244de193f3ac7900c43bd3b3 = (((double) PluginMain
												.resolve_object(PluginMain.globalVariables.get("databaseData"),
														org.bukkit.configuration.file.YamlConfiguration.class)
												.getStringList(((commandArgs.length > 1 ? commandArgs[1] : null) + "."
														+ (commandArgs.length > 2 ? commandArgs[2] : null)))
												.size()) == ((double) PluginMain.resolve_object(
														(commandArgs.length > 3 ? commandArgs[3] : null).split(";"),
														java.util.List.class).size()));
									} else {
										$01f78d57244de193f3ac7900c43bd3b3 = PluginMain.checkEquals(
												(commandArgs.length > 3 ? commandArgs[3] : null).contains(
														PluginMain.resolve_object(";", java.lang.CharSequence.class)),
												false);
									}
									if (PluginMain.resolve_boolean($01f78d57244de193f3ac7900c43bd3b3)) {
										if ((commandArgs.length > 3 ? commandArgs[3] : null).contains(
												PluginMain.resolve_object(";", java.lang.CharSequence.class))) {
											$e9f4753b240e3d7cf6f623bba9e530ec = (commandArgs.length > 3
													? commandArgs[3]
													: null).split(";");
										} else {
											$e9f4753b240e3d7cf6f623bba9e530ec = (commandArgs.length > 3
													? commandArgs[3]
													: null);
										}
										PluginMain
												.resolve_object(PluginMain.globalVariables.get("databaseData"),
														org.bukkit.configuration.file.YamlConfiguration.class)
												.set(((commandArgs.length > 1 ? commandArgs[1] : null) + "."
														+ (commandArgs.length > 2 ? commandArgs[2] : null)),
														$e9f4753b240e3d7cf6f623bba9e530ec);
										if (PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null),
												"type")) {
											PluginMain.procedure("assignParticleData", PluginMain.resolve_object(
													new ArrayList(Arrays.asList(
															(commandArgs.length > 1 ? commandArgs[1] : null),
															org.bukkit.Particle.valueOf(String.valueOf(PluginMain
																	.resolve_object(
																			PluginMain.globalVariables
																					.get("databaseData"),
																			org.bukkit.configuration.file.YamlConfiguration.class)
																	.get(((commandArgs.length > 1
																			? commandArgs[1]
																			: null) + ".type")))))),
													java.util.List.class));
										}
										PluginMain
												.resolve_object(PluginMain.globalVariables.get("databaseData"),
														org.bukkit.configuration.file.YamlConfiguration.class)
												.save(PluginMain.resolve_object(
														PluginMain.globalVariables.get("databaseFile"),
														java.io.File.class));
										PluginMain.procedure("sendMessage",
												PluginMain.resolve_object(
														new ArrayList(Arrays.asList(commandSender, "flag",
																(commandArgs.length > 2 ? commandArgs[2] : null),
																(commandArgs.length > 3 ? commandArgs[3] : null),
																(commandArgs.length > 1 ? commandArgs[1] : null))),
														java.util.List.class));
									} else {
										PluginMain.procedure("sendMessage",
												PluginMain.resolve_object(
														new ArrayList(Arrays.asList(commandSender, "invalid_value",
																(commandArgs.length > 3 ? commandArgs[3] : null),
																(commandArgs.length > 2 ? commandArgs[2] : null))),
														java.util.List.class));
									}
								} else {
									PluginMain.procedure("sendMessage",
											PluginMain.resolve_object(
													new ArrayList(Arrays.asList(commandSender, "unknown_flag",
															(commandArgs.length > 2 ? commandArgs[2] : null))),
													java.util.List.class));
								}
							} else {
								PluginMain.procedure("sendMessage",
										PluginMain.resolve_object(
												new ArrayList(Arrays.asList(commandSender, "unknown_effect",
														(commandArgs.length > 1 ? commandArgs[1] : null))),
												java.util.List.class));
							}
						} else if ((((double) List.of(commandArgs).size()) >= ((double) 2))) {
							PluginMain.procedure("sendMessage",
									PluginMain.resolve_object(
											new ArrayList(Arrays.asList(commandSender, "missing_value")),
											java.util.List.class));
						} else if ((((double) List.of(commandArgs).size()) >= ((double) 2))) {
							PluginMain.procedure("sendMessage", PluginMain.resolve_object(
									new ArrayList(Arrays.asList(commandSender, "missing_flag")), java.util.List.class));
						} else {
							PluginMain.procedure("sendMessage",
									PluginMain.resolve_object(
											new ArrayList(Arrays.asList(commandSender, "missing_effect")),
											java.util.List.class));
						}
					} else if (PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "info")) {
						if ((((double) List.of(commandArgs).size()) >= ((double) 2))) {
							if (PluginMain
									.resolve_object(PluginMain
											.resolve_object(PluginMain.globalVariables.get("databaseData"),
													org.bukkit.configuration.file.YamlConfiguration.class)
											.getKeys(false), java.util.List.class)
									.contains((commandArgs.length > 1 ? commandArgs[1] : null))) {
								$c2bf9c437d0cabf5d3713b8464945d64 = new ArrayList();
								for (Object $FINAL_loopValue1 : PluginMain.resolve_object(
										PluginMain
												.resolve_object(PluginMain.globalVariables.get("databaseData"),
														org.bukkit.configuration.file.YamlConfiguration.class)
												.getConfigurationSection(
														(commandArgs.length > 1 ? commandArgs[1] : null))
												.getKeys(true),
										java.lang.Iterable.class)) {
									PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class)
											.add((String
													.valueOf(PluginMain.getInstance().getConfig()
															.get("messages.info_key_prefix"))
													+ (String.valueOf($FINAL_loopValue1).substring(0, 1).toUpperCase()
															+ String.valueOf($FINAL_loopValue1).substring(1,
																	String.valueOf($FINAL_loopValue1).length()))
													+ String.valueOf(PluginMain.getInstance().getConfig()
															.get("messages.info_separator"))
													+ String.valueOf(PluginMain.getInstance().getConfig()
															.get("messages.info_value_prefix"))
													+ String.valueOf(PluginMain.resolve_object(
															PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
															.get(((commandArgs.length > 1 ? commandArgs[1] : null) + "."
																	+ String.valueOf($FINAL_loopValue1))))
															.replaceAll("\\]", "").replaceAll("\\[", "")));
								}
								PluginMain.procedure("sendMessage",
										PluginMain.resolve_object(new ArrayList(Arrays.asList(commandSender, "info",
												(commandArgs.length > 1 ? commandArgs[1] : null),
												java.lang.String.join(
														PluginMain.resolve_object("\n", java.lang.CharSequence.class),
														PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64,
																java.lang.Iterable.class)))),
												java.util.List.class));
							} else {
								PluginMain.procedure("sendMessage",
										PluginMain.resolve_object(
												new ArrayList(Arrays.asList(commandSender, "unknown_effect",
														(commandArgs.length > 1 ? commandArgs[1] : null))),
												java.util.List.class));
							}
						} else {
							PluginMain.procedure("sendMessage",
									PluginMain.resolve_object(
											new ArrayList(Arrays.asList(commandSender, "missing_effect")),
											java.util.List.class));
						}
					} else {
						PluginMain.procedure("sendMessage", PluginMain.resolve_object(
								new ArrayList(Arrays.asList(commandSender, "help")), java.util.List.class));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	@Override
	public List<String> onTabComplete(CommandSender commandSender, Command command, String alias,
			String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("blockeffects")) {
			try {
				Object $c2bf9c437d0cabf5d3713b8464945d64 = null;
				Object $775187874f35ab7e8cf3f93a33f05189 = null;
				if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "create")
						&& (((double) List.of(commandArgs).size()) == ((double) 2)))) {
					if (true)
						return PluginMain.resolve_object(new ArrayList(Arrays.asList("DISPLAY_NAME")),
								java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "create")
						&& (((double) List.of(commandArgs).size()) == ((double) 3)))) {
					$c2bf9c437d0cabf5d3713b8464945d64 = new ArrayList();
					for (Object $FINAL_loopValue1 : PluginMain.resolve_object(
							java.util.Arrays.asList(
									PluginMain.resolve_object(org.bukkit.Particle.values(), java.lang.Object[].class)),
							java.lang.Iterable.class)) {
						if ($FINAL_loopValue1.toString()
								.startsWith((commandArgs.length > 2 ? commandArgs[2] : null).toUpperCase())) {
							PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class)
									.add($FINAL_loopValue1.toString());
						}
					}
					if (true)
						return PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class);
				} else if (((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "remove")
						|| PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						|| PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "move")
						|| PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "info"))
						&& (((double) List.of(commandArgs).size()) == ((double) 2)))) {
					$c2bf9c437d0cabf5d3713b8464945d64 = new ArrayList();
					for (Object $FINAL_loopValue1 : PluginMain.resolve_object(
							PluginMain.resolve_object(PluginMain.globalVariables.get("databaseData"),
									org.bukkit.configuration.file.YamlConfiguration.class).getKeys(false),
							java.lang.Iterable.class)) {
						if (String.valueOf($FINAL_loopValue1)
								.startsWith((commandArgs.length > 1 ? commandArgs[1] : null))) {
							PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class)
									.add($FINAL_loopValue1);
						}
					}
					if (true)
						return PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& (((double) List.of(commandArgs).size()) == ((double) 3)))) {
					if (PluginMain
							.resolve_object(PluginMain.globalVariables.get("databaseData"),
									org.bukkit.configuration.file.YamlConfiguration.class)
							.contains((commandArgs.length > 1 ? commandArgs[1] : null))) {
						$c2bf9c437d0cabf5d3713b8464945d64 = new ArrayList();
						for (Object $FINAL_loopValue1 : PluginMain.resolve_object(PluginMain
								.resolve_object(PluginMain.globalVariables.get("databaseData"),
										org.bukkit.configuration.file.YamlConfiguration.class)
								.getConfigurationSection((commandArgs.length > 1 ? commandArgs[1] : null))
								.getKeys(false), java.lang.Iterable.class)) {
							if ($FINAL_loopValue1.toString()
									.startsWith((commandArgs.length > 2 ? commandArgs[2] : null))) {
								PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class)
										.add($FINAL_loopValue1.toString());
							}
						}
						if (true)
							return PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class);
					} else {
						if (true)
							return PluginMain.resolve_object(new ArrayList(Arrays.asList("UNKNOWN_FLAG")),
									java.util.List.class);
					}
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "amount")
						|| PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "speed")
						|| PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "spread")
						|| PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "shriek")
						|| PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "arrivalTime")
								&& (((double) List.of(commandArgs).size()) == ((double) 4)))) {
					if (true)
						return PluginMain.resolve_object(new ArrayList(Arrays.asList("NUMBER", "1", "10", "100")),
								java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "condition")
						&& (((double) List.of(commandArgs).size()) == ((double) 4)))) {
					if (true)
						return PluginMain.resolve_object(new ArrayList(
								Arrays.asList("PLACEHOLDER;VALUE", "%player_has_permission_particles.view%;yes")),
								java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "location")
						|| PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "destination")
								&& (((double) List.of(commandArgs).size()) == ((double) 4)))) {
					if (true)
						return PluginMain.resolve_object(
								new ArrayList(Arrays.asList("X;Y;Z", (String
										.valueOf(java.lang.Math.round(PluginMain
												.resolve_object(commandSender, org.bukkit.entity.Player.class).getX()))
										+ ";"
										+ String.valueOf(java.lang.Math.round(PluginMain
												.resolve_object(commandSender, org.bukkit.entity.Player.class).getY()))
										+ ";"
										+ String.valueOf(java.lang.Math.round(
												PluginMain.resolve_object(commandSender, org.bukkit.entity.Player.class)
														.getZ()))))),
								java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "offset")
						&& (((double) List.of(commandArgs).size()) == ((double) 4)))) {
					if (true)
						return PluginMain.resolve_object(
								new ArrayList(Arrays.asList("X;Y;Z", "1;1;1", "2.5;2.5;2.5", "5;5;5")),
								java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "type")
						&& (((double) List.of(commandArgs).size()) == ((double) 4)))) {
					$c2bf9c437d0cabf5d3713b8464945d64 = new ArrayList();
					for (Object $FINAL_loopValue1 : PluginMain.resolve_object(
							java.util.Arrays.asList(
									PluginMain.resolve_object(org.bukkit.Particle.values(), java.lang.Object[].class)),
							java.lang.Iterable.class)) {
						if ($FINAL_loopValue1.toString()
								.startsWith((commandArgs.length > 3 ? commandArgs[3] : null).toUpperCase())) {
							PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class)
									.add($FINAL_loopValue1.toString());
						}
					}
					if (true)
						return PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "world")
						&& (((double) List.of(commandArgs).size()) == ((double) 4)))) {
					$c2bf9c437d0cabf5d3713b8464945d64 = new ArrayList();
					for (Object $FINAL_loopValue1 : PluginMain.resolve_object(org.bukkit.Bukkit.getWorlds(),
							java.lang.Iterable.class)) {
						if (PluginMain.resolve_object($FINAL_loopValue1, org.bukkit.World.class).getName().toString()
								.startsWith((commandArgs.length > 3 ? commandArgs[3] : null))) {
							PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class)
									.add(PluginMain.resolve_object($FINAL_loopValue1, org.bukkit.World.class).getName()
											.toString());
						}
					}
					if (true)
						return PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "color")
						|| PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "colorTransition")
								&& (((double) List.of(commandArgs).size()) == ((double) 4)))) {
					if (true)
						return PluginMain.resolve_object(new ArrayList(
								Arrays.asList("R;G;B", "0;0;0", "255;255;255", "255;0;0", "0;255;0", "0;0;255")),
								java.util.List.class);
				} else if ((PluginMain.checkEquals((commandArgs.length > 0 ? commandArgs[0] : null), "flag")
						&& PluginMain.checkEquals((commandArgs.length > 2 ? commandArgs[2] : null), "material")
						&& (((double) List.of(commandArgs).size()) == ((double) 4)))) {
					$c2bf9c437d0cabf5d3713b8464945d64 = new ArrayList();
					for (Object $FINAL_loopValue1 : PluginMain.resolve_object(
							java.util.Arrays.asList(
									PluginMain.resolve_object(org.bukkit.Material.values(), java.lang.Object[].class)),
							java.lang.Iterable.class)) {
						if ($FINAL_loopValue1.toString().startsWith((commandArgs.length > 3 ? commandArgs[3] : null))) {
							PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class)
									.add((commandArgs.length > 3 ? commandArgs[3] : null));
						}
					}
					if (true)
						return PluginMain.resolve_object($c2bf9c437d0cabf5d3713b8464945d64, java.util.List.class);
				} else if ((((double) List.of(commandArgs).size()) == ((double) 1))) {
					$775187874f35ab7e8cf3f93a33f05189 = new ArrayList();
					for (Object $FINAL_loopValue1 : PluginMain.resolve_object(
							new ArrayList(Arrays.asList("reload", "create", "remove", "flag", "info", "help")),
							java.lang.Iterable.class)) {
						if (String.valueOf($FINAL_loopValue1)
								.startsWith((commandArgs.length > 0 ? commandArgs[0] : null))) {
							PluginMain.resolve_object($775187874f35ab7e8cf3f93a33f05189, java.util.List.class)
									.add($FINAL_loopValue1);
						}
					}
					if (true)
						return PluginMain.resolve_object($775187874f35ab7e8cf3f93a33f05189, java.util.List.class);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		return null;
	}

	public static void procedure(String procedure, List args) throws Exception {
		if (procedure.equalsIgnoreCase("sendMessage")) {
			Object $defca37f1e97dc15b4054c5e6cbdf129 = null;
			$defca37f1e97dc15b4054c5e6cbdf129 = PluginMain.getInstance().getConfig()
					.get(("messages." + String.valueOf(args.get(1))));
			for (Object $FINAL_loopValue1 : PluginMain.resolve_object(args.subList(2, args.size()),
					java.lang.Iterable.class)) {
				$defca37f1e97dc15b4054c5e6cbdf129 = String.valueOf($defca37f1e97dc15b4054c5e6cbdf129).replaceAll(
						("%" + String.valueOf(args.subList(2, args.size()).indexOf($FINAL_loopValue1)) + "%"),
						String.valueOf($FINAL_loopValue1));
			}
			PluginMain.resolve_object(args.get(0), org.bukkit.command.CommandSender.class)
					.sendMessage(net.kyori.adventure.text.minimessage.MiniMessage.miniMessage()
							.deserialize(String.valueOf($defca37f1e97dc15b4054c5e6cbdf129).replaceAll("%prefix%",
									String.valueOf(PluginMain.getInstance().getConfig().get("messages.prefix")))));
			return;
		}
		if (procedure.equalsIgnoreCase("assignParticleData")) {
			Object $b85f5cb50cbb1b088e122d93266887f8 = null;
			$b85f5cb50cbb1b088e122d93266887f8 = org.bukkit.Particle.valueOf(String.valueOf(args.get(1)).toUpperCase());
			for (Object $FINAL_loopValue1 : PluginMain
					.resolve_object(
							new ArrayList(Arrays.asList("color", "colorTransition", "size", "spread", "shriek",
									"material", "destination", "arrivalTime", "power", "duration")),
							java.lang.Iterable.class)) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + "." + String.valueOf($FINAL_loopValue1)), ((Object) null));
			}
			if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "DustOptions")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".color"),
								new ArrayList(Arrays.asList(PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class))));
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".size"),
								PluginMain.resolve_object(1, java.lang.Object.class));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "DustTransition")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".color"),
								new ArrayList(Arrays.asList(PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class))));
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".colorTransition"),
								new ArrayList(Arrays.asList(PluginMain.resolve_object(0, java.lang.Object.class),
										PluginMain.resolve_object(0, java.lang.Object.class),
										PluginMain.resolve_object(0, java.lang.Object.class))));
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".size"),
								PluginMain.resolve_object(1, java.lang.Object.class));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Color")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".color"),
								new ArrayList(Arrays.asList(PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class))));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Float")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".spread"),
								PluginMain.resolve_object(1, java.lang.Object.class));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Integer")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".shriek"),
								PluginMain.resolve_object(1, java.lang.Object.class));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "BlockData")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".material"), "GRASS_BLOCK");
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "ItemStack")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".material"), "GRASS_BLOCK");
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Vibration")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".destination"),
								new ArrayList(Arrays.asList(PluginMain.resolve_object(0, java.lang.Object.class),
										PluginMain.resolve_object(0, java.lang.Object.class),
										PluginMain.resolve_object(0, java.lang.Object.class))));
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".arrivalTime"), "100");
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Spell")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".color"),
								new ArrayList(Arrays.asList(PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class))));
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".power"), "1");
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Trail")) {
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".color"),
								new ArrayList(Arrays.asList(PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class),
										PluginMain.resolve_object(255, java.lang.Object.class))));
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".destination"),
								new ArrayList(Arrays.asList(PluginMain.resolve_object(0, java.lang.Object.class),
										PluginMain.resolve_object(0, java.lang.Object.class),
										PluginMain.resolve_object(0, java.lang.Object.class))));
				PluginMain
						.resolve_object(PluginMain.globalVariables.get("databaseData"),
								org.bukkit.configuration.file.YamlConfiguration.class)
						.set((String.valueOf(args.get(0)) + ".arrivalTime"), "100");
			}
			return;
		}
	}

	public static Object function(String function, List args) throws Exception {
		if (function.equalsIgnoreCase("getParticleData")) {
			Object $b85f5cb50cbb1b088e122d93266887f8 = null;
			$b85f5cb50cbb1b088e122d93266887f8 = org.bukkit.Particle.valueOf(String.valueOf(PluginMain
					.resolve_object(PluginMain.globalVariables.get("databaseData"),
							org.bukkit.configuration.file.YamlConfiguration.class)
					.get((String.valueOf(args.get(0)) + ".type"))).toUpperCase());
			if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "DustOptions")) {
				if (true)
					return new org.bukkit.Particle.DustOptions(
							org.bukkit.Color.fromRGB(
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(0))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(1))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(2)))),
							java.lang.Float.parseFloat(String.valueOf(PluginMain
									.resolve_object(PluginMain.globalVariables.get("databaseData"),
											org.bukkit.configuration.file.YamlConfiguration.class)
									.get((String.valueOf(args.get(0)) + ".size")))));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "DustTransition")) {
				if (true)
					return new org.bukkit.Particle.DustTransition(
							org.bukkit.Color.fromRGB(
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(0))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(1))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(2)))),
							org.bukkit.Color.fromRGB(
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".colorTransition")),
											java.util.List.class).get(0))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".colorTransition")),
											java.util.List.class).get(1))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".colorTransition")),
											java.util.List.class).get(2)))),
							java.lang.Float.parseFloat(String.valueOf(PluginMain
									.resolve_object(PluginMain.globalVariables.get("databaseData"),
											org.bukkit.configuration.file.YamlConfiguration.class)
									.get((String.valueOf(args.get(0)) + ".size")))));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Color")) {
				if (true)
					return org.bukkit.Color
							.fromRGB(
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(0))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(1))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(2))));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Float")) {
				if (true)
					return PluginMain.resolve_object(java.lang.Float.parseFloat(String.valueOf(PluginMain
							.resolve_object(PluginMain.globalVariables.get("databaseData"),
									org.bukkit.configuration.file.YamlConfiguration.class)
							.get((String.valueOf(args.get(0)) + ".spread")))), java.lang.Object.class);
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Integer")) {
				if (true)
					return PluginMain.resolve_object(java.lang.Integer.parseInt(String.valueOf(PluginMain
							.resolve_object(PluginMain.globalVariables.get("databaseData"),
									org.bukkit.configuration.file.YamlConfiguration.class)
							.get((String.valueOf(args.get(0)) + ".shriek")))), java.lang.Object.class);
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "BlockData")) {
				if (true)
					return org.bukkit.Bukkit.createBlockData(org.bukkit.Material.valueOf(String.valueOf(PluginMain
							.resolve_object(PluginMain.globalVariables.get("databaseData"),
									org.bukkit.configuration.file.YamlConfiguration.class)
							.get((String.valueOf(args.get(0)) + ".material")))));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "ItemStack")) {
				if (true)
					return new org.bukkit.inventory.ItemStack(org.bukkit.Material.valueOf(String.valueOf(PluginMain
							.resolve_object(PluginMain.globalVariables.get("databaseData"),
									org.bukkit.configuration.file.YamlConfiguration.class)
							.get((String.valueOf(args.get(0)) + ".material")))));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Vibration")) {
				if (true)
					return new org.bukkit.Vibration(
							PluginMain.resolve_object(
									new org.bukkit.Vibration.Destination.BlockDestination(new org.bukkit.Location(
											org.bukkit.Bukkit.getWorld(
													String.valueOf(PluginMain.resolve_object(
															PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
															.get((String.valueOf(args.get(0)) + ".world")))),
											java.lang.Double.parseDouble(String.valueOf(PluginMain.resolve_object(
													PluginMain.resolve_object(
															PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
															.get((String.valueOf(args.get(0)) + ".destination")),
													java.util.List.class).get(0))),
											java.lang.Double.parseDouble(String.valueOf(PluginMain.resolve_object(
													PluginMain.resolve_object(
															PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
															.get((String.valueOf(args.get(0)) + ".destination")),
													java.util.List.class).get(1))),
											java.lang.Double.parseDouble(String.valueOf(PluginMain.resolve_object(
													PluginMain.resolve_object(
															PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
															.get((String.valueOf(args.get(0)) + ".destination")),
													java.util.List.class).get(2))))),
									org.bukkit.Vibration.Destination.class),
							java.lang.Integer.parseInt(String.valueOf(PluginMain
									.resolve_object(PluginMain.globalVariables.get("databaseData"),
											org.bukkit.configuration.file.YamlConfiguration.class)
									.get((String.valueOf(args.get(0)) + ".arrivalTime")))));
			} else if (PluginMain
					.checkEquals(PluginMain.resolve_object($b85f5cb50cbb1b088e122d93266887f8, org.bukkit.Particle.class)
							.getDataType().getSimpleName(), "Trail")) {
				if (true)
					return new org.bukkit.Particle.Trail(
							new org.bukkit.Location(
									org.bukkit.Bukkit.getWorld(String.valueOf(PluginMain
											.resolve_object(PluginMain.globalVariables.get("databaseData"),
													org.bukkit.configuration.file.YamlConfiguration.class)
											.get((String.valueOf(args.get(0)) + ".world")))),
									java.lang.Double.parseDouble(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".destination")),
											java.util.List.class).get(0))),
									java.lang.Double.parseDouble(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".destination")),
											java.util.List.class).get(1))),
									java.lang.Double.parseDouble(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".destination")),
											java.util.List.class).get(2)))),
							org.bukkit.Color.fromRGB(
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(0))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(1))),
									java.lang.Integer.parseInt(String.valueOf(PluginMain.resolve_object(
											PluginMain
													.resolve_object(PluginMain.globalVariables.get("databaseData"),
															org.bukkit.configuration.file.YamlConfiguration.class)
													.get((String.valueOf(args.get(0)) + ".color")),
											java.util.List.class).get(2)))),
							java.lang.Integer.parseInt(String.valueOf(PluginMain
									.resolve_object(PluginMain.globalVariables.get("databaseData"),
											org.bukkit.configuration.file.YamlConfiguration.class)
									.get((String.valueOf(args.get(0)) + ".arrivalTime")))));
			} else {
				if (true)
					return ((Object) null);
			}
			return null;
		}
		return null;
	}

	public static char resolve_char(Object o) {
		return o instanceof String s ? s.charAt(0) : (char) o;
	}

	public static boolean resolve_boolean(Object o) {
		return (boolean) o;
	}

	public static byte resolve_byte(Object o) {
		return ((Number) o).byteValue();
	}

	public static short resolve_short(Object o) {
		return ((Number) o).shortValue();
	}

	public static int resolve_int(Object o) {
		return ((Number) o).intValue();
	}

	public static long resolve_long(Object o) {
		return ((Number) o).longValue();
	}

	public static float resolve_float(Object o) {
		return ((Number) o).floatValue();
	}

	public static double resolve_double(Object o) {
		return ((Number) o).doubleValue();
	}

	public static <T> T resolve_object(Object from, Class<T> to) {
		if (from == null) {
			return null;
		}
		if (to.isAssignableFrom(from.getClass())) {
			return to.cast(from);
		}
		if (from instanceof Number num && Number.class.isAssignableFrom(to)) {
			return to.cast(num.doubleValue());
		}
		if (from instanceof Collection collection && to.isArray()) {
			Object arr = Array.newInstance(to.componentType(), collection.size());
			int i = 0;
			for (Object obj : collection) {
				Array.set(arr, i++, obj);
			}
			return (T) arr;
		}
		if (from instanceof Collection collection && Collection.class.isAssignableFrom(to)) {
			Collection newCollection = getCollectionInstance(to);
			newCollection.addAll(collection);
			return (T) newCollection;
		}
		if (from.getClass().isArray() && Collection.class.isAssignableFrom(to)) {
			Collection newCollection = getCollectionInstance(to);
			for (int i = 0; i < Array.getLength(from); i++) {
				newCollection.add(Array.get(from, i));
			}
			return (T) newCollection;
		}
		return to.cast(from);
	}

	private static Collection getCollectionInstance(Class<?> type) {
		try {
			return (Collection) type.getConstructor().newInstance();
		} catch (Exception e) {
			if (List.class.isAssignableFrom(type)) {
				return new ArrayList<>();
			}
			if (Set.class.isAssignableFrom(type)) {
				return new HashSet<>();
			}
			if (Queue.class.isAssignableFrom(type)) {
				return new ArrayDeque<>();
			}
			return null;
		}
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static boolean checkEquals(Object o1, Object o2) {
		return o1 != null ? o1.equals(o2) : false;
	}
}