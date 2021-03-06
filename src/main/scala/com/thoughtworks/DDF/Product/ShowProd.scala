package com.thoughtworks.DDF.Product

import com.thoughtworks.DDF.Arrow.ShowArr
import com.thoughtworks.DDF.{NoInfo, Show}

trait ShowProd extends Prod[NoInfo, Lambda[X => Show]] with ShowArr with SimpleProd[Lambda[X => Show]] {
  override def mkProd[A, B](implicit at: NoInfo[A], bt: NoInfo[B]) = Show("mkPair")

  override def fst[A, B](implicit at: NoInfo[A], bt: NoInfo[B]) = Show("fst")

  override def zro[A, B](implicit at: NoInfo[A], bt: NoInfo[B]) = Show("zro")

  override def curry[A, B, C](implicit ai: NoInfo[A], bi: NoInfo[B], ci: NoInfo[C]) = Show("curry")

  override def uncurry[A, B, C](implicit ai: NoInfo[A], bi: NoInfo[B], ci: NoInfo[C]) = Show("uncurry")

  override def ><[A, B, C, D](implicit ai: NoInfo[A], bi: NoInfo[B], ci: NoInfo[C], di: NoInfo[D]) = Show("><")
}

object ShowProd extends ShowProd