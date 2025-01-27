package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_B[T_B[D, D], D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D(a: T_B[T_A[Byte], T_A[Boolean]], b: T_A[CC_C[Boolean]]) extends T_B[Int, T_A[CC_B[Int]]]
case class CC_E() extends T_B[Int, T_A[CC_B[Int]]]
case class CC_F(a: CC_B[Boolean]) extends T_B[Int, T_A[CC_B[Int]]]

val v_a: T_B[Int, T_A[CC_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _)) => 0 
  case CC_D(_, CC_B()) => 1 
  case CC_D(_, CC_C()) => 2 
  case CC_E() => 3 
  case CC_F(_) => 4 
}
}