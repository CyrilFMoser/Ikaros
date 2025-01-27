package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Char)) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (Tuple Boolean Int)))