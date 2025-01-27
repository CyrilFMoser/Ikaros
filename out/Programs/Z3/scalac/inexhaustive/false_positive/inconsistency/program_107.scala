package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: ((Byte,Char),Char)) extends T_A[T_A[(Byte,Boolean)]]

val v_a: T_A[T_A[(Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((0,_),_)) => 0 
}
}
// This is not matched: (CC_F Wildcard T_B)