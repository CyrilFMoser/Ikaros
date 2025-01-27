package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C(a: CC_B[T_A[Byte]], b: T_B[T_B[Byte, (Boolean,Byte)], T_A[(Int,Char)]]) extends T_B[CC_A[T_A[Char]], Boolean]
case class CC_D(a: (CC_B[CC_C],(CC_C,CC_C)), b: T_B[T_A[CC_C], T_A[CC_C]]) extends T_B[CC_A[T_A[Char]], Boolean]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))