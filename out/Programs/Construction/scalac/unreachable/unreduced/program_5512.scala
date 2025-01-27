package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Boolean], (Int,Boolean)]]
case class CC_B(a: T_A[T_A[Int, Int], T_A[Int, Boolean]]) extends T_A[Byte, T_A[T_A[Int, Boolean], (Int,Boolean)]]
case class CC_C() extends T_A[Byte, T_A[T_A[Int, Boolean], (Int,Boolean)]]

val v_a: T_A[Byte, T_A[T_A[Int, Boolean], (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}