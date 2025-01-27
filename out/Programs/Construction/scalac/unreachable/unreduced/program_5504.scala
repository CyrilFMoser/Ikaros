package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_A[Int, Int], T_B[Int, Int]], b: T_A[T_A[Char, Int], Boolean], c: T_A[T_A[Boolean, Char], T_B[(Int,Boolean), Int]]) extends T_A[(Char,T_A[Byte, (Boolean,Char)]), T_B[Byte, T_B[Byte, Boolean]]]
case class CC_B(a: CC_A, b: Byte, c: Boolean) extends T_A[(Char,T_A[Byte, (Boolean,Char)]), T_B[Byte, T_B[Byte, Boolean]]]
case class CC_C[E, F](a: T_B[F, F], b: T_A[F, F]) extends T_B[E, F]
case class CC_D[G, H](a: G, b: T_A[CC_C[G, CC_A], H]) extends T_B[H, G]
case class CC_E[I]() extends T_B[Int, I]

val v_a: T_B[Int, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _), _), _) => 0 
  case CC_C(CC_C(CC_D(_, _), _), _) => 1 
  case CC_C(CC_D(_, _), _) => 2 
  case CC_D(CC_B(_, 0, _), _) => 3 
  case CC_D(CC_B(_, _, _), _) => 4 
  case CC_E() => 5 
}
}