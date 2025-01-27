package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: (Boolean,Byte), b: T_A[Byte, Char]) extends T_A[Int, T_A[Int, Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,0), _) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Char)))
// Mutation information: 
// Deleted Pattern CC_B(_, _, _) at position 0