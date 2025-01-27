package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B(a: T_A[T_A[T_B]]) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: (Int,CC_C), b: CC_A[CC_C], c: T_A[CC_C]) extends T_B
case class CC_E(a: Boolean, b: Boolean) extends T_B
case class CC_F(a: T_A[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,CC_C()), CC_A(), _) => 0 
  case CC_F(CC_A()) => 1 
}
}
// This is not matched: CC_E(_, _)