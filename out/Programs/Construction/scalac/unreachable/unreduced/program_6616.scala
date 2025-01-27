package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Char], T_A[(Byte,Boolean), Boolean]]) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Char, Byte], T_A[Char, Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Char, Byte], T_A[Char, Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Char, Byte], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}