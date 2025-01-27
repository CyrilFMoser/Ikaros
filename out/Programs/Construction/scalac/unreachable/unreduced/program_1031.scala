package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[Int, E]
case class CC_B() extends T_A[Int, Byte]
case class CC_C(a: (T_A[(Byte,Int), CC_B],CC_B)) extends T_A[Int, T_A[Int, Byte]]
case class CC_D[F](a: T_A[Int, T_A[Int, Byte]], b: CC_A[F]) extends T_B[CC_A[CC_C], F]
case class CC_E[G]() extends T_B[CC_A[CC_C], G]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}