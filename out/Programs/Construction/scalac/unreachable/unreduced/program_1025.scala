package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Byte], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[Boolean, Int], T_A[Char, Boolean]], T_A[T_A[Boolean, Byte], T_A[Byte, Byte]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Int], T_A[Char, Boolean]], T_A[T_A[Boolean, Byte], T_A[Byte, Byte]]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Char, Boolean]], T_A[T_A[Boolean, Byte], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}