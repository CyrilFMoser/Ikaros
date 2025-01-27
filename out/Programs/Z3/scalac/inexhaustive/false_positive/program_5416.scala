package Program_14 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: D) extends T_A[D]
case class CC_B[F, E](a: F, b: F, c: T_B[E, E]) extends T_B[F, E]
case class CC_C[G, H, I]() extends T_B[G, H]
case class CC_D[J, K]() extends T_B[J, K]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C() => 1 
  case CC_B(0, _, CC_C()) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: (CC_C Byte Int Boolean (T_B Byte Int))
// This is not matched: (CC_B Boolean
//      (CC_B Boolean Wildcard Wildcard Wildcard (T_A Boolean))
//      Wildcard
//      Wildcard
//      (T_A Boolean))