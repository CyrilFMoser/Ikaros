package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: T_B, b: CC_B) extends T_B
case class CC_E(a: T_A[T_A[CC_A]], b: (CC_D,CC_D), c: Boolean) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}