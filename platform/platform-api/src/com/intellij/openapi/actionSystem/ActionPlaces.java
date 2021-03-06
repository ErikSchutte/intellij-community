// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.actionSystem;

import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * Possible places in the IDEA user interface where an action can appear.
 */

@SuppressWarnings("HardCodedStringLiteral")
public abstract class ActionPlaces {
  public static final String UNKNOWN = "unknown";
  public static final String TOOLBAR = "toolbar";
  public static final String POPUP = "popup";

  // prefer isMainMenuOrActionSearch(String) for the following places
  public static final String KEYBOARD_SHORTCUT = "keyboard shortcut";
  public static final String MOUSE_SHORTCUT = "mouse shortcut";
  public static final String FORCE_TOUCH = "force touch";
  public static final String MAIN_MENU = "MainMenu";

  public static final String MAIN_TOOLBAR = "MainToolbar";
  public static final String EDITOR_POPUP = "EditorPopup";
  public static final String EDITOR_TOOLBAR = "EditorToolbar";
  public static final String EDITOR_TAB_POPUP = "EditorTabPopup";
  public static final String EDITOR_TAB = "EditorTab";
  public static final String EDITOR_GUTTER = "ICON_NAVIGATION";
  public static final String EDITOR_GUTTER_POPUP = "ICON_NAVIGATION_SECONDARY_BUTTON";
  public static final String COMMANDER_POPUP = "CommanderPopup";
  public static final String COMMANDER_TOOLBAR = "CommanderToolbar";
  public static final String CONTEXT_TOOLBAR = "ContextToolbar";
  public static final String TOOLWINDOW_TITLE = "ToolwindowTitle";
  public static final String TOOLWINDOW_CONTENT = "ToolwindowContent";

  public static final String PROJECT_VIEW_POPUP = "ProjectViewPopup";
  public static final String PROJECT_VIEW_TOOLBAR = "ProjectViewToolbar";

  public static final String FAVORITES_VIEW_POPUP = "FavoritesPopup";

  public static final String STATUS_BAR_PLACE = "StatusBarPlace";

  public static final String SCOPE_VIEW_POPUP = "ScopeViewPopup";
  public static final String ACTION_SEARCH = "GoToAction";

  public static final String TESTTREE_VIEW_POPUP = "TestTreeViewPopup";
  public static final String TESTTREE_VIEW_TOOLBAR = "TestTreeViewToolbar";
  private static final String TESTSTATISTICS_VIEW_POPUP = "TestStatisticsViewPopup";

  public static final String TYPE_HIERARCHY_VIEW_POPUP = "TypeHierarchyViewPopup";
  public static final String TYPE_HIERARCHY_VIEW_TOOLBAR = "TypeHierarchyViewToolbar";
  public static final String METHOD_HIERARCHY_VIEW_POPUP = "MethodHierarchyViewPopup";
  public static final String METHOD_HIERARCHY_VIEW_TOOLBAR = "MethodHierarchyViewToolbar";
  public static final String CALL_HIERARCHY_VIEW_POPUP = "CallHierarchyViewPopup";
  public static final String CALL_HIERARCHY_VIEW_TOOLBAR = "CallHierarchyViewToolbar";
  public static final String J2EE_ATTRIBUTES_VIEW_POPUP = "J2EEAttributesViewPopup";
  public static final String J2EE_VIEW_POPUP = "J2EEViewPopup";
  public static final String RUNNER_TOOLBAR = "RunnerToolbar";
  public static final String DEBUGGER_TOOLBAR = "DebuggerToolbar";
  public static final String USAGE_VIEW_POPUP = "UsageViewPopup";
  public static final String USAGE_VIEW_TOOLBAR = "UsageViewToolbar";
  public static final String STRUCTURE_VIEW_POPUP = "StructureViewPopup";
  public static final String STRUCTURE_VIEW_TOOLBAR = "StructureViewToolbar";
  public static final String NAVIGATION_BAR_POPUP = "NavBar";
  public static final String NAVIGATION_BAR_TOOLBAR = "NavBarToolbar";

  public static final String TODO_VIEW_POPUP = "TodoViewPopup";
  public static final String TODO_VIEW_TOOLBAR = "TodoViewToolbar";

  public static final String COMPILER_MESSAGES_POPUP = "CompilerMessagesPopup";
  public static final String COMPILER_MESSAGES_TOOLBAR = "CompilerMessagesToolbar";
  public static final String ANT_MESSAGES_POPUP = "AntMessagesPopup";
  public static final String ANT_MESSAGES_TOOLBAR = "AntMessagesToolbar";
  public static final String ANT_EXPLORER_POPUP = "AntExplorerPopup";
  public static final String ANT_EXPLORER_TOOLBAR = "AntExplorerToolbar";
  public static final String JS_BUILD_TOOL_POPUP = "JavaScriptBuildTool";

