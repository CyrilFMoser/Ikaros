package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_B[T_A[Char, Int]]]
case class CC_B[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[E, T_B[T_A[Char, Int]]]
case class CC_C[F](a: T_B[F]) extends T_A[F, T_B[T_A[Char, Int]]]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: Boolean, b: CC_A[H], c: H) extends T_B[H]
case class CC_F(a: T_B[T_A[Byte, Int]], b: (CC_C[Byte],CC_C[Char])) extends T_B[Char]

val v_a: T_A[Char, T_B[T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_A(CC_E(_, CC_A(_), _)) => 1 
  case CC_A(CC_F(CC_D(), (_,_))) => 2 
  case CC_A(CC_F(CC_E(_, _, _), (_,_))) => 3 
  case CC_B(_, _) => 4 
  case CC_C(CC_D()) => 5 
  case CC_C(CC_E(_, _, _)) => 6 
  case CC_C(CC_F(CC_D(), (_,_))) => 7 
  case CC_C(CC_F(CC_E(_, _, _), (_,_))) => 8 
}
}