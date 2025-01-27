package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Int,Boolean), b: T_A[Int, Char]) extends T_A[T_A[Byte, Int], T_A[Int, Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_C (T_A (T_A (CC_A Boolean))))