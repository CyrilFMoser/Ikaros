package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: T_B[F], b: T_A[F, F]) extends T_A[E, D]
case class CC_B[G](a: CC_A[G, G, G], b: CC_A[Boolean, G, G], c: T_A[G, G]) extends T_A[G, T_B[G]]

val v_a: T_A[Boolean, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 2 
}
}
// This is not matched: (CC_A (T_B Boolean)
//      Boolean
//      (T_B Boolean)
//      Wildcard
//      Wildcard
//      (T_A Boolean (T_B Boolean)))
// This is not matched: Pattern match is empty without constants