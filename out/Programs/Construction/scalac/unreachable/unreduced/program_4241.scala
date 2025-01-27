package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Int, Byte],Char)) extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_A[T_B[F, F], F], b: T_A[F, F], c: CC_A[F]) extends T_A[Int, CC_A[CC_A[Int]]]
case class CC_C[G]() extends T_A[T_B[G, G], G]
case class CC_D() extends T_B[Char, Byte]
case class CC_E(a: T_A[T_B[T_B[CC_D, CC_D], T_B[CC_D, CC_D]], T_B[CC_D, CC_D]], b: T_B[Char, Byte]) extends T_B[Char, Byte]
case class CC_F(a: CC_B[CC_E]) extends T_B[Char, Byte]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_E(CC_A((_,_)), CC_D()) => 0 
  case CC_E(CC_C(), CC_D()) => 1 
  case CC_E(CC_A((_,_)), CC_E(_, _)) => 2 
  case CC_E(CC_C(), CC_E(_, _)) => 3 
  case CC_E(CC_A((_,_)), CC_F(CC_B(_, _, _))) => 4 
  case CC_E(CC_C(), CC_F(CC_B(_, _, _))) => 5 
  case CC_F(_) => 6 
}
}
// This is not matched: CC_D()