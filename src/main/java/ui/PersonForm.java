package ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Layout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


/**
 * User: Yves-T
 * Date: 17/11/13
 * Time: 08:00
 */
public class PersonForm extends CustomComponent {

    private Button save = new Button("Save");
    private Button cancel = new Button("Cancel");

    private Layout mainLayout;
    protected Layout header;
    protected Layout formLayout;
    protected Layout footer;

    public PersonForm() {
        init(new HorizontalLayout(), new FormLayout());
    }

    private void init(HorizontalLayout horizontalLayout, FormLayout formLayout) {
        this.header = horizontalLayout;
        this.formLayout = formLayout;

        // init the header
        horizontalLayout.setSpacing(true);
        horizontalLayout.addComponent(save);
        horizontalLayout.addComponent(cancel);

        // init the form
        TextField firstNameTextField = new TextField("First Name");
        formLayout.addComponent(firstNameTextField);
        TextField lastNameTextField = new TextField("Last Name");
        formLayout.addComponent(lastNameTextField);
        formLayout.setSizeUndefined();

        mainLayout = new VerticalLayout();
        mainLayout.addComponent(horizontalLayout);
        mainLayout.addComponent(formLayout);
        setCompositionRoot(mainLayout);
//        setSizeUndefined();
    }

    public Layout getHeader() {
        return header;
    }

    public Layout getFormLayout() {
        return formLayout;
    }

    public Layout getFooter() {
        return footer;
    }
}
