package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[Int, T_A[Byte, Byte]], T_A[T_A[Byte, Char], (Char,Int)]]
case class CC_B(a: Byte, b: T_A[T_A[Char, Byte], T_A[Int, Boolean]]) extends T_A[T_A[Int, T_A[Byte, Byte]], T_A[T_A[Byte, Char], (Char,Int)]]
case class CC_C() extends T_A[T_A[Int, T_A[Byte, Byte]], T_A[T_A[Byte, Char], (Char,Int)]]

val v_a: T_A[T_A[Int, T_A[Byte, Byte]], T_A[T_A[Byte, Char], (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}