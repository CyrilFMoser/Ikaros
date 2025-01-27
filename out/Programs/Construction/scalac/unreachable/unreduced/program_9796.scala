package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Boolean], Char], C]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[T_A[Int, Boolean], Char], D]

val v_a: T_A[T_A[T_A[Int, Boolean], Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}