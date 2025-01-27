package Program_28 

package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: T_B, b: T_A[D], c: Int) extends T_A[C]
case class CC_C[E](a: T_B, b: E) extends T_A[E]
case class CC_D(a: CC_A[T_A[T_B]], b: Byte) extends T_B
case class CC_E[F](a: F, b: T_A[F]) extends T_B

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_A(CC_B(CC_D(_, _), _, _), CC_A(_, _, CC_A(_, _, _)), _) => 1 
  case CC_A(CC_B(CC_E(_, _), _, _), CC_A(_, _, CC_A(_, _, _)), _) => 2 
  case CC_A(CC_C(CC_E(_, _), _), CC_A(_, _, CC_A(_, _, _)), _) => 3 
  case CC_A(CC_A(_, _, _), CC_A(_, _, CC_B(_, _, _)), _) => 4 
  case CC_A(CC_B(CC_D(_, _), _, _), CC_A(_, _, CC_B(_, _, _)), _) => 5 
  case CC_A(CC_B(CC_E(_, _), _, _), CC_A(_, _, CC_B(_, _, _)), _) => 6 
  case CC_A(CC_C(CC_D(_, _), _), CC_A(_, _, CC_B(_, _, _)), _) => 7 
  case CC_A(CC_C(CC_E(_, _), _), CC_A(_, _, CC_B(_, _, _)), _) => 8 
  case CC_A(CC_A(_, _, _), CC_A(_, _, CC_C(_, _)), _) => 9 
  case CC_A(CC_B(CC_D(_, _), _, _), CC_A(_, _, CC_C(_, _)), _) => 10 
  case CC_A(CC_B(CC_E(_, _), _, _), CC_A(_, _, CC_C(_, _)), _) => 11 
  case CC_A(CC_C(CC_D(_, _), _), CC_A(_, _, CC_C(_, _)), _) => 12 
  case CC_A(CC_C(CC_E(_, _), _), CC_A(_, _, CC_C(_, _)), _) => 13 
  case CC_A(CC_A(_, _, _), CC_B(_, _, _), _) => 14 
  case CC_A(CC_B(CC_D(_, _), _, _), CC_B(_, _, _), _) => 15 
  case CC_A(CC_B(CC_E(_, _), _, _), CC_B(_, _, _), _) => 16 
  case CC_A(CC_C(CC_D(_, _), _), CC_B(_, _, _), _) => 17 
  case CC_A(CC_C(CC_E(_, _), _), CC_B(_, _, _), _) => 18 
  case CC_A(CC_A(_, _, _), CC_C(_, _), _) => 19 
  case CC_A(CC_B(CC_D(_, _), _, _), CC_C(_, _), _) => 20 
  case CC_A(CC_B(CC_E(_, _), _, _), CC_C(_, _), _) => 21 
  case CC_A(CC_C(CC_D(_, _), _), CC_C(_, _), _) => 22 
  case CC_A(CC_C(CC_E(_, _), _), CC_C(_, _), _) => 23 
}
}
// This is not matched: CC_A(CC_C(CC_D(_, _), _), CC_A(_, _, CC_A(_, _, _)), _)
// This is not matched: CC_A(CC_B(_), _)