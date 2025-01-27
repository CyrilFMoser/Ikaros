package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[(Char,Boolean)]], b: T_A[T_A[Char]]) extends T_A[T_A[T_B[Char]]]
case class CC_B(a: Byte) extends T_A[T_A[T_B[Char]]]
case class CC_C(a: CC_B, b: ((Int,Byte),CC_A), c: T_B[Byte]) extends T_A[T_A[T_B[Char]]]
case class CC_D[C]() extends T_B[C]
case class CC_E() extends T_B[T_B[CC_C]]
case class CC_F(a: CC_C, b: CC_A) extends T_B[T_B[CC_C]]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(0) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_C(_, ((_,_),CC_A(_, _)), CC_D())