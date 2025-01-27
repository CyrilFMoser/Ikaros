package Program_61 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B(a: (Int,Char)) extends T_A[CC_A[Byte], T_A[Int, Char]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: (CC_B Int Boolean Wildcard (T_B Int))
// Mutation information: 
// Deleted Pattern CC_B(CC_B(_)) at position 1