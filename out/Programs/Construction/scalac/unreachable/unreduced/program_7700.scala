package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Byte, Char], (Byte,Char)], b: Int) extends T_A[T_A[T_A[(Int,Char), Byte], T_B[Boolean, Byte]], Boolean]
case class CC_B(a: T_B[Byte, CC_A], b: Boolean, c: T_A[Boolean, T_B[Byte, CC_A]]) extends T_A[T_A[T_A[(Int,Char), Byte], T_B[Boolean, Byte]], Boolean]
case class CC_C(a: Int, b: ((CC_B,CC_B),T_B[Int, Boolean])) extends T_B[Int, Boolean]
case class CC_D[E, F, G]() extends T_B[F, E]
case class CC_E() extends T_B[Int, Boolean]

val v_a: T_A[T_A[T_A[(Int,Char), Byte], T_B[Boolean, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, true, _) => 1 
  case CC_B(_, false, _) => 2 
}
}