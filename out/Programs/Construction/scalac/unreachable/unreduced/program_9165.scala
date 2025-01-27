package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[(Boolean,Boolean)], b: T_A[Boolean], c: T_A[((Boolean,Boolean),Boolean)]) extends T_A[Boolean]
case class CC_C(a: CC_B, b: Int) extends T_B[T_B[T_B[CC_B]]]
case class CC_D(a: CC_B) extends T_B[T_B[T_B[CC_B]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}