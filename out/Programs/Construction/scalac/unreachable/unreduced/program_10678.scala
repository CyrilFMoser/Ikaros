package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[(Boolean,Byte)]]) extends T_A[T_B[Byte]]
case class CC_B(a: T_B[T_A[CC_A]]) extends T_A[T_B[Byte]]
case class CC_C() extends T_A[T_B[Byte]]
case class CC_D[C](a: C) extends T_B[C]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()