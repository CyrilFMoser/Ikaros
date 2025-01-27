package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[(Byte,Char)]]]
case class CC_B() extends T_A[T_A[T_B[(Byte,Char)]]]
case class CC_C(a: CC_B, b: Byte, c: T_B[CC_A]) extends T_A[T_A[T_B[(Byte,Char)]]]
case class CC_D[C](a: C, b: C, c: CC_A) extends T_B[C]
case class CC_E[D](a: CC_B) extends T_B[Char]
case class CC_F(a: CC_C, b: T_A[CC_E[(Byte,Char)]], c: CC_C) extends T_B[T_B[CC_D[CC_A]]]

val v_a: T_B[T_B[CC_D[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), CC_D(_, _, _), _) => 0 
  case CC_F(_, _, _) => 1 
}
}