package controllers;

import play.*;
import play.mvc.*;
import play.api.libs.json.*;

import views.html.*;

import models.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready!"));
  }

  public static Result test() {
    Test t = new Test();
    t.setText("TEST!");
    return ok(t.getText());
  }
  
}
