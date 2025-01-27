package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Char), b: T_A[C, C]) extends T_A[C, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_A Char (CC_E Wildcard T_B) (T_A Char))