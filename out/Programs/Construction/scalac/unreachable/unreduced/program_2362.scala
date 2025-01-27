package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Byte], T_A[Char, Char]]) extends T_A[Char, Char]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: T_B[E], b: E) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _) => 1 
  case CC_C(CC_C(_, CC_A(_)), _) => 2 
}
}