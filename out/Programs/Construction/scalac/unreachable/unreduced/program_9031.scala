package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B(a: T_B[CC_A[Char]]) extends T_A[T_A[T_B[Byte], Int], T_B[T_B[Byte]]]
case class CC_C[E](a: T_B[E], b: T_A[E, E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: T_A[T_A[T_B[Byte], Int], T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(CC_C(_, _), _)) => 0 
  case CC_B(CC_C(CC_D(), _)) => 1 
  case CC_B(CC_D()) => 2 
}
}
// This is not matched: CC_A(_)