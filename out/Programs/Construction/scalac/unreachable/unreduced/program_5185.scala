package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, T_A[Byte, Boolean]]) extends T_A[T_A[T_A[(Boolean,Char), Boolean], T_A[Int, Byte]], T_A[T_A[Byte, Int], (Char,Int)]]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Char), Boolean], T_A[Int, Byte]], T_A[T_A[Byte, Int], (Char,Int)]]

val v_a: T_A[T_A[T_A[(Boolean,Char), Boolean], T_A[Int, Byte]], T_A[T_A[Byte, Int], (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}