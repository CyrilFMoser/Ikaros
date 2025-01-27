package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: (((Byte,Boolean),T_A),T_A), c: T_B[(T_A,T_A), T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[C, D](a: C, b: C, c: CC_A) extends T_B[C, Boolean]
case class CC_D[E]() extends T_B[E, Boolean]
case class CC_E(a: CC_B, b: CC_B, c: Boolean) extends T_B[T_A, Boolean]

val v_a: T_B[T_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, (_,_), _), CC_A(_, _, _)) => 0 
  case CC_C(_, CC_B(CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_E(CC_B(_), CC_B(_), true) => 2 
  case CC_E(CC_B(_), CC_B(_), false) => 3 
}
}
// This is not matched: CC_D()