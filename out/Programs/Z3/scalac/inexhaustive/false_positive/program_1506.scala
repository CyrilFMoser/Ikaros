package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[Char, Boolean], C]

val v_a: T_A[T_A[Char, Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C (CC_A (CC_B Boolean Boolean) Boolean (T_A (CC_B Boolean Boolean)))
//      Wildcard
//      Wildcard
//      (T_A (T_A Int)))