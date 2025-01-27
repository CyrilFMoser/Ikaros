package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, T_B[E]], b: T_A[D, D]) extends T_A[D, E]
case class CC_B[F, G](a: T_A[G, G], b: Boolean) extends T_A[F, G]
case class CC_C[I, H](a: H, b: T_B[I]) extends T_A[H, I]
case class CC_D(a: Char, b: T_A[T_A[Int, Int], T_A[Boolean, Int]]) extends T_B[((Byte,Int),(Boolean,Int))]
case class CC_E() extends T_B[((Byte,Int),(Boolean,Int))]

val v_a: T_A[Char, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_B(_, _), CC_A(_, _)) => 1 
  case CC_A(CC_C(_, _), CC_A(_, _)) => 2 
  case CC_A(CC_A(_, _), CC_B(_, _)) => 3 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 4 
  case CC_A(CC_C(_, _), CC_B(_, _)) => 5 
  case CC_A(CC_A(_, _), CC_C(_, _)) => 6 
  case CC_A(CC_B(_, _), CC_C(_, _)) => 7 
  case CC_A(CC_C(_, _), CC_C(_, _)) => 8 
  case CC_B(CC_A(_, _), _) => 9 
  case CC_B(CC_B(_, _), _) => 10 
  case CC_B(CC_C(_, _), _) => 11 
  case CC_C('x', _) => 12 
  case CC_C(_, _) => 13 
}
}