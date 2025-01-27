package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[Int, Boolean]
case class CC_B[D](a: Byte, b: T_A[D, D]) extends T_B[D]
case class CC_C() extends T_B[CC_B[T_B[CC_A]]]
case class CC_D(a: CC_C, b: T_A[Int, Boolean], c: CC_C) extends T_B[CC_B[T_B[CC_A]]]

val v_a: T_B[CC_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(CC_C(), CC_A(), CC_C())