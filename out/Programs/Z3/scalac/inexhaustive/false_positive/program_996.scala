package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: C) extends T_A[Int, C]
case class CC_B[D, E](a: T_A[D, E], b: T_A[E, D], c: Int) extends T_A[D, T_A[Int, Int]]
case class CC_C[F](a: F, b: T_A[F, F]) extends T_A[F, T_A[Int, Int]]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants