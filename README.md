# scala-maxminddb
A Scala library providing access maxminddb.

[MaxmindDB](https://github.com/maxmind/libmaxminddb) let me feel enjoy to check the information of IP address. This is scala version as a kind of library.

Thanks to Geolite2!

In sbt interpreter...r
```scala
scala> import com.github.ng_labo.MaxmindDb
import com.github.ng_labo.MaxmindDb

scala> MaxmindDb.get("8.8.8.8")
res0: Map[String,String] = Map(org -> GOOGLE, asn -> 15169, cc -> US)
```
