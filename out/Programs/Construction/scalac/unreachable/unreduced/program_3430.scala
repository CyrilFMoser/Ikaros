package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C(a: T_A[CC_A], b: T_A[(Char,CC_A)]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D() => 2 
}
}