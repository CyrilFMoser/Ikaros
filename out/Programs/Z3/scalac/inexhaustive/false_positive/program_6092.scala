package Program_14 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[T_B[(Byte,Boolean), Byte], E]
case class CC_B[F](a: CC_A[F], b: CC_A[F], c: CC_A[F]) extends T_A[T_B[(Byte,Boolean), Byte], F]
case class CC_C[G](a: CC_B[G], b: T_B[G, G]) extends T_B[CC_B[Int], CC_B[Boolean]]

val v_a: T_B[CC_B[Int], CC_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      Wildcard
//      (T_B (CC_B Int Boolean Boolean Boolean Boolean)
//           (CC_B Boolean Boolean Boolean Boolean Boolean)))
// This is not matched: Pattern match is empty without constants