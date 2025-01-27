package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Int,Int)]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: Int, c: CC_A) extends T_A[T_A[(Int,Int)]]
case class CC_C[B](a: CC_B) extends T_A[T_A[(Int,Int)]]

val v_a: T_A[T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C(CC_B(_, _, CC_A())) => 2 
}
}