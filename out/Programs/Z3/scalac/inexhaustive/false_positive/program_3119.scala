package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B[F, E, G]() extends T_A[F, E]
case class CC_C(a: (Char,Char), b: Boolean, c: T_A[Byte, Int]) extends T_A[T_B[T_A[Boolean, Char]], T_A[Boolean, Char]]
case class CC_D[H]() extends T_B[H]
case class CC_E[I](a: I, b: I, c: T_B[I]) extends T_B[I]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((_,_), _, CC_B()) => 0 
}
}
// This is not matched: (CC_C Wildcard
//      Wildcard
//      (CC_B Byte Int Boolean (T_A Byte Int))
//      (T_A (T_B (T_A Boolean Char)) (T_A Boolean Char)))
// This is not matched: (CC_D Boolean Boolean Wildcard Wildcard (T_B Boolean))