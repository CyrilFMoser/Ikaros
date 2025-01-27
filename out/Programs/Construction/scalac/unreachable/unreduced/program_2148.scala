package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Char,Char)]]
case class CC_B(a: Int, b: CC_A, c: T_A[T_A[(Byte,Byte)]]) extends T_A[T_A[(Char,Char)]]
case class CC_C(a: CC_B, b: Int) extends T_A[T_A[(Char,Char)]]

val v_a: T_A[T_A[(Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(_, _, _), _) => 2 
}
}