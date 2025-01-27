package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], D]
case class CC_B[F](a: Boolean, b: F) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], F]
case class CC_C(a: T_A[T_B[(Char,Char)], Int], b: T_A[Int, T_A[Char, Int]]) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], T_A[CC_B[Boolean], Boolean]]
case class CC_D[G]() extends T_B[G]
case class CC_E(a: Boolean) extends T_B[CC_C]
case class CC_F(a: Int) extends T_B[CC_C]

val v_a: CC_B[T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], T_A[CC_B[Boolean], Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B(_, CC_C(_, _))