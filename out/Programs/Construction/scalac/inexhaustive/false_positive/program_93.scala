package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (T_B,Int)) extends T_A[B]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(),_)) => 0 
}
}
// This is not matched: CC_B(_)