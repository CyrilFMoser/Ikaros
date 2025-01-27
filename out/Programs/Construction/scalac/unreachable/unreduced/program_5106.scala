package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Int]
case class CC_B[D](a: T_A[T_A[D, D], D], b: T_A[D, Int]) extends T_A[D, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}