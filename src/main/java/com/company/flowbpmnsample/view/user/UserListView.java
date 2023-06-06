package com.company.flowbpmnsample.view.user;

import com.company.flowbpmnsample.entity.User;
import com.company.flowbpmnsample.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.bpmflowui.processform.annotation.ProcessForm;
import io.jmix.flowui.view.*;

@Route(value = "users", layout = MainView.class)
@ViewController("User.list")
@ViewDescriptor("user-list-view.xml")
@LookupComponent("usersTable")
@DialogMode(width = "50em", height = "37.5em")
@ProcessForm
public class UserListView extends StandardListView<User> {
}