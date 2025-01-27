package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], C]
case class CC_B() extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], CC_A[(Int,Int)]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], CC_A[(Int,Int)]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], CC_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}