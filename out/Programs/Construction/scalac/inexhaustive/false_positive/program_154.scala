package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[D](a: T_A[D], b: T_B[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C() extends T_A[T_A[T_A[Char]]]
case class CC_E() extends T_B[CC_C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_B())