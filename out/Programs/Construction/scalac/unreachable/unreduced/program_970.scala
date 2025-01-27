package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Char, T_A[Char, Int]], T_A[Boolean, T_A[Byte, Char]]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], T_A[CC_A, CC_A]]) extends T_A[T_A[Char, T_A[Char, Int]], T_A[Boolean, T_A[Byte, Char]]]
case class CC_C() extends T_A[T_A[Char, T_A[Char, Int]], T_A[Boolean, T_A[Byte, Char]]]

val v_a: T_A[T_A[Char, T_A[Char, Int]], T_A[Boolean, T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}