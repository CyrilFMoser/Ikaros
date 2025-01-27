package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_B[Byte], c: T_B[D]) extends T_A[D, Boolean]
case class CC_B[E]() extends T_A[E, Boolean]
case class CC_C[F, G](a: T_A[F, F], b: Byte) extends T_A[F, Boolean]
case class CC_D() extends T_B[T_B[T_A[Boolean, Boolean]]]
case class CC_E(a: CC_C[T_A[CC_D, Boolean], T_A[Int, CC_D]]) extends T_B[T_B[T_A[Boolean, Boolean]]]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
  case CC_C(_, _) => 3 
}
}