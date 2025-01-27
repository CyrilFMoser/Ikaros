package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[(T_A[Byte, Byte],(Byte,(Char,Char))), C]
case class CC_B[D]() extends T_A[(T_A[Byte, Byte],(Byte,(Char,Char))), D]
case class CC_C(a: T_A[T_A[Char, Char], CC_B[(Byte,Byte)]], b: Byte) extends T_A[(T_A[Byte, Byte],(Byte,(Char,Char))), T_A[(Boolean,Boolean), T_A[Byte, (Boolean,Boolean)]]]

val v_a: T_A[(T_A[Byte, Byte],(Byte,(Char,Char))), T_A[(Boolean,Boolean), T_A[Byte, (Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, 0) => 2 
  case CC_C(_, _) => 3 
}
}