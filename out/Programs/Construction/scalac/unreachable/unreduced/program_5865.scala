package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: C) extends T_A[(T_A[T_B, T_B],(T_B,Boolean)), C]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[T_B, D]
case class CC_C() extends T_A[(T_A[T_B, T_B],(T_B,Boolean)), T_A[T_B, Byte]]
case class CC_D(a: Byte, b: CC_A[T_B]) extends T_B
case class CC_E(a: T_A[Int, CC_C]) extends T_B
case class CC_F(a: (CC_E,CC_B[Byte]), b: CC_C, c: (T_A[T_B, CC_E],T_A[CC_C, CC_E])) extends T_B

val v_a: T_A[(T_A[T_B, T_B],(T_B,Boolean)), T_A[T_B, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_), _, CC_B(CC_A(_, _, _), _)) => 0 
  case CC_A(CC_F(_, _, _), _, CC_B(CC_A(_, _, _), _)) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A(CC_D(_, _), _, CC_B(CC_A(_, _, _), _))