package ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * User: Yves-T
 * Date: 17/11/13
 * Time: 10:18
 */
public class SharingOptions extends Window {

    public SharingOptions() {
        // make this window modal, which will disable all other components while
        // it's visible
        setModal(true);

        // make the sub window 50% the size of the browser window
        setWidth("50%");

        // center the window both horizontally and vertically in the browser window
        center();

        setCaption("Sharing options");
        setContent(new Label("With these settings you can modify contact sharing " +
                "options. (non-functional, example of modal dialog)"));
        setContent(new CheckBox("Gmail"));
        setContent(new CheckBox(".Mac"));
        Button close = new Button("OK");
        setContent(close);
    }

}
