package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Int,Int)) extends T_A[C, T_A[Int, Char]]

val v_a: T_A[Char, T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_C T_A)