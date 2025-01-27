package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: T_B[Char, T_A], c: T_A) extends T_A
case class CC_C[C](a: C) extends T_B[CC_A, C]
case class CC_D[D](a: D) extends T_B[CC_A, D]
case class CC_E[E](a: E, b: T_A) extends T_B[CC_A, E]

val v_a: T_B[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
  case CC_E(_, CC_B(_, _, CC_A(_))) => 2 
  case CC_E(_, CC_B(_, _, CC_B(_, _, _))) => 3 
}
}
// This is not matched: CC_E(_, CC_A(_))