package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[(Byte,Char)],T_A[Byte]), b: Boolean, c: T_A[T_A[Boolean]]) extends T_A[T_A[(Int,Int)]]
case class CC_B(a: CC_A, b: Int, c: (CC_A,CC_A)) extends T_A[T_A[(Int,Int)]]

val v_a: T_A[T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}