package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Int,Int), T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_B[(T_A,CC_A), T_B[CC_B, Char]], c: T_B[CC_A, CC_B]) extends T_A
case class CC_D[C](a: CC_C, b: ((CC_A,T_A),((Byte,Char),Char))) extends T_B[C, Byte]
case class CC_E[D](a: D, b: D) extends T_B[T_A, Byte]
case class CC_F(a: T_B[CC_D[CC_B], CC_E[T_A]]) extends T_B[CC_A, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), _, _) => 2 
}
}