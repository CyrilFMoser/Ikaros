package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B) extends T_A[D, C]
case class CC_B[F, E](a: E, b: CC_A[F, E]) extends T_A[F, E]
case class CC_C(a: Boolean, b: CC_B[CC_A[Boolean, Char], T_B]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: (CC_A[T_B, T_B],CC_B[CC_D, T_B]), b: Char, c: Boolean) extends T_B

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D()) => 1 
  case CC_A(CC_E((_,_), _, _)) => 2 
  case CC_B(_, CC_A(CC_C(_, _))) => 3 
  case CC_B(_, CC_A(CC_D())) => 4 
  case CC_B(_, CC_A(CC_E(_, _, _))) => 5 
}
}