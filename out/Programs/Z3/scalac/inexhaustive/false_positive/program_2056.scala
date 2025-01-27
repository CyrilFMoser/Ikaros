package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Int), b: T_A[C, C]) extends T_A[C, T_A[(Int,Char), Int]]

val v_a: T_A[Int, T_A[(Int,Char), Int]] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_B T_A T_A)