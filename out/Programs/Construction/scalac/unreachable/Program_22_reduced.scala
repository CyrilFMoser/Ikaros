object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int]      ,Byte )) extends T_A[(T_A[Boolean],(Boolean,Int))]
case class CC_B   (a: CC_A) extends T_A[(T_A[Boolean],(Boolean,Int))]
val v_a: T_A[(T_A[Boolean],(Boolean,Int))] = null
val v_b      = v_a match{
  case CC_A((_,_)) => 0
  case CC_B(_) => 1
}
}
