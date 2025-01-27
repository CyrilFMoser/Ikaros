package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_A[T_A[Byte]], c: T_B[T_B[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Boolean]]]
case class CC_C() extends T_B[CC_A]
case class CC_D(a: T_A[T_B[CC_A]]) extends T_B[CC_A]
case class CC_E[C]() extends T_B[C]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_E() => 2 
}
}