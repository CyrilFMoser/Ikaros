package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Byte, Boolean]], b: Boolean, c: Int) extends T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_B[C, D](a: CC_A) extends T_A[C, D]
case class CC_C(a: CC_B[T_A[CC_A, CC_A], CC_B[CC_A, CC_A]], b: T_A[T_A[CC_A, CC_A], (CC_A,CC_A)]) extends T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 0 
}
}