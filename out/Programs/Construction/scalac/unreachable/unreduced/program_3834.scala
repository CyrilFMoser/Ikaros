package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_A[Char, Char], T_B[Int, Byte]]) extends T_A[T_B[T_A[Boolean, Char], T_B[(Byte,Boolean), Char]], Boolean]
case class CC_B() extends T_A[T_B[T_A[Boolean, Char], T_B[(Byte,Boolean), Char]], Boolean]
case class CC_C(a: CC_A, b: Boolean) extends T_A[T_B[T_A[Boolean, Char], T_B[(Byte,Boolean), Char]], Boolean]
case class CC_D[E](a: E, b: T_B[E, CC_B]) extends T_B[E, CC_B]
case class CC_E[F](a: T_A[F, Byte], b: CC_A) extends T_B[F, CC_B]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), CC_D(CC_B(), _)) => 0 
  case CC_D(CC_B(), CC_E(_, CC_A(_))) => 1 
}
}
// This is not matched: CC_E(_, CC_A(_))