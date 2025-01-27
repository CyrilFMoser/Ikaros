package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Int, Int], ((Int,Boolean),Char)]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: CC_A[D]) extends T_A[D, T_A[T_A[Int, Int], ((Int,Boolean),Char)]]

val v_a: T_A[Byte, T_A[T_A[Int, Int], ((Int,Boolean),Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}