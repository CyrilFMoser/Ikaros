package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char, b: T_A[T_A[Int, Int], T_A[Char, Byte]], c: T_A[T_A[Boolean, Byte], T_A[Char, Int]]) extends T_A[Byte, T_A[Char, T_A[Byte, Char]]]
case class CC_B() extends T_A[Byte, T_A[Char, T_A[Byte, Char]]]

val v_a: T_A[Byte, T_A[Char, T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
}
}