package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Int), b: T_A[C, Int]) extends T_A[T_A[Char, Byte], C]

val v_a: T_A[T_A[Char, Byte], Int] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)