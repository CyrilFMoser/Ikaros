package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[(Char,Boolean)]]) extends T_A[T_B[(Byte,Char)]]
case class CC_B(a: CC_A, b: T_A[T_B[CC_A]]) extends T_A[T_B[(Byte,Char)]]
case class CC_C(a: T_B[(Char,CC_A)], b: Char) extends T_A[T_B[(Byte,Char)]]

val v_a: T_A[T_B[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, 'x') => 2 
  case CC_C(_, _) => 3 
}
}