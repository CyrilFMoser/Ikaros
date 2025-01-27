package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Byte]], c: T_A[T_A[Byte]]) extends T_A[(T_A[Byte],Byte)]
case class CC_B(a: CC_A, b: CC_A, c: T_A[CC_A]) extends T_A[(T_A[Byte],Byte)]
case class CC_C(a: CC_B, b: CC_B) extends T_A[(T_A[Byte],Byte)]

val v_a: T_A[(T_A[Byte],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _), _)