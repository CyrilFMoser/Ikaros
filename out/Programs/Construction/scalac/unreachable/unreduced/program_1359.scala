package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(Int,Char), C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[(Int,Char), Boolean], D]
case class CC_C(a: Byte, b: T_A[T_A[T_B, T_B], CC_B[T_B]], c: Int) extends T_B
case class CC_D(a: Int, b: CC_A[CC_A[CC_C]]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_A()) => 1 
  case CC_E() => 2 
}
}