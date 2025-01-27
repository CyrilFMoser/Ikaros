package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: Char) extends T_A[T_A[(Char,T_B)]]
case class CC_B(a: Int, b: T_A[(Boolean,T_B)], c: CC_A) extends T_A[T_A[(Char,T_B)]]
case class CC_C() extends T_A[T_A[(Char,T_B)]]
case class CC_D(a: Int) extends T_B
case class CC_E(a: (T_B,CC_D), b: CC_A, c: Boolean) extends T_B

val v_a: T_A[T_A[(Char,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)