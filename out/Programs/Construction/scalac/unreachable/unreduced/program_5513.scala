package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[Int, Byte]
case class CC_B(a: T_B[T_B[CC_A, CC_A], T_A[CC_A, Char]], b: CC_A) extends T_A[T_A[Int, Byte], T_A[Int, Byte]]
case class CC_C(a: T_A[T_A[Int, Byte], T_A[Int, Byte]], b: (CC_B,CC_A), c: T_A[T_A[Int, Byte], T_A[Int, Byte]]) extends T_A[Int, Byte]
case class CC_D[E]() extends T_B[E, CC_A]
case class CC_E[F](a: F, b: T_A[F, F]) extends T_B[F, CC_A]
case class CC_F[G]() extends T_B[G, CC_A]

val v_a: T_B[T_A[Int, Byte], CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_B(_, _)) => 1 
  case CC_F() => 2 
}
}