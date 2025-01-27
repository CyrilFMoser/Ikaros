package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Int,Byte), b: T_A[E, E]) extends T_A[T_B[Char, Boolean], E]

val v_a: T_A[T_B[Char, Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_A T_A)