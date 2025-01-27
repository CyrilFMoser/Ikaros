package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], T_A[T_A[Byte, Byte], T_A[Char, Int]]]
case class CC_B(a: CC_A[CC_A[Char]], b: T_A[T_A[Byte, Byte], T_A[Byte, Int]]) extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], T_A[T_A[Byte, Byte], T_A[Char, Int]]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], T_A[T_A[Byte, Byte], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Byte, Char]], T_A[T_A[Byte, Byte], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}