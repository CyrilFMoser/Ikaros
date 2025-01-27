package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: D, c: D) extends T_A[D]
case class CC_C() extends T_B[T_A[T_B[Boolean]]]
case class CC_D(a: Byte, b: CC_C, c: T_A[CC_A[CC_C]]) extends T_B[T_A[T_B[Boolean]]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(), CC_A(_, _)) => 0 
  case CC_D(_, CC_C(), CC_B(_, _, _)) => 1 
}
}