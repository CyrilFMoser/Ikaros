package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], T_A[T_A[Char, Char], T_A[Byte, Boolean]]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], T_A[T_A[Char, Char], T_A[Byte, Boolean]]]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], T_A[T_A[Char, Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}