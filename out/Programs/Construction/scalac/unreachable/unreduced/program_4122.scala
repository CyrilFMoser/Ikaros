package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Boolean], T_A[Boolean, Char]]) extends T_A[T_B[T_A[Byte, Char]], T_B[T_A[Boolean, Char]]]
case class CC_B(a: T_A[T_B[Char], CC_A], b: Int) extends T_A[T_B[T_A[Byte, Char]], T_B[T_A[Boolean, Char]]]
case class CC_C(a: CC_A) extends T_A[T_B[T_A[Byte, Char]], T_B[T_A[Boolean, Char]]]

val v_a: T_A[T_B[T_A[Byte, Char]], T_B[T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)