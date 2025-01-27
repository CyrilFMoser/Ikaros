package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E], b: T_A[E]) extends T_A[D]
case class CC_B[F](a: F, b: Boolean, c: CC_A[F, F]) extends T_A[F]
case class CC_C[G](a: (CC_A[Byte, Char],T_A[Char]), b: T_B[G, G], c: Int) extends T_A[G]
case class CC_D[H]() extends T_B[Boolean, H]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 1 
  case CC_A(CC_C(_, _, _), CC_A(_, _)) => 2 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 3 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 4 
  case CC_A(CC_C(_, _, _), CC_B(_, _, _)) => 5 
  case CC_A(CC_B(_, _, _), CC_C(_, _, _)) => 6 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _)) => 7 
}
}
// This is not matched: CC_A(CC_A(_, _), CC_C(_, _, _))