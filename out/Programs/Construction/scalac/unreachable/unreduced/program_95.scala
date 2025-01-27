package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_B[Boolean]]) extends T_A[(T_A[Byte],T_B[Boolean])]
case class CC_B(a: CC_A, b: CC_A) extends T_B[T_B[(Boolean,CC_A)]]
case class CC_C() extends T_B[T_B[(Boolean,CC_A)]]
case class CC_D(a: CC_B, b: CC_A, c: T_A[CC_B]) extends T_B[T_B[(Boolean,CC_A)]]

val v_a: T_B[T_B[(Boolean,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C() => 1 
  case CC_D(_, _, _) => 2 
}
}