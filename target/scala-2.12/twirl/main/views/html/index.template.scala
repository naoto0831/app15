
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String,datas:List[Member]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
  <p>"""),_display_(/*5.7*/message),format.raw/*5.14*/("""</p>
  <p>"""),_display_(/*6.7*/datas),format.raw/*6.12*/("""</p>
  <p><a href=""""),_display_(/*7.16*/routes/*7.22*/.HomeController.add),format.raw/*7.41*/("""">登録</a></p>	
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(message:String,datas:List[Member]): play.twirl.api.HtmlFormat.Appendable = apply(message,datas)

  def f:((String,List[Member]) => play.twirl.api.HtmlFormat.Appendable) = (message,datas) => apply(message,datas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Feb 03 20:57:14 JST 2019
                  SOURCE: C:/play/app15/app/views/index.scala.html
                  HASH: 19bf7059002e4f647a95773d13313876cfe310bb
                  MATRIX: 961->1|1091->36|1121->41|1152->64|1191->66|1221->70|1279->103|1306->110|1343->122|1368->127|1415->148|1429->154|1468->173|1513->189
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|38->6|38->6|39->7|39->7|39->7|40->8
                  -- GENERATED --
              */
          