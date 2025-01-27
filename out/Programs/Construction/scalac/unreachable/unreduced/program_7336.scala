package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],T_A), b: (T_B[T_A, Boolean],(T_A,T_A)), c: Char) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[T_A, T_A], (T_A,CC_A)]) extends T_A
case class CC_C(a: CC_B, b: CC_A, c: T_B[CC_B, T_A]) extends T_A
case class CC_D[C](a: T_A) extends T_B[Byte, C]
case class CC_E(a: (CC_D[Byte],CC_D[Char]), b: (T_B[T_A, (Int,Char)],T_A), c: CC_B) extends T_B[Byte, T_B[CC_A, (CC_B,CC_A)]]
case class CC_F(a: (Char,CC_E), b: (Char,CC_A)) extends T_B[Byte, T_B[CC_A, (CC_B,CC_A)]]

val v_a: T_B[Byte, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_D(CC_C(CC_B(_, _), _, _)) => 2 
}
}