package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[Char]) extends T_A[Char]
case class CC_B() extends T_A[Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_B())) => 0 
}
}
// This is not matched: CC_B(_, _, _)