package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[B]
case class CC_A(a: Char, b: T_B[Int]) extends T_A
case class CC_B() extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_C T_A)