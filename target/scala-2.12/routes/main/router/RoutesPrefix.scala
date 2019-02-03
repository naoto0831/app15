// @GENERATOR:play-routes-compiler
// @SOURCE:C:/play/app15/conf/routes
// @DATE:Sun Feb 03 20:36:04 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
