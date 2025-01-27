package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_B[(Boolean,Int), T_A]) extends T_A
case class CC_B() extends T_A
case class CC_E() extends T_B[Int, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A((_,CC_A(_, _)), _) => 1 
}
}
// This is not matched: (CC_B Wildcard T_A)