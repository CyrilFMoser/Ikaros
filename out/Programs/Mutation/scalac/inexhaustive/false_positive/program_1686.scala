package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, (Int,Int)]

val v_a: T_A[Int, (Int,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_B T_B)
// Mutation information: 
// Deleted Pattern CC_C(CC_C(_)) at position 1