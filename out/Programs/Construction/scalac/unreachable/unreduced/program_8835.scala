package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Char], T_A[Byte, Char]]]
case class CC_B[D](a: (T_A[Boolean, Boolean],CC_A[Boolean])) extends T_A[D, T_A[T_A[Byte, Char], T_A[Byte, Char]]]

val v_a: T_A[Int, T_A[T_A[Byte, Char], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
}
}