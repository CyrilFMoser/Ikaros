package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[T_A[Byte, Boolean]], D]
case class CC_B[E](a: T_B[E]) extends T_A[T_B[T_A[Byte, Boolean]], E]
case class CC_C[F](a: F, b: CC_A[F], c: (T_A[Boolean, Boolean],Boolean)) extends T_A[T_B[T_A[Byte, Boolean]], F]
case class CC_D[G]() extends T_B[G]
case class CC_E[H, I](a: CC_C[I], b: CC_A[H], c: Byte) extends T_B[H]
case class CC_F[J](a: J, b: T_B[J], c: Int) extends T_B[J]

val v_a: T_A[T_B[T_A[Byte, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_D()) => 1 
  case CC_B(CC_E(_, _, _)) => 2 
  case CC_B(CC_F(_, _, _)) => 3 
  case CC_C(_, _, (_,_)) => 4 
}
}