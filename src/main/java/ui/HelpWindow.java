package ui;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * User: Yves-T
 * Date: 17/11/13
 * Time: 10:03
 */
public class HelpWindow extends Window {
    private static final String HELP_HTML_SNIPPET = "This is"
            + "an application built durng <string<a href=\""
            + "http://dev.vaadin.com/\">Vaadin</a></strong> "
            + "tutorial. Hopefully it doesn't need any real help";

    public HelpWindow() {
        setCaption("Adress Book Help");
        Label contentLabel = new Label(HELP_HTML_SNIPPET);
        contentLabel.setContentMode(ContentMode.HTML);
        setContent(contentLabel);
    }
}

