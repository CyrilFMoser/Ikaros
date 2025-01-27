package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[E](a: Char) extends T_A[E]
case class CC_C[F](a: T_B[F], b: F) extends T_A[F]
case class CC_D[G](a: (Char,Char), b: T_A[G], c: CC_A[G, G]) extends T_B[G]
case class CC_E[H](a: H, b: H, c: T_B[H]) extends T_B[H]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_D(_, _, _), _) => 0 
  case CC_C(CC_D(_, _, _), 0) => 1 
  case CC_C(_, 0) => 2 
}
}
// This is not matched: (CC_C Byte
//      (CC_E Byte Wildcard Wildcard Wildcard (T_B Byte))
//      Wildcard
//      (T_A Byte))
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Byte)))