package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Byte)) extends T_A[C, T_A[Byte, Int]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_C (CC_B (CC_A T_A) T_A) Wildcard T_A)