  //todo: probably these context should be split into several contexts
  public static final String CODE_INSPECTION = "CodeInspection";
  public static final String JAVADOC_TOOLBAR = "JavadocToolbar";
  public static final String JAVADOC_INPLACE_SETTINGS = "JavadocInplaceSettings";
  public static final String FILEHISTORY_VIEW_TOOLBAR = "FileHistoryViewToolbar";
  public static final String UPDATE_POPUP = "UpdatePopup";
  public static final String FILEVIEW_POPUP = "FileViewPopup";
  public static final String CHECKOUT_POPUP = "CheckoutPopup";
  public static final String LVCS_DIRECTORY_HISTORY_POPUP = "LvcsHistoryPopup";
  public static final String GUI_DESIGNER_EDITOR_POPUP = "GuiDesigner.EditorPopup";
  public static final String GUI_DESIGNER_COMPONENT_TREE_POPUP = "GuiDesigner.ComponentTreePopup";
  public static final String GUI_DESIGNER_PROPERTY_INSPECTOR_POPUP = "GuiDesigner.PropertyInspectorPopup";

  public static final String RUN_CONFIGURATIONS_COMBOBOX = "RunConfigurationsCombobox";
  public static final String CREATE_EJB_POPUP = "CreateEjbPopup";
  public static final String WELCOME_SCREEN = "WelcomeScreen";

  public static final String CHANGES_VIEW_TOOLBAR = "ChangesViewToolbar";
  public static final String CHANGES_VIEW_POPUP = "ChangesViewPopup";

  public static final String DATABASE_VIEW_TOOLBAR = "DatabaseViewToolbar";
  public static final String DATABASE_VIEW_POPUP = "DatabaseViewPopup";

  public static final String REMOTE_HOST_VIEW_POPUP = "RemoteHostPopup";
  public static final String REMOTE_HOST_DIALOG_POPUP = "RemoteHostDialogPopup";

  public static final String TFS_TREE_POPUP = "TfsTreePopup";
  public static final String ACTION_PLACE_VCS_QUICK_LIST_POPUP_ACTION = "ActionPlace.VcsQuickListPopupAction";
  public static final String ACTION_PLACE_QUICK_LIST_POPUP_ACTION = "ActionPlace.QuickListPopupAction";

  public static final String PHING_EXPLORER_POPUP = "PhingExplorerPopup";
  public static final String PHING_EXPLORER_TOOLBAR = "PhingExplorerToolbar";
  public static final String DOCK_MENU = "DockMenu";
  public static final String PHING_MESSAGES_TOOLBAR = "PhingMessagesToolbar";

  public static final String COMPOSER_EDITOR_NOTIFICATION_PANEL = "ComposerEditorNotificationPanel";
  public static final String COMPOSER_EDITOR_NOTIFICATION_PANEL_EXTRA = "ComposerEditorNotificationPanel.ExtraActions";
  public static final String COMPOSER_LOG_RERUN = "ComposerLogRerun";

  public static final String DIFF_TOOLBAR = "DiffToolbar";

  public static final String ANALYZE_STACKTRACE_PANEL_TOOLBAR = "ANALYZE_STACKTRACE_PANEL_TOOLBAR";

  public static final String V8_CPU_PROFILING_POPUP = "V8_CPU_PROFILING_POPUP";
  public static final String V8_HEAP_PROFILING_POPUP = "V8_HEAP_PROFILING_POPUP";
  public static final String V8_HEAP_DIFF_PROFILING_POPUP = "V8_HEAP_DIFF_PROFILING_POPUP";

  public static final String RUN_DASHBOARD_POPUP = "RunDashboardPopup";
  public static final String SERVICES_POPUP = "ServicesPopup";
  public static final String SERVICES_TOOLBAR = "ServicesToolbar";

  public static final String TOUCHBAR_GENERAL = "TouchBarGeneral";

  public static boolean isMainMenuOrActionSearch(String place) {
    return MAIN_MENU.equals(place) || ACTION_SEARCH.equals(place) ||
           KEYBOARD_SHORTCUT.equals(place) || MOUSE_SHORTCUT.equals(place) || FORCE_TOUCH.equals(place);
  }

