package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_B], b: T_A[T_B], c: (T_A[T_B],T_A[T_B])) extends T_A[T_A[Int]]
case class CC_C() extends T_A[T_A[Int]]
case class CC_D(a: CC_B, b: Boolean) extends T_B
case class CC_E(a: (CC_A,CC_A)) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, _), true) => 0 
  case CC_D(CC_B(_, _, _), false) => 1 
  case CC_E((CC_A(),CC_A())) => 2 
  case CC_F() => 3 
}
}