package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Int, C], b: C) extends T_A[C, T_A[Char, Byte]]

val v_a: T_A[Char, T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard (CC_C Wildcard Int Wildcard T_A) T_A) T_A)