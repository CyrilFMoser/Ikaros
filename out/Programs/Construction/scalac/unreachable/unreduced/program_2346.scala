package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: Byte, c: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[T_A[Boolean]]) extends T_B[T_A[(Char,Byte)]]
case class CC_C() extends T_B[T_A[(Char,Byte)]]
case class CC_D(a: Int) extends T_B[T_A[(Char,Byte)]]

val v_a: T_B[T_A[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}