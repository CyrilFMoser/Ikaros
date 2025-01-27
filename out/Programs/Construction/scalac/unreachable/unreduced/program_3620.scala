package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte) extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_B(a: T_B[T_A[CC_A], T_A[CC_A]], b: T_B[CC_A, Byte], c: T_A[CC_A]) extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_C[D](a: CC_B, b: T_A[D]) extends T_B[D, T_B[D, D]]
case class CC_D[E](a: (Char,CC_B), b: CC_C[E], c: (CC_B,((Boolean,Char),CC_B))) extends T_B[E, T_B[E, E]]
case class CC_E[F](a: T_B[F, T_B[F, F]]) extends T_B[F, T_B[F, F]]

val v_a: T_B[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _) => 0 
  case CC_D(_, CC_C(_, _), _) => 1 
  case CC_E(CC_C(CC_B(_, _, _), _)) => 2 
  case CC_E(CC_D(_, _, _)) => 3 
  case CC_E(CC_E(CC_C(_, _))) => 4 
  case CC_E(CC_E(CC_D(_, _, _))) => 5 
  case CC_E(CC_E(CC_E(_))) => 6 
}
}