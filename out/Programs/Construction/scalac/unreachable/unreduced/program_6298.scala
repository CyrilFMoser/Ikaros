package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_A[E, E]) extends T_A[T_B[Boolean, T_B[Boolean, Boolean]], E]
case class CC_B(a: CC_A[CC_A[Char]], b: T_B[(Int,Boolean), T_B[Byte, Int]]) extends T_A[T_B[Boolean, T_B[Boolean, Boolean]], T_A[(Char,Byte), (Byte,Char)]]
case class CC_C() extends T_A[T_B[Boolean, T_B[Boolean, Boolean]], T_A[(Char,Byte), (Byte,Char)]]
case class CC_D[F](a: T_B[CC_B, F], b: T_B[CC_B, F]) extends T_B[CC_B, F]
case class CC_E(a: CC_A[(CC_C,CC_B)]) extends T_B[CC_B, CC_D[T_B[Byte, Boolean]]]

val v_a: T_B[CC_B, CC_D[T_B[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_, _), CC_D(_, _)), CC_D(_, _)) => 0 
  case CC_D(CC_D(CC_D(_, _), CC_D(_, _)), CC_E(CC_A(_, _, _))) => 1 
  case CC_D(CC_D(CC_D(_, _), CC_E(_)), CC_E(CC_A(_, _, _))) => 2 
  case CC_D(CC_D(CC_E(_), CC_D(_, _)), CC_D(_, _)) => 3 
  case CC_D(CC_D(CC_E(_), CC_D(_, _)), CC_E(CC_A(_, _, _))) => 4 
  case CC_D(CC_D(CC_E(_), CC_E(_)), CC_D(_, _)) => 5 
  case CC_D(CC_D(CC_E(_), CC_E(_)), CC_E(CC_A(_, _, _))) => 6 
  case CC_D(CC_E(_), CC_D(_, _)) => 7 
  case CC_D(CC_E(_), CC_E(CC_A(_, _, _))) => 8 
  case CC_E(CC_A(_, _, _)) => 9 
}
}
// This is not matched: CC_D(CC_D(CC_D(_, _), CC_E(_)), CC_D(_, _))