  private static final Set<String> ourCommonPlaces = ContainerUtil.newHashSet(
    UNKNOWN, KEYBOARD_SHORTCUT, MOUSE_SHORTCUT, FORCE_TOUCH,
    TOOLBAR, MAIN_MENU, MAIN_TOOLBAR, EDITOR_TOOLBAR, EDITOR_TAB, COMMANDER_TOOLBAR, CONTEXT_TOOLBAR, TOOLWINDOW_TITLE,
    PROJECT_VIEW_TOOLBAR, STATUS_BAR_PLACE, ACTION_SEARCH, TESTTREE_VIEW_TOOLBAR, TYPE_HIERARCHY_VIEW_TOOLBAR,
    METHOD_HIERARCHY_VIEW_TOOLBAR, CALL_HIERARCHY_VIEW_TOOLBAR, RUNNER_TOOLBAR, DEBUGGER_TOOLBAR, USAGE_VIEW_TOOLBAR,
    STRUCTURE_VIEW_TOOLBAR, NAVIGATION_BAR_TOOLBAR, TODO_VIEW_TOOLBAR, COMPILER_MESSAGES_TOOLBAR,
    ANT_MESSAGES_TOOLBAR, ANT_EXPLORER_TOOLBAR, CODE_INSPECTION, JAVADOC_TOOLBAR, JAVADOC_INPLACE_SETTINGS,
    FILEHISTORY_VIEW_TOOLBAR, RUN_CONFIGURATIONS_COMBOBOX, WELCOME_SCREEN, CHANGES_VIEW_TOOLBAR, DATABASE_VIEW_TOOLBAR,
    ACTION_PLACE_QUICK_LIST_POPUP_ACTION, PHING_EXPLORER_TOOLBAR, DOCK_MENU, PHING_MESSAGES_TOOLBAR, DIFF_TOOLBAR,
    ANALYZE_STACKTRACE_PANEL_TOOLBAR, TOUCHBAR_GENERAL, COMPOSER_EDITOR_NOTIFICATION_PANEL, COMPOSER_EDITOR_NOTIFICATION_PANEL_EXTRA,
    COMPOSER_LOG_RERUN, EDITOR_GUTTER, TOOLWINDOW_CONTENT
  );

  private static final Set<String> ourPopupPlaces = ContainerUtil.newHashSet(
    POPUP, EDITOR_POPUP, EDITOR_TAB_POPUP, COMMANDER_POPUP,
    PROJECT_VIEW_POPUP, FAVORITES_VIEW_POPUP, SCOPE_VIEW_POPUP, TESTTREE_VIEW_POPUP, TESTSTATISTICS_VIEW_POPUP, TYPE_HIERARCHY_VIEW_POPUP,
    METHOD_HIERARCHY_VIEW_POPUP, CALL_HIERARCHY_VIEW_POPUP, J2EE_ATTRIBUTES_VIEW_POPUP, J2EE_VIEW_POPUP, USAGE_VIEW_POPUP,
    STRUCTURE_VIEW_POPUP, TODO_VIEW_POPUP, COMPILER_MESSAGES_POPUP, ANT_MESSAGES_POPUP, ANT_EXPLORER_POPUP, UPDATE_POPUP,
    FILEVIEW_POPUP, CHECKOUT_POPUP, LVCS_DIRECTORY_HISTORY_POPUP, GUI_DESIGNER_EDITOR_POPUP, GUI_DESIGNER_COMPONENT_TREE_POPUP,
    GUI_DESIGNER_PROPERTY_INSPECTOR_POPUP,
    CREATE_EJB_POPUP, CHANGES_VIEW_POPUP, DATABASE_VIEW_POPUP, REMOTE_HOST_VIEW_POPUP, REMOTE_HOST_DIALOG_POPUP, TFS_TREE_POPUP,
    ACTION_PLACE_VCS_QUICK_LIST_POPUP_ACTION, PHING_EXPLORER_POPUP, NAVIGATION_BAR_POPUP, JS_BUILD_TOOL_POPUP,
    V8_CPU_PROFILING_POPUP, V8_HEAP_PROFILING_POPUP, V8_HEAP_PROFILING_POPUP, RUN_DASHBOARD_POPUP, SERVICES_POPUP, EDITOR_GUTTER_POPUP
  );

  private static final String POPUP_PREFIX = "popup@";

  public static boolean isPopupPlace(@NotNull String place) {
    return ourPopupPlaces.contains(place) || place.startsWith(POPUP_PREFIX);
  }

  public static boolean isCommonPlace(@NotNull String place) {
    return ourPopupPlaces.contains(place) || ourCommonPlaces.contains(place);
  }

  public static boolean isMainMenuOrShortcut(@NotNull String place) {
    return MAIN_MENU.equals(place) || KEYBOARD_SHORTCUT.equals(place);
  }

  @NotNull
  public static String getActionGroupPopupPlace(@Nullable String actionId) {
    return actionId == null ? POPUP : POPUP_PREFIX + actionId;
  }
}
