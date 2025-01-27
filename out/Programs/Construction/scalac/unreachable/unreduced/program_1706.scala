package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Char,Int), T_A[T_A[Byte, Byte], T_A[Byte, Byte]]], b: Byte, c: T_A[(Char,Int), C]) extends T_A[(Char,Int), C]
case class CC_B(a: CC_A[T_A[Int, Int]], b: T_A[T_A[Char, Byte], T_A[Int, Char]]) extends T_A[(Char,Int), CC_A[T_A[Boolean, Byte]]]
case class CC_C(a: CC_B) extends T_A[(Char,Int), CC_A[T_A[Boolean, Byte]]]

val v_a: T_A[(Char,Int), CC_A[T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _)) => 1 
  case CC_A(_, _, CC_C(_)) => 2 
  case CC_B(_, _) => 3 
  case CC_C(CC_B(_, _)) => 4 
}
}