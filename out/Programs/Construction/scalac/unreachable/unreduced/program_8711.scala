package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: T_A[E, F]) extends T_A[F, E]
case class CC_B[G](a: T_A[G, T_B[G, G]]) extends T_A[CC_A[T_A[Byte, Boolean], T_A[Boolean, Int]], G]
case class CC_C(a: T_A[Byte, Boolean], b: T_B[CC_B[Int], T_B[(Char,Boolean), Boolean]]) extends T_A[CC_A[T_A[Byte, Boolean], T_A[Boolean, Int]], CC_B[Byte]]
case class CC_D[H](a: CC_C) extends T_B[H, CC_B[CC_B[CC_C]]]
case class CC_E() extends T_B[T_B[T_B[CC_C, CC_C], CC_B[(Char,Byte)]], CC_B[CC_B[CC_C]]]

val v_a: T_A[CC_A[T_A[Byte, Boolean], T_A[Boolean, Int]], T_A[CC_A[T_A[Byte, Boolean], T_A[Boolean, Int]], CC_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_B(CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_C(CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_B(_))) => 3 
  case CC_A(CC_B(CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_))) => 4 
  case CC_A(CC_C(CC_A(_, _), _), CC_A(CC_A(_, _), CC_B(_))) => 5 
  case CC_B(CC_A(_, _)) => 6 
}
}