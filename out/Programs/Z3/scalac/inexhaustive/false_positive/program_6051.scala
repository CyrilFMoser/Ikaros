package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B(a: (Int,Boolean)) extends T_A[T_A[T_B[Int, Char], T_B[Int, Char]], T_B[Int, Char]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_B (T_A (CC_A Boolean))))