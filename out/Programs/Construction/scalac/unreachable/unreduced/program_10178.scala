package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, E], b: Boolean) extends T_A[E, T_B[E]]
case class CC_C[F](a: F, b: Byte, c: Byte) extends T_B[F]
case class CC_D(a: T_B[Byte]) extends T_B[T_B[(Char,Boolean)]]

val v_a: T_A[Boolean, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _)) => 0 
  case CC_B(_, _) => 1 
}
}