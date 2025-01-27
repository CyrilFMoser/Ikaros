package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Byte,Char)]]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[T_A[(Byte,Char)]]
case class CC_C[B](a: B, b: CC_B) extends T_A[T_A[(Byte,Char)]]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_C(_, _) => 2 
}
}