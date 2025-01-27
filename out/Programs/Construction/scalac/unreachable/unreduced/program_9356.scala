package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_B[T_A[T_A[Byte]], E]
case class CC_C(a: T_B[CC_B[Boolean], Int], b: CC_A[T_A[Char]]) extends T_B[T_A[T_A[Byte]], T_B[CC_B[Byte], (Char,Int)]]

val v_a: T_B[T_A[T_A[Byte]], T_B[CC_B[Byte], (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_, CC_A(_, _, _), _)) => 1 
}
}