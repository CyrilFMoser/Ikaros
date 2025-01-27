package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Char], (Byte,Byte)], (Boolean,T_A[Byte, (Char,Int)])]
case class CC_B(a: T_A[CC_A, Int]) extends T_A[T_A[T_A[Char, Char], (Byte,Byte)], (Boolean,T_A[Byte, (Char,Int)])]
case class CC_C() extends T_A[T_A[T_A[Char, Char], (Byte,Byte)], (Boolean,T_A[Byte, (Char,Int)])]

val v_a: T_A[T_A[T_A[Char, Char], (Byte,Byte)], (Boolean,T_A[Byte, (Char,Int)])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}