package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Char)) extends T_A[C, T_A[C, C]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)