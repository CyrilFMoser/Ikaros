package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B[C](a: Byte, b: (T_B,T_B)) extends T_A[C]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_D(),_)) => 0 
}
}
// This is not matched: (CC_A (CC_B T_A) Wildcard T_A)