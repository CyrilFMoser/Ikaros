package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: Int, b: CC_A[E]) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_C[F](a: T_B[F], b: Byte) extends T_B[F]
case class CC_D[G](a: Char, b: T_B[G], c: T_B[G]) extends T_B[G]
case class CC_E[H](a: T_A[H, H], b: T_A[H, H], c: Boolean) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), _) => 0 
  case CC_C(CC_D(_, CC_C(_, _), CC_C(_, _)), _) => 1 
  case CC_C(CC_D(_, CC_C(_, _), CC_D(_, _, _)), _) => 2 
  case CC_C(CC_D(_, CC_C(_, _), CC_E(_, _, _)), _) => 3 
  case CC_C(CC_D(_, CC_D(_, _, _), CC_C(_, _)), _) => 4 
  case CC_C(CC_D(_, CC_D(_, _, _), CC_D(_, _, _)), _) => 5 
  case CC_C(CC_D(_, CC_D(_, _, _), CC_E(_, _, _)), _) => 6 
  case CC_C(CC_D(_, CC_E(_, _, _), CC_C(_, _)), _) => 7 
  case CC_C(CC_D(_, CC_E(_, _, _), CC_D(_, _, _)), _) => 8 
  case CC_C(CC_D(_, CC_E(_, _, _), CC_E(_, _, _)), _) => 9 
  case CC_C(CC_E(_, _, _), _) => 10 
  case CC_D(_, CC_C(CC_C(_, _), _), _) => 11 
  case CC_D(_, CC_C(CC_D(_, _, _), _), _) => 12 
  case CC_D(_, CC_C(CC_E(_, _, _), _), _) => 13 
  case CC_D(_, CC_D(_, CC_C(_, _), _), _) => 14 
  case CC_D(_, CC_D(_, CC_D(_, _, _), _), _) => 15 
  case CC_D(_, CC_D(_, CC_E(_, _, _), _), _) => 16 
  case CC_D(_, CC_E(_, _, _), _) => 17 
  case CC_E(_, _, _) => 18 
}
}