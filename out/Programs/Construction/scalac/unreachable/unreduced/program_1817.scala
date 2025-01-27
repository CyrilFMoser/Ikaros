package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[(Char,Boolean), Boolean]], b: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_A, b: T_B[CC_B, Char], c: T_B[CC_B, CC_A]) extends T_A
case class CC_D[C]() extends T_B[C, CC_A]
case class CC_E[D, E](a: D) extends T_B[D, CC_A]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_, _)) => 1 
  case CC_E(CC_B(_)) => 2 
}
}
// This is not matched: CC_E(CC_C(_, _, _))