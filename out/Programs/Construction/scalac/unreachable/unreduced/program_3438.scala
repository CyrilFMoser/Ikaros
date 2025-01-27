package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: Int) extends T_A[C]
case class CC_B[D](a: CC_A[D], b: Byte) extends T_A[D]
case class CC_C[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_D() extends T_B[(T_A[Int],CC_A[Boolean])]
case class CC_E(a: T_A[T_A[CC_D]], b: CC_A[CC_B[CC_D]]) extends T_B[(T_A[Int],CC_A[Boolean])]
case class CC_F(a: CC_A[T_A[Char]]) extends T_B[(T_A[Int],CC_A[Boolean])]

val v_a: T_B[(T_A[Int],CC_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _), _) => 0 
  case CC_E(CC_B(CC_A(_, _), 0), _) => 1 
  case CC_E(CC_B(CC_A(_, _), _), _) => 2 
  case CC_E(CC_C(_, _), _) => 3 
  case CC_F(CC_A(_, _)) => 4 
}
}
// This is not matched: CC_D()