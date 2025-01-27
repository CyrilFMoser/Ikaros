package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: (Int,Char)) extends T_A[T_A[(Byte,Byte)]]

val v_a: T_A[T_A[(Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)