package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Byte,Int), b: T_A[D], c: T_A[(Byte,Byte)]) extends T_A[T_B[Char, (Int,(Byte,Boolean))]]
case class CC_B(a: T_B[Boolean, T_A[Byte]], b: CC_A[(Byte,Char)]) extends T_A[T_B[Char, (Int,(Byte,Boolean))]]
case class CC_C(a: T_B[CC_B, T_A[CC_B]], b: CC_A[T_B[Int, CC_B]]) extends T_A[T_B[Char, (Int,(Byte,Boolean))]]
case class CC_D[F, E](a: E) extends T_B[F, E]
case class CC_E(a: T_A[CC_A[(Int,Boolean)]], b: CC_D[Int, T_B[CC_B, CC_C]]) extends T_B[T_B[CC_B, Int], CC_C]
case class CC_F(a: CC_B, b: CC_D[CC_E, CC_D[CC_B, CC_C]], c: CC_E) extends T_B[CC_B, CC_A[Int]]

val v_a: T_A[T_B[Char, (Int,(Byte,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A((_,_), _, _)) => 2 
}
}