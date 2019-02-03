
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Form[models.Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String,form1:Form[models.Member]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
  <p>"""),_display_(/*5.7*/message),format.raw/*5.14*/("""</p>
  """),_display_(/*6.4*/helper/*6.10*/.form(action=routes.HomeController.create)/*6.52*/{_display_(Seq[Any](format.raw/*6.53*/("""
      """),_display_(/*7.8*/(helper.inputText(field=form1("name")))),format.raw/*7.47*/("""
      """),format.raw/*8.7*/("""<input type="submit">
  """)))}),format.raw/*9.4*/("""
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(message:String,form1:Form[models.Member]): play.twirl.api.HtmlFormat.Appendable = apply(message,form1)

  def f:((String,Form[models.Member]) => play.twirl.api.HtmlFormat.Appendable) = (message,form1) => apply(message,form1)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Feb 03 20:32:04 JST 2019
                  SOURCE: C:/play/app15/app/views/add.scala.html
                  HASH: fc56883bf91a31eb60418f363b2d1945610cd029
                  MATRIX: 966->1|1103->43|1133->48|1164->71|1203->73|1233->77|1291->110|1318->117|1352->126|1366->132|1416->174|1454->175|1488->184|1547->223|1581->231|1636->257|1669->260
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|38->6|38->6|38->6|38->6|39->7|39->7|40->8|41->9|42->10
                  -- GENERATED --
              */
          