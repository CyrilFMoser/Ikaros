package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Byte, Boolean],T_A[(Int,Boolean)]), b: T_B[T_B[Boolean, Int], T_A[Boolean]]) extends T_A[(T_A[Char],(Byte,Char))]
case class CC_B(a: CC_A) extends T_A[(T_A[Char],(Byte,Char))]
case class CC_C[D]() extends T_A[D]
case class CC_D(a: T_A[T_B[CC_B, CC_B]]) extends T_B[T_A[Byte], CC_B]
case class CC_E(a: T_A[CC_D], b: CC_C[((Char,Boolean),CC_A)]) extends T_B[T_A[Byte], CC_B]
case class CC_F(a: CC_A, b: ((Char,CC_D),T_B[CC_B, CC_B]), c: Char) extends T_B[T_A[Byte], CC_B]

val v_a: T_B[T_A[Byte], CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
  case CC_E(_, _) => 1 
  case CC_F(_, ((_,_),_), _) => 2 
}
}