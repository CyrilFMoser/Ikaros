package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: CC_A[T_A[(Int,Char)]], b: T_A[CC_A[Byte]]) extends T_A[CC_A[Byte]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_A())) => 0 
}
}
// This is not matched: CC_B(_)