package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B, T_A[T_A[T_B, T_B], T_A[(Boolean,Boolean), (Char,Char)]]]
case class CC_B[C](a: C) extends T_A[C, T_B]
case class CC_C(a: CC_B[T_A[T_B, T_B]], b: T_A[CC_B[CC_A], T_B]) extends T_A[T_B, T_A[T_A[T_B, T_B], T_A[(Boolean,Boolean), (Char,Char)]]]
case class CC_D(a: T_A[CC_C, T_B]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), CC_B(_)) => 0 
}
}