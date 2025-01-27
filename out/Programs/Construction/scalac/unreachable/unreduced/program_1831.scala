package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C], c: T_B[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C() extends T_B[T_B[T_A[Boolean]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_B(), _, _)