package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,Int)) extends T_A[T_A[Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_B (T_A Int)))