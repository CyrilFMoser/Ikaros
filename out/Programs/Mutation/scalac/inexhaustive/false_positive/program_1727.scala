package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, F](a: (Byte,Byte)) extends T_A[F, G]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_C (T_B (CC_A T_A T_A)) Wildcard Wildcard (T_B (T_B (CC_A T_A T_A))))
// Mutation information: 
// Deleted Pattern CC_C(12, CC_C(_, _)) at position 1