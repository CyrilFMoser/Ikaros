package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[Byte, T_A]]) extends T_A
case class CC_B(a: T_B[Boolean, T_A]) extends T_A
case class CC_C(a: ((CC_B,(Int,Char)),CC_A)) extends T_A
case class CC_D[C](a: T_A, b: T_A) extends T_B[Boolean, C]
case class CC_E[D](a: (T_A,T_B[Byte, CC_B]), b: Int) extends T_B[CC_B, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_D(_, _)) => 1 
}
}
// This is not matched: CC_C((_,_))