package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Int, Byte], Boolean], b: Boolean, c: T_A[Byte, T_B[Char, Char]]) extends T_A[T_B[T_B[(Char,Boolean), Boolean], T_B[Boolean, Char]], T_A[(Char,Char), T_A[Char, Byte]]]
case class CC_B(a: Char) extends T_A[T_B[T_B[(Char,Boolean), Boolean], T_B[Boolean, Char]], T_A[(Char,Char), T_A[Char, Byte]]]
case class CC_C(a: Boolean, b: Int, c: Byte) extends T_A[T_B[T_B[(Char,Boolean), Boolean], T_B[Boolean, Char]], T_A[(Char,Char), T_A[Char, Byte]]]

val v_a: T_A[T_B[T_B[(Char,Boolean), Boolean], T_B[Boolean, Char]], T_A[(Char,Char), T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, 12, 0) => 2 
  case CC_C(_, _, 0) => 3 
  case CC_C(_, 12, _) => 4 
  case CC_C(_, _, _) => 5 
}
}