package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Byte], T_A[Boolean, Char]], b: T_A[((Boolean,Boolean),Boolean), T_A[Boolean, Byte]], c: T_A[T_A[Byte, Int], (Int,Byte)]) extends T_A[T_A[Byte, T_A[(Char,Int), Char]], T_A[(Char,Boolean), T_A[Char, Int]]]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_A[Byte, T_A[(Char,Int), Char]], T_A[(Char,Boolean), T_A[Char, Int]]]

val v_a: T_A[T_A[Byte, T_A[(Char,Int), Char]], T_A[(Char,Boolean), T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}