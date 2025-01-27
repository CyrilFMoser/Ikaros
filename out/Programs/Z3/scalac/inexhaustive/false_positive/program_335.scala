package Program_29 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[Byte], b: T_A[(Int,Boolean), D], c: T_B[D]) extends T_A[D, T_A[D, Byte]]
case class CC_B[E](a: CC_A[E], b: CC_A[E], c: T_B[E]) extends T_A[E, T_A[E, Byte]]
case class CC_C[F, G](a: T_B[G]) extends T_B[F]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}
// This is not matched: (CC_C Boolean Boolean Wildcard (T_B Boolean))
// This is not matched: (CC_C Byte Wildcard Wildcard Wildcard (T_A (T_A Byte Byte) Byte))