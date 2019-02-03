package controllers;

import java.util.List;

import com.google.inject.Inject;

import models.Member;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
	private Form<Member> form;
	
	@Inject
	public HomeController(FormFactory formFactory) {
		this.form = formFactory.form(Member.class);
	}
    public Result index() {
    	List<Member> datas = Member.find.all();
        return ok(views.html.index.render("データベースサンプル",datas));
    }
    
    public Result add() {
    	return ok(views.html.add.render("投稿フォーム",form));
    }
    
    public Result create() {
    	Form<Member> userform = form.bindFromRequest();
    	Member data = userform.get();
		data.save();
		return redirect("/");
    }

}
