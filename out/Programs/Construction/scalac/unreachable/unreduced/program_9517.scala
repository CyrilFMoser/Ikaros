package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B(a: Char) extends T_A[T_A[T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]]
case class CC_C[D](a: T_A[D, Int], b: T_A[D, Int]) extends T_A[D, Int]

val v_a: T_A[T_A[T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_) => 1 
}
}