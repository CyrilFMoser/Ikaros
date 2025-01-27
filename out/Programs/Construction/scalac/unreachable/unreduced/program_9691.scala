package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Int)], b: T_A[T_A[Boolean]], c: T_A[(Byte,Int)]) extends T_A[T_A[((Byte,Byte),Char)]]
case class CC_B() extends T_A[T_A[((Byte,Byte),Char)]]

val v_a: T_A[T_A[((Byte,Byte),Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}