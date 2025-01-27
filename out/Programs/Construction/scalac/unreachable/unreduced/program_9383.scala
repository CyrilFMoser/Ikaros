package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[T_A[D, D]], b: T_B[D], c: T_A[D, D]) extends T_A[T_B[((Char,Char),Int)], D]
case class CC_B[E]() extends T_A[T_B[((Char,Char),Int)], E]
case class CC_C[F](a: Byte, b: T_B[F]) extends T_A[T_B[((Char,Char),Int)], F]
case class CC_D[G]() extends T_B[G]
case class CC_E() extends T_B[T_A[T_B[Int], T_B[Boolean]]]
case class CC_F() extends T_B[T_A[T_B[Int], T_B[Boolean]]]

val v_a: T_A[T_B[((Char,Char),Int)], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), CC_D(), _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_D()) => 2 
}
}