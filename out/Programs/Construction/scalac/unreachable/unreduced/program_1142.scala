package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char) extends T_A[Boolean, T_A[T_A[Boolean, Int], ((Byte,Char),Byte)]]
case class CC_B(a: T_A[CC_A, Boolean]) extends T_A[Boolean, T_A[T_A[Boolean, Int], ((Byte,Char),Byte)]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Int], ((Byte,Char),Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}