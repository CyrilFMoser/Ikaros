package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Int,Boolean), b: T_A[C, C]) extends T_A[C, T_B]

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_C Boolean Wildcard (T_A (T_A Int)))