package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Int, Char], (Boolean,Int)]) extends T_A[T_B[T_B[Int, Byte], Byte], T_B[T_A[Char, Char], T_B[Byte, Char]]]
case class CC_B() extends T_A[T_B[T_B[Int, Byte], Byte], T_B[T_A[Char, Char], T_B[Byte, Char]]]
case class CC_C(a: (T_A[Int, CC_B],Char)) extends T_A[T_B[T_B[Int, Byte], Byte], T_B[T_A[Char, Char], T_B[Byte, Char]]]
case class CC_D[F, E](a: F, b: T_A[(Int,CC_B), F]) extends T_B[F, E]
case class CC_E[H, G](a: T_B[G, G]) extends T_B[H, G]
case class CC_F[J, I]() extends T_B[I, J]

val v_a: T_A[T_B[T_B[Int, Byte], Byte], T_B[T_A[Char, Char], T_B[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _)) => 0 
  case CC_A(CC_F()) => 1 
  case CC_B() => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A(CC_E(_))