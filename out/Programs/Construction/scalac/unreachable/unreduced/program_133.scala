package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F], b: F) extends T_A[F, E]
case class CC_B[H, G](a: CC_A[H, (Int,Int)], b: T_B[CC_A[H, G], H], c: G) extends T_A[H, G]
case class CC_C[J, I](a: T_A[CC_A[J, J], I], b: I, c: J) extends T_A[J, I]
case class CC_D(a: (T_A[Int, (Int,Boolean)],T_A[Boolean, Byte]), b: T_A[CC_B[(Boolean,Byte), Boolean], CC_A[Byte, Boolean]]) extends T_B[CC_C[CC_B[Char, Byte], T_A[Byte, Char]], CC_C[T_A[Byte, Char], T_B[Char, Byte]]]
case class CC_E(a: CC_B[T_A[CC_D, CC_D], T_A[Boolean, CC_D]]) extends T_B[CC_C[CC_B[Char, Byte], T_A[Byte, Char]], CC_C[T_A[Byte, Char], T_B[Char, Byte]]]
case class CC_F(a: T_A[CC_D, T_A[CC_D, Int]]) extends T_B[CC_C[CC_B[Char, Byte], T_A[Byte, Char]], CC_C[T_A[Byte, Char], T_B[Char, Byte]]]

val v_a: T_A[CC_F, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_F(_)) => 0 
  case CC_A(CC_B(_, _, _), CC_F(_)) => 1 
  case CC_A(CC_C(_, _, _), CC_F(_)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(CC_A(_, _), CC_D(_, _), _) => 4 
  case CC_C(CC_B(_, _, _), CC_D(_, _), _) => 5 
  case CC_C(CC_C(_, _, _), CC_D(_, _), _) => 6 
}
}