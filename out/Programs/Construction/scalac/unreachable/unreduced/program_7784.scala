package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: Int, c: T_B[D]) extends T_A[T_A[D, D], D]
case class CC_B(a: Int, b: T_B[T_A[Byte, Byte]], c: CC_A[Int]) extends T_A[T_A[T_B[Byte], T_B[Byte]], T_B[Byte]]
case class CC_C[E, F]() extends T_A[E, F]
case class CC_D(a: Byte) extends T_B[CC_C[(Byte,CC_B), T_A[CC_B, CC_B]]]

val v_a: T_A[T_A[T_B[Byte], T_B[Byte]], T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A(_, _, _)