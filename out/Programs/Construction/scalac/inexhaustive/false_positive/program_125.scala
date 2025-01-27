package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[T_B[D]], b: T_A[D, D]) extends T_A[T_B[(Byte,Char)], D]
case class CC_B[E]() extends T_B[E]
case class CC_D[G]() extends T_B[G]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _) => 0 
}
}
// This is not matched: CC_A(CC_B(_), _)