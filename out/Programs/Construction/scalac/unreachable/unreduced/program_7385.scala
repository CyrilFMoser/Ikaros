package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[Boolean]) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: CC_B) extends T_A[T_B]
case class CC_D(a: T_A[T_A[CC_B]], b: T_A[(CC_B,CC_A)], c: T_A[T_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C(CC_B(_))) => 0 
  case CC_E() => 1 
}
}