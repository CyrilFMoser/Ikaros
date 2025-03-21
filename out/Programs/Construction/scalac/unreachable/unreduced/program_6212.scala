package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: T_B[CC_B, T_A], b: T_B[CC_B, T_B[CC_A, T_A]], c: T_B[T_B[Byte, Int], T_A]) extends T_A
case class CC_D[C, D](a: D) extends T_B[C, Int]
case class CC_E[E]() extends T_B[E, Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, CC_A(_)), _) => 2 
  case CC_B(CC_B(_, CC_B(_, _)), _) => 3 
  case CC_B(CC_B(_, CC_C(_, _, _)), _) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_C(_, _, _), _)