package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C() extends T_B

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}