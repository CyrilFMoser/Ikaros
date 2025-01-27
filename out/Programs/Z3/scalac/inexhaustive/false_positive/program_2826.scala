package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C]) extends T_A[C, Byte]
case class CC_B[E, D, F](a: T_A[F, D]) extends T_A[E, D]
case class CC_C[G]() extends T_A[G, Byte]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (CC_B Byte Boolean Boolean Wildcard (T_A Byte Boolean))
//      (T_A Boolean Byte))
// This is not matched: (CC_A (CC_A (CC_A (CC_A (CC_B T_A) T_A) T_A) T_A) T_A)