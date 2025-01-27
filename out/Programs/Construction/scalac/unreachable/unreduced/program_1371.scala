package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(T_A[Byte, (Byte,Char)],((Char,Boolean),(Int,Byte))), C]
case class CC_B[D]() extends T_A[(T_A[Byte, (Byte,Char)],((Char,Boolean),(Int,Byte))), D]
case class CC_C(a: T_A[T_A[Char, Byte], CC_B[Int]], b: CC_A[CC_B[Char]]) extends T_A[(T_A[Byte, (Byte,Char)],((Char,Boolean),(Int,Byte))), CC_A[(Char,(Byte,Boolean))]]

val v_a: T_A[(T_A[Byte, (Byte,Char)],((Char,Boolean),(Int,Byte))), CC_A[(Char,(Byte,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()