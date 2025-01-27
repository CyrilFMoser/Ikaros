package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_A) extends T_A
case class CC_D[D](a: T_B[D, D], b: CC_A, c: T_A) extends T_B[D, CC_B]
case class CC_E[E](a: E, b: Char) extends T_B[E, CC_B]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_), _) => 0 
  case CC_E(_, 'x') => 1 
}
}
// This is not matched: CC_E(_, _)