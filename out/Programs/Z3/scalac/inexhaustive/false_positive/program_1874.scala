package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B() extends T_A
case class CC_C[C](a: C) extends T_B[C, T_B[CC_B, Boolean]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants