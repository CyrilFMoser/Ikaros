package Program_14 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[Char]) extends T_A[T_B[Boolean]]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_B[D]) extends T_A[D]
case class CC_C[E](a: CC_B[E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]
case class CC_E() extends T_B[Char]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 1 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 2 
  case CC_B(CC_A(_, _), _, CC_D()) => 3 
  case CC_B(_, _, _) => 4 
  case CC_B(CC_B(_, _, _), _, _) => 5 
  case CC_B(_, CC_A(_, _), _) => 6 
  case CC_B(_, CC_B(_, _, _), CC_D()) => 7 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_C(_)) => 8 
  case CC_B(CC_B(_, _, _), CC_A(_, _), CC_D()) => 9 
  case CC_B(_, _, CC_D()) => 10 
  case CC_B(_, CC_A(_, _), CC_C(_)) => 11 
  case CC_B(CC_B(_, _, _), _, CC_D()) => 12 
  case CC_B(_, _, CC_C(_)) => 13 
  case CC_B(CC_A(_, _), CC_B(_, _, _), _) => 14 
  case CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_)) => 15 
  case CC_B(CC_B(_, _, _), _, CC_C(_)) => 16 
}
}
// This is not matched: (CC_A Byte Byte Wildcard (T_A (T_B Boolean)))
// This is not matched: (CC_A (CC_A (CC_B T_A) T_A) T_A)