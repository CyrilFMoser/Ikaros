package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[D, E]
case class CC_B[G, F](a: Char, b: CC_A[G, F]) extends T_A[G, F]
case class CC_C[H](a: H, b: T_A[H, H]) extends T_A[(CC_A[Char, Int],T_A[(Byte,Char), Int]), H]
case class CC_D(a: T_A[Char, T_A[Boolean, Boolean]], b: Boolean) extends T_B[CC_A[T_A[Int, Boolean], CC_B[Byte, Int]]]
case class CC_E(a: T_B[Char], b: T_A[Byte, CC_B[CC_D, CC_D]]) extends T_B[CC_A[T_A[Int, Boolean], CC_B[Byte, Int]]]
case class CC_F(a: T_A[CC_B[CC_D, CC_E], CC_C[CC_E]], b: T_A[CC_B[(Int,Int), CC_D], CC_B[CC_D, Int]], c: CC_C[T_B[CC_E]]) extends T_B[CC_A[T_A[Int, Boolean], CC_B[Byte, Int]]]

val v_a: T_B[CC_A[T_A[Int, Boolean], CC_B[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
  case CC_D(CC_B(_, _), _) => 1 
  case CC_E(_, _) => 2 
  case CC_F(CC_A(), _, CC_C(_, CC_A())) => 3 
  case CC_F(CC_B(_, _), _, CC_C(_, CC_A())) => 4 
  case CC_F(CC_B(_, _), _, CC_C(_, CC_B(_, _))) => 5 
}
}
// This is not matched: CC_F(CC_A(), _, CC_C(_, CC_B(_, _)))