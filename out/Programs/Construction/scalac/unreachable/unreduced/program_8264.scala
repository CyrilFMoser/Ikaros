package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_A[T_B, Boolean], T_A[T_B, T_B]], C]
case class CC_B[D](a: Boolean) extends T_A[T_A[T_A[T_B, Boolean], T_A[T_B, T_B]], D]
case class CC_C[E](a: (T_A[T_B, T_B],((Boolean,Char),T_B))) extends T_A[T_A[T_A[T_B, Boolean], T_A[T_B, T_B]], E]
case class CC_D(a: CC_C[Int], b: T_B, c: Boolean) extends T_B
case class CC_E(a: Char, b: CC_C[Byte], c: CC_D) extends T_B
case class CC_F(a: T_A[CC_C[CC_E], T_A[T_B, CC_E]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(CC_C(_), _, _), true) => 0 
  case CC_D(_, CC_E(_, CC_C(_), CC_D(_, _, _)), true) => 1 
  case CC_D(_, CC_F(_), true) => 2 
  case CC_D(_, CC_D(CC_C(_), _, _), false) => 3 
  case CC_D(_, CC_E(_, CC_C(_), CC_D(_, _, _)), false) => 4 
  case CC_D(_, CC_F(_), false) => 5 
  case CC_E('x', _, CC_D(_, _, _)) => 6 
  case CC_E(_, _, CC_D(_, _, _)) => 7 
}
}
// This is not matched: CC_F(_)