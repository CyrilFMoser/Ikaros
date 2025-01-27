package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[(Int,Byte)]]
case class CC_B(a: Byte) extends T_A[T_A[(Int,Byte)]]

val v_a: T_A[T_A[(Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}