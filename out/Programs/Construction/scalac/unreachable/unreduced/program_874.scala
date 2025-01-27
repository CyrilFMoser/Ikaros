package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean) extends T_A[(((Boolean,Byte),Char),T_A[Char, Char]), T_A[(Byte,Int), T_A[Boolean, (Boolean,Byte)]]]
case class CC_B(a: T_A[T_A[(Char,Char), CC_A], CC_A]) extends T_A[(((Boolean,Byte),Char),T_A[Char, Char]), T_A[(Byte,Int), T_A[Boolean, (Boolean,Byte)]]]
case class CC_C(a: CC_B, b: CC_B, c: Char) extends T_A[(((Boolean,Byte),Char),T_A[Char, Char]), T_A[(Byte,Int), T_A[Boolean, (Boolean,Byte)]]]

val v_a: T_A[(((Boolean,Byte),Char),T_A[Char, Char]), T_A[(Byte,Int), T_A[Boolean, (Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_B(_), CC_B(_), _) => 3 
}
}