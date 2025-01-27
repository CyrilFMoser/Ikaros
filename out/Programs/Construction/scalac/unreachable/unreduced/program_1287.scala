package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B) extends T_A[T_A[(Byte,Char)]]
case class CC_B(a: CC_A[Byte]) extends T_A[T_A[(Byte,Char)]]
case class CC_C(a: CC_B) extends T_A[T_A[(Byte,Char)]]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_C(CC_B(_)) => 2 
}
}