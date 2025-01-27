package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[Char, Char]], c: T_A[C, T_A[Char, Char]]) extends T_A[C, T_A[Char, Char]]
case class CC_B(a: T_A[T_A[Byte, Boolean], T_A[Char, Char]]) extends T_A[(CC_A[Byte],CC_A[Boolean]), T_A[Char, Char]]
case class CC_C(a: T_A[CC_A[Byte], T_A[Char, Char]]) extends T_A[CC_A[Byte], T_A[Char, Char]]

val v_a: T_A[CC_A[Byte], T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_C(_), _) => 1 
  case CC_C(_) => 2 
}
}