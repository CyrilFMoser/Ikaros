package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: CC_A[CC_A[Boolean]], b: Int) extends T_A[T_A[T_A[Byte]]]
case class CC_C[E, F]() extends T_A[E]
case class CC_D[G](a: Char, b: G, c: T_A[G]) extends T_B[G, CC_A[G]]
case class CC_E[H](a: (Int,(CC_B,(Int,Int))), b: T_B[H, CC_A[H]], c: CC_A[H]) extends T_B[H, CC_A[H]]
case class CC_F(a: T_A[((Byte,Boolean),CC_B)], b: T_B[T_A[CC_B], CC_D[CC_B]]) extends T_B[CC_D[Char], CC_A[CC_D[Char]]]

val v_a: T_B[CC_D[Char], CC_A[CC_D[Char]]] = null
val v_b: Int = v_a match{
  case CC_D('x', CC_D('x', _, CC_A()), _) => 0 
  case CC_D(_, CC_D('x', _, CC_A()), _) => 1 
  case CC_D('x', CC_D(_, _, CC_A()), _) => 2 
  case CC_D(_, CC_D(_, _, CC_A()), _) => 3 
  case CC_D('x', CC_D('x', _, CC_C()), _) => 4 
  case CC_D(_, CC_D('x', _, CC_C()), _) => 5 
  case CC_D('x', CC_D(_, _, CC_C()), _) => 6 
  case CC_D(_, CC_D(_, _, CC_C()), _) => 7 
  case CC_E(_, _, _) => 8 
  case CC_F(CC_A(), _) => 9 
  case CC_F(CC_C(), _) => 10 
}
}