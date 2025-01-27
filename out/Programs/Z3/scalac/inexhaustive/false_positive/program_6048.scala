package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Byte,Boolean)) extends T_A[C, D]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_B (T_A (CC_A Boolean))))