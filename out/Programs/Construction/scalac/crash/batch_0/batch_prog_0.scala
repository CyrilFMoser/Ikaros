package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Char, c: T_A[C, C]) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}