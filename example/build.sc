import mill._, scalalib._

object example extends ScalaModule {
  def scalaVersion = "2.13.2"
  def millVersion = System.getProperty("MILL_VERSION")

  val zioVersion = "1.0.0-RC20"

  import coursier.MavenRepository

  override def repositories = super.repositories ++ Agg(
    MavenRepository("https://jitpack.io")
  )

  override def ivyDeps = super.ivyDeps() ++ Agg(
    ivy"com.lihaoyi:ammonite_${scalaVersion()}:2.1.4",
    ivy"dev.zio::zio:${zioVersion}",
    ivy"dev.zio::zio-streams:${zioVersion}",
    ivy"com.softwaremill.sttp.client::core:2.2.4",
    ivy"io.github.kossal::keybase-ammonite-bot:d44bc90fcb"
  )
}
