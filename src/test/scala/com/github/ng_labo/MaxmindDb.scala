package com.github.ng_labo

import org.specs2.mutable.SpecificationWithJUnit

class MaxmindDbTest extends SpecificationWithJUnit {
  "MaxmindDb" should {
    "get" in {
        val google = MaxmindDb.get("8.8.8.8")
        google("asn") mustEqual "15169"
        google("cc") mustEqual "US"
        google("org").length>0 mustEqual true

        val local = MaxmindDb.get("192.168.1.0")
        local("asn").length==0 mustEqual true
        local("cc").length==0 mustEqual true
        local("org").length==0 mustEqual true
    }
  }
}
