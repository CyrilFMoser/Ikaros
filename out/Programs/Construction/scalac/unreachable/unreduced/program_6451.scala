package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Byte) extends T_A[T_A[(Int,Int)]]
case class CC_B(a: CC_A, b: CC_A, c: Int) extends T_A[T_A[(Int,Int)]]
case class CC_C(a: CC_A, b: T_A[T_A[(Boolean,Char)]]) extends T_A[T_A[(Int,Int)]]

val v_a: T_A[T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _), _) => 2 
}
}