package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[T_A[B]]) extends T_A[T_A[(Boolean,Int)]]
case class CC_B(a: CC_A[CC_A[Char]], b: T_A[CC_A[Byte]]) extends T_A[T_A[(Boolean,Int)]]

val v_a: T_A[T_A[(Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
}
}