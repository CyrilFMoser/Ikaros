package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Int,(Boolean,Int)), T_A[Boolean, Char]], b: T_A[T_A[Char, Boolean], T_A[Char, Byte]]) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Byte]], T_A[(Char,Char), (Byte,Char)]]
case class CC_B[C](a: Int, b: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Byte]], T_A[(Char,Char), (Byte,Char)]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Byte, Byte]], T_A[(Char,Char), (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}