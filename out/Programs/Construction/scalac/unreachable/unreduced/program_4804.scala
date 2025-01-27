package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Byte], T_A[Byte, Byte]]) extends T_A[T_A[T_A[Char, Char], T_A[Char, Int]], T_A[T_A[Char, Int], T_A[Char, Char]]]
case class CC_B() extends T_A[T_A[T_A[Char, Char], T_A[Char, Int]], T_A[T_A[Char, Int], T_A[Char, Char]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Char, Int]], T_A[T_A[Char, Int], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}