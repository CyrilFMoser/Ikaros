package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[(Byte,Char)]]
case class CC_B() extends T_A[T_A[(Byte,Char)]]
case class CC_C() extends T_A[CC_B]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}