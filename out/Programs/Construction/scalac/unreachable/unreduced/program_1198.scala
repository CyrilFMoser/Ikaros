package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_B), b: (T_A[T_B],Char)) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_A[(Byte,CC_A)]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}