package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: Byte, c: (T_A[Char],T_A[Byte])) extends T_A[((Char,Byte),T_A[Byte])]
case class CC_B(a: T_A[T_A[CC_A]], b: Boolean, c: CC_A) extends T_A[((Char,Byte),T_A[Byte])]
case class CC_C() extends T_A[((Char,Byte),T_A[Byte])]

val v_a: T_A[((Char,Byte),T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, true, _) => 1 
  case CC_B(_, false, _) => 2 
}
}
// This is not matched: CC_C()