package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: (T_B,T_A[(Byte,Int)]), c: Char) extends T_A[T_A[(T_B,T_B)]]
case class CC_B(a: T_B, b: CC_A, c: CC_A) extends T_A[T_A[(T_B,T_B)]]

val v_a: T_A[T_A[(T_B,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
}
}