package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Char]) extends T_A[C, Char]
case class CC_B[D]() extends T_A[D, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, CC_B())) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_B Boolean))