package com.thoughtworks.DDF.Double

import com.thoughtworks.DDF.Arrow.SimpleArr
import com.thoughtworks.DDF.NoInfo

trait SimpleDouble[Repr[_]] extends DoubleInfo[NoInfo, Repr] with SimpleArr[Repr] {
  override implicit def doubleInfo = NoInfo()
}

object SimpleDouble {
  implicit def apply[Repr[_]] = new SimpleDouble[Repr] {}
}