package Program_15 

object Test {
sealed trait T_B[A]
case class CC_C[C](a: C) extends T_B[C]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A (CC_A Byte Boolean) (T_A (CC_A Byte Boolean)))