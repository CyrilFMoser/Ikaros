package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_B]

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_B T_B T_B Wildcard (T_A T_B))