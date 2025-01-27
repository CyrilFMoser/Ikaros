package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: T_A[D, E], c: T_A[E, D]) extends T_A[D, E]
case class CC_B[G, F](a: F, b: T_A[G, G]) extends T_A[F, G]
case class CC_C[H](a: T_A[T_A[H, H], H]) extends T_A[T_A[H, H], H]
case class CC_D(a: T_B[T_B[(Boolean,Boolean)]], b: T_A[T_A[Int, Int], Int]) extends T_B[(CC_A[Int, Char],Byte)]
case class CC_E() extends T_B[(CC_A[Int, Char],Byte)]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _, CC_A(_, _, _))) => 2 
  case CC_C(CC_A(_, _, CC_B(_, _))) => 3 
  case CC_C(CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_C(CC_B(CC_A(_, _, _), CC_B(_, _))) => 5 
  case CC_C(CC_B(CC_B(_, _), CC_A(_, _, _))) => 6 
  case CC_C(CC_C(CC_A(_, _, _))) => 7 
  case CC_C(CC_C(CC_B(_, _))) => 8 
  case CC_C(CC_C(CC_C(_))) => 9 
}
}
// This is not matched: CC_C(CC_B(CC_B(_, _), CC_B(_, _)))