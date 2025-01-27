package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[CC_A], b: T_A[Char]) extends T_A[Char]
case class CC_C[E, D](a: E) extends T_B[E, D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}
// This is not matched: CC_B(_, CC_B(_, _))