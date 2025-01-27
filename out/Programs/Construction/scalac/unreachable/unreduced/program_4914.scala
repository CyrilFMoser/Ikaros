package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_B[T_B[Int, Char], T_A[Char]]) extends T_A[T_B[T_B[Int, Byte], T_A[Byte]]]
case class CC_B(a: Boolean, b: T_A[CC_A]) extends T_A[T_B[T_B[Int, Byte], T_A[Byte]]]
case class CC_C[E, D](a: CC_A) extends T_B[D, E]
case class CC_D[F](a: T_B[T_A[T_B[CC_A, CC_A]], CC_A], b: T_A[F], c: T_A[F]) extends T_B[F, CC_A]
case class CC_E[H](a: CC_A) extends T_B[H, CC_A]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_C(_))) => 0 
  case CC_D(CC_D(_, _, _), _, _) => 1 
  case CC_D(CC_E(_), _, _) => 2 
  case CC_E(CC_A(_, CC_C(_))) => 3 
}
}
// This is not matched: CC_D(CC_C(_), _, _)