package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[(Int,Boolean), Boolean], Int], C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[T_A[T_A[(Int,Boolean), Boolean], Int], D]

val v_a: T_A[T_A[T_A[(Int,Boolean), Boolean], Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}