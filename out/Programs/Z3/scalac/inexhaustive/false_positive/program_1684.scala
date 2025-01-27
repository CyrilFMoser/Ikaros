package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[Byte, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F, G](a: Byte, b: CC_A[F], c: F) extends T_B[T_B[Char, Char], F]
case class CC_C[H](a: CC_B[H, H], b: CC_B[Boolean, H], c: CC_A[H]) extends T_B[T_B[Char, Char], H]

val v_a: T_B[T_B[Char, Char], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(_, _, _), _, CC_A(_, _)) => 1 
  case CC_C(_, CC_B(_, _, _), _) => 2 
}
}
// This is not matched: (CC_B Int (T_B Boolean Boolean) Wildcard Wildcard Int (T_B (T_B Char Char) Int))
// This is not matched: (CC_A Char (T_A Char))