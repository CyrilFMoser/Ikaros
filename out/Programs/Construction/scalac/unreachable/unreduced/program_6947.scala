package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_B[E, (Boolean,Int)]) extends T_A[T_B[T_A[Byte, Char], T_A[Byte, Boolean]], E]
case class CC_B[F](a: F, b: CC_A[F], c: CC_A[F]) extends T_A[T_B[T_A[Byte, Char], T_A[Byte, Boolean]], F]
case class CC_C[H, G](a: T_A[H, H]) extends T_B[H, G]
case class CC_D[J, I](a: T_B[J, I], b: I) extends T_B[I, J]
case class CC_E[K, L](a: Boolean, b: Int, c: L) extends T_B[K, L]

val v_a: T_A[T_B[T_A[Byte, Char], T_A[Byte, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_)) => 0 
  case CC_A(_, _, CC_D(CC_C(_), _)) => 1 
  case CC_A(_, _, CC_D(CC_D(_, _), _)) => 2 
  case CC_A(_, _, CC_D(CC_E(_, _, _), _)) => 3 
  case CC_A(_, _, CC_E(_, _, (_,_))) => 4 
  case CC_B(_, _, _) => 5 
}
}