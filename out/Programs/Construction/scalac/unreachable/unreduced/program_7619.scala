package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[Int], c: T_A[T_A[Boolean]]) extends T_A[T_A[(Int,Boolean)]]
case class CC_B(a: (T_A[CC_A],CC_A), b: Char, c: Int) extends T_A[T_A[(Int,Boolean)]]
case class CC_C() extends T_A[T_A[(Int,Boolean)]]

val v_a: T_A[T_A[(Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _, _)), _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)