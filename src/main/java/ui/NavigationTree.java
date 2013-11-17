package ui;

import com.vaadin.ui.Tree;

/**
 * User: Yves-T
 * Date: 17/11/13
 * Time: 07:21
 */
public class NavigationTree extends Tree {
    public static final Object SHOW_ALL = "Show all";
    public static final Object SEARCH = "Search";

    public NavigationTree() {
        addItem(SHOW_ALL);
        addItem(SEARCH);
    }

}
