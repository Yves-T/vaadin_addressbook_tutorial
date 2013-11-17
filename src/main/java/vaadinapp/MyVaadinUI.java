package vaadinapp;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import container.PersonContainer;
import ui.HelpWindow;
import ui.ListView;
import ui.NavigationTree;
import ui.PersonForm;
import ui.PersonList;
import ui.SharingOptions;

import javax.servlet.annotation.WebServlet;

@Theme("runo")
@SuppressWarnings("serial")
public class MyVaadinUI extends UI {

    private Button newContact = new Button("Add contact");
    private Button search = new Button("Search");
    private Button share = new Button("Share");
    private Button help = new Button("Help");
    private HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
    private NavigationTree tree = new NavigationTree();
    private ListView listView;
    private PersonList personList;
    private PersonForm personForm;
    private Window helpView;
    private Window sharingOptions;
    private PersonContainer dataSource = PersonContainer.createWithTestData();

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = MyVaadinUI.class, widgetset = "vaadinapp.AppWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        buildMainLayout();
    }

    private void buildMainLayout() {
        final VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        setContent(layout);

        layout.addComponent(createToolbar());
        layout.addComponent(horizontalSplitPanel);

        // allocate all avaulable extra space to the horizontal split panel
        layout.setExpandRatio(horizontalSplitPanel, 1);
        // set the initial split position so we can have a 200 px menu to the left
        horizontalSplitPanel.setSplitPosition(200, Unit.PIXELS);
        horizontalSplitPanel.setFirstComponent(tree);

        setMainComponent(getListView());

        addWindow(getHelpWindow());

    }

    private HorizontalLayout createToolbar() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addComponent(newContact);
        horizontalLayout.addComponent(search);
        horizontalLayout.addComponent(share);
        horizontalLayout.addComponent(help);

        return horizontalLayout;
    }

    private void setMainComponent(Component component) {
        horizontalSplitPanel.setSecondComponent(component);
    }

    public Component getListView() {
        if (listView == null) {
            personList = new PersonList(this);
            personForm = new PersonForm();
            listView = new ListView(personList, personForm);
        }
        return listView;
    }

    public Window getHelpWindow() {
        if (helpView == null) {
            helpView = new HelpWindow();
        }
        return helpView;
    }

    public Window getSharingOptions() {
        if (sharingOptions == null) {
            sharingOptions = new SharingOptions();
        }
        return sharingOptions;
    }

    public PersonContainer getDataSource() {
        return dataSource;
    }
}
