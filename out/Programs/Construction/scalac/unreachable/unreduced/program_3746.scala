package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Boolean],T_A[Char]), b: T_A[Char], c: T_B[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B[C](a: CC_A, b: T_B[T_B[C]]) extends T_A[C]
case class CC_C() extends T_A[Boolean]
case class CC_D(a: (T_A[CC_A],Byte), b: T_A[T_A[(Int,Char)]], c: CC_C) extends T_B[CC_B[T_A[CC_C]]]
case class CC_E(a: CC_A, b: T_A[T_A[CC_A]]) extends T_B[CC_B[T_A[CC_C]]]
case class CC_F() extends T_B[CC_B[T_A[CC_C]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, CC_B(_, _), _)