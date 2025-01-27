package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_A[CC_A], b: T_B[T_A[CC_A], T_B[CC_A, CC_A]], c: Boolean) extends T_B[(Boolean,T_B[CC_A, CC_A]), T_A[CC_A]]
case class CC_C(a: Boolean, b: T_A[T_A[CC_A]], c: T_A[Boolean]) extends T_B[(Boolean,T_B[CC_A, CC_A]), T_A[CC_A]]
case class CC_D() extends T_B[(Boolean,T_B[CC_A, CC_A]), T_A[CC_A]]

val v_a: T_B[(Boolean,T_B[CC_A, CC_A]), T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A()) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, _, _)