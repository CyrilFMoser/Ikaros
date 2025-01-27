package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: (Byte,Byte)) extends T_A[T_A[D, D], D]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_C (CC_D T_B T_B) Wildcard Wildcard (T_A (Tuple T_B T_B) (CC_D T_B T_B)))