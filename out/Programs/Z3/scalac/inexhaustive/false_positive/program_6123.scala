package Program_12 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Byte, b: Char, c: T_A) extends T_A
case class CC_B[E, D]() extends T_B[E, D]
case class CC_C[F](a: T_B[F, T_A], b: T_B[T_A, F], c: T_B[F, T_A]) extends T_B[(T_A,T_A), F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, 'x', CC_A(_, _, _)) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Char Wildcard (T_A Char (T_A Char Char)))