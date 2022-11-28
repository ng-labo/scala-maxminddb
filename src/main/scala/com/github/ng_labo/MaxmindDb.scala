package com.github.ng_labo

object MaxmindDb {
  val GEOIP2ASN = "/usr/share/GeoIP/GeoLite2-ASN.mmdb"
  val GEOIP2COUNTRY = "/usr/share/GeoIP/GeoLite2-Country.mmdb"

  lazy val readerASN = new Lookup(GEOIP2ASN)
  lazy val readerCountry = new Lookup(GEOIP2COUNTRY)

  def get(host: String): Map[String, String] = {
    val asn = readerASN.call(host) match {
      case e: Exception => Map[String, String]("org" -> "", "asn" -> "") 
      case null => Map[String, String]("org" -> "", "asn" -> "") 
      case r => Map[String, String](
            "org" -> r.get("autonomous_system_organization").toString,
            "asn" -> r.get("autonomous_system_number").toString)
    }
    val cc = readerCountry.call(host) match {
      case e: Exception => Map[String, String]("cc" -> "")
      case null => Map[String, String]("cc" -> "")
      case r => Map[String, String]("cc" -> r.get("registered_country").asInstanceOf[java.util.Map[String, Any]].get("iso_code").toString)
    }
    asn ++ cc
  }

  def main(args: Array[String]): Unit = {
    args.foreach( host => println(host + "=>" + get(host)) )
  }

}
