package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Int], T_A[(Int,Int), Char]]) extends T_A[T_A[(Byte,Boolean), T_B[Int]], T_B[(Char,Int)]]
case class CC_B() extends T_A[T_A[(Byte,Boolean), T_B[Int]], T_B[(Char,Int)]]

val v_a: T_A[T_A[(Byte,Boolean), T_B[Int]], T_B[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}