package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[(Boolean,Int)]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: CC_A) extends T_A[T_A[(Boolean,Int)]]

val v_a: T_A[T_A[(Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
}
}