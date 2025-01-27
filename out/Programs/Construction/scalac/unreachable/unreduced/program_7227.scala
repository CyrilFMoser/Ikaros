package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: D) extends T_A[T_B[T_A[Char, Byte]], D]
case class CC_B() extends T_A[T_B[T_A[Char, Byte]], T_B[T_B[Int]]]
case class CC_C(a: T_A[T_B[CC_B], Byte], b: CC_A[T_A[CC_B, CC_B]]) extends T_B[T_A[T_A[Byte, CC_B], Byte]]

val v_a: T_A[T_B[T_A[Char, Byte]], T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, _)