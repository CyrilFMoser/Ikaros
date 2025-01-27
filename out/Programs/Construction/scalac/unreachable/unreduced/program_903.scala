package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[((Char,Byte),Byte)]
case class CC_B(a: T_A[CC_A], b: T_A[T_A[CC_A]]) extends T_A[((Char,Byte),Byte)]
case class CC_C(a: CC_A, b: CC_B, c: Byte) extends T_A[((Char,Byte),Byte)]

val v_a: T_A[((Char,Byte),Byte)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}