package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[Int, Char], Boolean]
case class CC_B[E](a: E, b: Boolean) extends T_B[(T_B[CC_A, CC_A],T_A[Byte, CC_A]), E]
case class CC_C(a: T_A[T_A[Int, Char], Boolean], b: T_B[T_B[CC_A, CC_A], CC_B[CC_A]]) extends T_B[(T_B[CC_A, CC_A],T_A[Byte, CC_A]), CC_B[Byte]]
case class CC_D[F](a: F) extends T_B[(T_B[CC_A, CC_A],T_A[Byte, CC_A]), F]

val v_a: T_B[(T_B[CC_A, CC_A],T_A[Byte, CC_A]), CC_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_B(_, _)) => 2 
}
}