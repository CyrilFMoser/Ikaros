package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Int,Int)]], b: (T_A[Boolean],T_A[Int])) extends T_A[T_A[(Byte,Int)]]
case class CC_B[B](a: T_A[B], b: Byte) extends T_A[T_A[(Byte,Int)]]

val v_a: T_A[T_A[(Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}