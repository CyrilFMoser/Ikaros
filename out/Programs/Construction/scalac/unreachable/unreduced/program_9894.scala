package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: CC_B[F], b: T_A[F]) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[G](a: T_A[G], b: T_A[G], c: CC_A[G]) extends T_B[G, T_A[Byte]]
case class CC_E(a: T_B[Int, CC_B[Boolean]]) extends T_B[T_B[T_A[Char], T_A[Byte]], CC_B[CC_C[Boolean]]]

val v_a: T_B[CC_E, T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_A(_, _, _), CC_E(_), CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_D(_, CC_A(CC_A(_, _, _), CC_E(_), CC_B()), CC_A(_, _, _)) => 1 
  case CC_D(_, CC_A(CC_B(), CC_E(_), CC_A(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_D(_, CC_A(CC_B(), CC_E(_), CC_B()), CC_A(_, _, _)) => 3 
  case CC_D(_, CC_B(), CC_A(_, _, _)) => 4 
}
}