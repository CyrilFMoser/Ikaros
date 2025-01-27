package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[(T_A[Boolean],Byte)]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[(T_A[Boolean],Byte)]
case class CC_C(a: Char, b: Char, c: T_A[T_A[Int]]) extends T_A[(T_A[Boolean],Byte)]

val v_a: T_A[(T_A[Boolean],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)