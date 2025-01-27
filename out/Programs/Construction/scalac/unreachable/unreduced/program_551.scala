package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: CC_A, b: Char, c: Boolean) extends T_A
case class CC_C(a: CC_A, b: T_B[T_B[T_A]]) extends T_A
case class CC_D() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_C(CC_A(_, _, _), _) => 1 
}
}
// This is not matched: CC_A(_, _, _)