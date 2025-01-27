package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_A[Byte, Int],T_A[Int, Boolean]), b: T_A[Char, Char], c: T_A[(Boolean,Int), Int]) extends T_A[(T_A[Byte, (Char,Int)],Byte), T_B[Int, T_A[Byte, Byte]]]
case class CC_B(a: T_A[CC_A, Boolean], b: Boolean, c: T_B[CC_A, T_B[(Boolean,Boolean), CC_A]]) extends T_A[(T_A[Byte, (Char,Int)],Byte), T_B[Int, T_A[Byte, Byte]]]
case class CC_C(a: T_B[T_A[(Int,Int), CC_B], CC_B]) extends T_A[(T_A[Byte, (Char,Int)],Byte), T_B[Int, T_A[Byte, Byte]]]
case class CC_D[E, F](a: T_A[F, F], b: CC_C) extends T_B[E, F]
case class CC_E[G, H](a: H, b: T_B[G, G], c: Boolean) extends T_B[G, H]
case class CC_F[J, I]() extends T_B[I, J]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(CC_D(_, _))) => 0 
  case CC_D(_, CC_C(CC_E(_, _, _))) => 1 
  case CC_D(_, CC_C(CC_F())) => 2 
  case CC_E(0, CC_D(_, CC_C(_)), _) => 3 
  case CC_E(_, CC_D(_, CC_C(_)), _) => 4 
  case CC_E(0, CC_E(_, _, _), _) => 5 
  case CC_E(_, CC_E(_, _, _), _) => 6 
  case CC_E(0, CC_F(), _) => 7 
  case CC_E(_, CC_F(), _) => 8 
  case CC_F() => 9 
}
}