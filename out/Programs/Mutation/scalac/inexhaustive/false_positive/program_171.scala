package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_B[D, E](a: E) extends T_A[D, E]

val v_a: CC_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_E Boolean
//      (CC_B Boolean (T_A Boolean) Boolean Boolean)
//      (CC_C (CC_B Boolean Boolean Boolean Boolean)
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_A (CC_B Boolean Boolean Boolean Boolean)))
//      (Tuple Wildcard Int)
//      Wildcard
//      (T_B (CC_B Boolean (T_A Boolean) Boolean Boolean) Boolean))
// Mutation information: 
// Deleted Pattern CC_E(CC_C(_, CC_A(_, _), _), ((_,12),_), CC_A('x', CC_D(_))) at position 4