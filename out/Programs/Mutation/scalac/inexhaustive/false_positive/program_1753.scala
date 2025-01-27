package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[E](a: E, b: T_A[Int, E]) extends T_A[E, T_B]

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: (CC_B Byte (CC_A Byte T_B (T_A Byte T_B)) Byte Wildcard (T_A Byte T_B))
// Mutation information: 
// Deleted Pattern CC_A() at position 0