package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: Byte, b: Byte) extends T_A[(CC_A[Boolean],T_A[Boolean, Char]), T_A[(CC_A[Boolean],T_A[Boolean, Char]), (CC_A[Boolean],T_A[Boolean, Char])]]
case class CC_C(a: CC_B, b: T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], c: T_A[Char, Byte]) extends T_A[(CC_A[Boolean],T_A[Boolean, Char]), T_A[(CC_A[Boolean],T_A[Boolean, Char]), (CC_A[Boolean],T_A[Boolean, Char])]]

val v_a: T_A[(CC_A[Boolean],T_A[Boolean, Char]), T_A[(CC_A[Boolean],T_A[Boolean, Char]), (CC_A[Boolean],T_A[Boolean, Char])]] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(CC_A(_)), _) => 2 
}
}