package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, (T_A[Boolean, Int],T_A[Byte, (Byte,Byte)])]
case class CC_B(a: T_A[T_A[Byte, Byte], Boolean]) extends T_A[CC_A[CC_A[(Byte,Int)]], (T_A[Boolean, Int],T_A[Byte, (Byte,Byte)])]
case class CC_C[D](a: CC_A[CC_B], b: Int) extends T_A[D, (T_A[Boolean, Int],T_A[Byte, (Byte,Byte)])]

val v_a: T_A[CC_A[CC_A[(Byte,Int)]], (T_A[Boolean, Int],T_A[Byte, (Byte,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _) => 3 
}
}