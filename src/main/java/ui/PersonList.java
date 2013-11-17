package ui;

import com.vaadin.ui.Table;

/**
 * User: Yves-T
 * Date: 17/11/13
 * Time: 07:40
 */
public class PersonList extends Table {
    public PersonList() {
        // create some dummy data
        addContainerProperty("First Name", String.class, "Mark");
        addContainerProperty("Last Name", String.class, "Smith");
        addItem();
        addItem();
        setSizeFull();
    }
}
