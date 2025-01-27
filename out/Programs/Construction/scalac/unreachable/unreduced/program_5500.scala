package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[(Int,Byte)]]
case class CC_B(a: (CC_A,CC_A), b: Char, c: CC_A) extends T_A[T_A[(Int,Byte)]]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_A[(Int,Byte)]]

val v_a: T_A[T_A[(Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_A(_)) => 2 
}
}