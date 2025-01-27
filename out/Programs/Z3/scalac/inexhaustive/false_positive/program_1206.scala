package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, D], b: T_B[D], c: T_A[E, D]) extends T_A[T_A[Boolean, Boolean], D]
case class CC_B[F](a: F, b: T_B[F]) extends T_A[T_A[Boolean, Boolean], F]
case class CC_C[G]() extends T_A[T_A[Boolean, Boolean], G]
case class CC_D[H, I](a: T_A[I, H], b: Int, c: I) extends T_B[H]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Byte
//      Int
//      Wildcard
//      (CC_D Byte Boolean Wildcard Wildcard Wildcard (T_B Byte))
//      Wildcard
//      (T_A (T_A Boolean Boolean) Byte))
// This is not matched: (CC_A (Tuple (CC_C (CC_A (Tuple Wildcard Wildcard) Wildcard T_A) Wildcard T_A)
//             Wildcard)
//      Wildcard
//      T_A)