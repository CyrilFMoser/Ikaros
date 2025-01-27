package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], C]]

val v_a: T_A[Int, T_A[T_A[Int, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}