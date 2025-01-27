package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Int,Char)]) extends T_A
case class CC_B[B]() extends T_B[B]
case class CC_D[D]() extends T_B[D]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants