package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: Char) extends T_A[T_A[T_A[Byte, Byte], T_A[Boolean, (Byte,Int)]], (T_A[Boolean, Int],Byte)]
case class CC_B(a: (T_A[CC_A, CC_A],T_A[CC_A, CC_A]), b: T_A[CC_A, T_A[Byte, CC_A]]) extends T_A[T_A[T_A[Byte, Byte], T_A[Boolean, (Byte,Int)]], (T_A[Boolean, Int],Byte)]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Boolean, (Byte,Int)]], (T_A[Boolean, Int],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}