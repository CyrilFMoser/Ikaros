package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D) extends T_A[D, E]
case class CC_C[F](a: T_B[F]) extends T_B[F]
case class CC_D[G](a: CC_C[G]) extends T_B[G]

val v_a: CC_C[T_B[CC_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_C (T_B (CC_A Boolean Int Boolean Boolean (T_A Boolean Boolean) Boolean))
//      (CC_D (T_B (CC_A Boolean Int Boolean Boolean Boolean Boolean))
//            Wildcard
//            Wildcard
//            (T_B (T_B (CC_A Boolean Int Boolean Boolean Boolean Boolean))))
//      Wildcard
//      Wildcard
//      (T_B (T_B (CC_A Boolean Int Boolean Boolean (T_A Boolean Boolean) Boolean))))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_B(_, _, _)
// }
//