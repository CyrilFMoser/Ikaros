package Program_14 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E]) extends T_A[E]
case class CC_C() extends T_B[CC_B[Byte], CC_B[Char]]
case class CC_D() extends T_B[CC_B[Byte], CC_B[Char]]
case class CC_E[F](a: F, b: CC_B[F], c: T_B[F, F]) extends T_B[CC_B[Byte], CC_B[Char]]

val v_a: T_B[CC_B[Byte], CC_B[Char]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, CC_B(_, _), _) => 2 
}
}
// This is not matched: (CC_E Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_B Byte Boolean Boolean Boolean)
//           (CC_B Char Boolean Boolean Boolean)))
// This is not matched: (CC_A Int Byte (T_A Byte Int))