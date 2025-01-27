package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_A[Byte, Byte], T_A[Char, Char]], T_A[T_A[Boolean, Boolean], T_A[Char, Char]]]
case class CC_B(a: T_A[T_A[Byte, Boolean], CC_A[Char]]) extends T_A[T_A[T_A[Byte, Byte], T_A[Char, Char]], T_A[T_A[Boolean, Boolean], T_A[Char, Char]]]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Char, Char]], T_A[T_A[Boolean, Boolean], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}