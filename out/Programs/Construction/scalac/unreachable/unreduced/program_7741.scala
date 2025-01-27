package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_A[CC_A]
case class CC_D(a: T_A[CC_A], b: T_A[CC_A], c: CC_C) extends T_B
case class CC_E(a: CC_B, b: T_A[Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(), _, CC_C()) => 0 
  case CC_E(CC_B(), _) => 1 
}
}