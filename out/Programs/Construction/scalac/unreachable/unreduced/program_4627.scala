package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B[E](a: CC_A[T_B[E, E]], b: T_A[E], c: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G]() extends T_B[CC_B[G], G]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(), _), _) => 2 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _) => 3 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _) => 4 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), CC_C()), _) => 5 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _, _), CC_A(_, _)), _) => 6 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _, _), CC_C()), _) => 7 
  case CC_A(CC_B(CC_A(_, _), CC_C(), CC_A(_, _)), _) => 8 
  case CC_A(CC_B(CC_A(_, _), CC_C(), CC_B(_, _, _)), _) => 9 
  case CC_A(CC_B(CC_A(_, _), CC_C(), CC_C()), _) => 10 
  case CC_A(CC_C(), _) => 11 
}
}
// This is not matched: CC_A(CC_B(CC_A(_, _), CC_B(_, _, _), CC_B(_, _, _)), _)