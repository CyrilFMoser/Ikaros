package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: C) extends T_A[D, C]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard (T_A T_B T_B))