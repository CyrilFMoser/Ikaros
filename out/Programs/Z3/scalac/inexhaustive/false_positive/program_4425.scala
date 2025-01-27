package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Int)) extends T_A[T_A[C, C], C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_A (T_B Char) Char Wildcard Wildcard Wildcard (T_A (T_B Char) Char))