package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: T_A[C, C]) extends T_A[T_B, C]
case class CC_B() extends T_A[T_B, T_A[(T_B,T_B), CC_A[T_B]]]
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: T_B, b: T_A[CC_C, T_A[T_B, Boolean]], c: CC_A[(Char,CC_C)]) extends T_B

val v_a: T_A[T_B, T_A[(T_B,T_B), CC_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}