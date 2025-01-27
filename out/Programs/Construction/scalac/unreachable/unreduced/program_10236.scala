package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, Byte]
case class CC_B[E](a: Int, b: CC_A[E]) extends T_A[E, Byte]
case class CC_C[F](a: F, b: T_A[F, Byte]) extends T_A[F, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
  case CC_C(_, CC_C(_, CC_A(_))) => 3 
  case CC_C(_, CC_C(_, CC_B(_, _))) => 4 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 5 
}
}
// This is not matched: CC_C(_, CC_A(_))