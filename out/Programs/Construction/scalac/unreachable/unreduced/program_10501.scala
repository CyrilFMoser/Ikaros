package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: Byte, c: Char) extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: Int, b: T_B[F]) extends T_B[F]
case class CC_D(a: T_B[T_B[Boolean]]) extends T_B[T_A[T_B[T_A[Byte, (Byte,Char)]], T_A[Byte, (Byte,Char)]]]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(12, CC_B(_)) => 1 
  case CC_C(12, CC_C(_, CC_B(_))) => 2 
  case CC_C(12, CC_C(_, CC_C(_, _))) => 3 
  case CC_C(_, CC_B(_)) => 4 
  case CC_C(_, CC_C(_, CC_B(_))) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 6 
}
}