package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Byte,Char)]]
case class CC_B(a: T_A[CC_A], b: Boolean) extends T_A[T_A[(Byte,Char)]]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}