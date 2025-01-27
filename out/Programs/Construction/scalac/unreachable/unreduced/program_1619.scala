package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Byte, Byte]], C]
case class CC_B() extends T_A[T_A[T_A[Boolean, Byte], T_A[Byte, Byte]], CC_A[T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Byte, Byte]], CC_A[T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_B() => 1 
}
}