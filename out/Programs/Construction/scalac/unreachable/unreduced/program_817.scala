package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Byte, D], b: T_B[D], c: D) extends T_A[Byte, D]
case class CC_B[E](a: T_A[Byte, E]) extends T_A[Byte, E]
case class CC_C() extends T_B[T_A[T_A[Byte, Boolean], CC_B[Int]]]
case class CC_D(a: CC_C, b: Int, c: CC_B[CC_A[CC_C]]) extends T_B[T_A[T_A[Byte, Boolean], CC_B[Int]]]

val v_a: T_A[Byte, CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}