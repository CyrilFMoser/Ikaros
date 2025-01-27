package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Byte], T_A[Char, Int]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_A[Byte, Byte], T_A[Char, Int]]]
case class CC_C[E](a: (T_A[Int, Char],T_A[Int, Char])) extends T_A[E, T_A[T_A[Byte, Byte], T_A[Char, Int]]]

val v_a: T_A[Byte, T_A[T_A[Byte, Byte], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C((_,_)) => 2 
}
}