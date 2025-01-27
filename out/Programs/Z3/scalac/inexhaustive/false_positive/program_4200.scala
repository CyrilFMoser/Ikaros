package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Int, Int], b: Char) extends T_A[Char, Byte]
case class CC_B() extends T_B[T_B[CC_A, Boolean], CC_A]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)