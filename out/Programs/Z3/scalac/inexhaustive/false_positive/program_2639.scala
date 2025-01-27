package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: E, c: CC_A[E]) extends T_A[E]
case class CC_C(a: T_A[Char]) extends T_A[Char]
case class CC_D[G, F, H](a: G, b: CC_C, c: CC_A[G]) extends T_B[G, F]
case class CC_E[I, J](a: Char) extends T_B[J, I]
case class CC_F[K]() extends T_B[CC_C, K]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _, _), _, _) => 0 
  case CC_B(CC_D(_, _, _), _, CC_A(_, _)) => 1 
  case CC_B(CC_E(_), _, CC_A(_, _)) => 2 
  case CC_A(CC_D(_, _, _), _) => 3 
  case CC_A(CC_E(_), _) => 4 
}
}
// This is not matched: (CC_A Boolean
//      (CC_D Boolean
//            Boolean
//            (T_A Boolean)
//            Boolean
//            (CC_C Wildcard (T_A Char))
//            Wildcard
//            (T_B Boolean Boolean))
//      Boolean
//      (T_A Boolean))
// This is not matched: (CC_C T_B)