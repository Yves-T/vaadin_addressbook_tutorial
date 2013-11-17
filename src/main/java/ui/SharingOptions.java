package ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * User: Yves-T
 * Date: 17/11/13
 * Time: 10:18
 */
public class SharingOptions extends Window {

    public SharingOptions() {
        super("Sharing Options");
        center();

        // make this window modal, which will disable all other components while
        // it's visible
        setModal(true);

        // make the sub window 50% the size of the browser window
        setWidth("50%");

        VerticalLayout verticalLayout = new VerticalLayout();

        verticalLayout.addComponent(new Label("With these settings you can modify contact sharing " +
                "options. (non-functional, example of modal dialog)"));
        verticalLayout.addComponent(new CheckBox("Gmail"));
        verticalLayout.addComponent(new CheckBox(".Mac"));
        Button close = new Button("OK");
        verticalLayout.addComponent(close);
        setContent(verticalLayout);
    }

}
