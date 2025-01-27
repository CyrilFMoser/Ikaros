package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Int, Int], Int]) extends T_A[T_A[T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]], T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]]], T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]], T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]]], T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(CC_A(_)) => 1 
}
}