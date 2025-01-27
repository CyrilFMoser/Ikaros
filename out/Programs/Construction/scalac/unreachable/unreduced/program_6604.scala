package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_B, b: T_B, c: CC_A) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_A[T_B], b: CC_A, c: CC_A) extends T_A[T_A[T_A[T_B]]]
case class CC_D() extends T_B
case class CC_E(a: T_A[Boolean], b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_A()) => 1 
}
}