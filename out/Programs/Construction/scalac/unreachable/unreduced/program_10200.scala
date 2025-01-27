package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Char],T_A[Char, Byte])) extends T_A[T_A[Char, Char], T_A[T_A[Byte, Int], T_A[Byte, Byte]]]
case class CC_B(a: T_A[CC_A[Byte], T_A[Int, Char]]) extends T_A[T_A[Char, Char], T_A[T_A[Byte, Int], T_A[Byte, Byte]]]
case class CC_C() extends T_A[T_A[Char, Char], T_A[T_A[Byte, Int], T_A[Byte, Byte]]]

val v_a: T_A[T_A[Char, Char], T_A[T_A[Byte, Int], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}