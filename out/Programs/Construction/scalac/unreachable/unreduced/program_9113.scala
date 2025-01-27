package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[T_A[Char, T_A[Boolean, Int]], T_A[T_A[Char, Char], Byte]]
case class CC_B(a: CC_A[T_A[Byte, Int]], b: CC_A[(Byte,Boolean)], c: Int) extends T_A[T_A[Char, T_A[Boolean, Int]], T_A[T_A[Char, Char], Byte]]
case class CC_C(a: CC_A[CC_B]) extends T_A[T_A[Char, T_A[Boolean, Int]], T_A[T_A[Char, Char], Byte]]

val v_a: T_A[T_A[Char, T_A[Boolean, Int]], T_A[T_A[Char, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_), _) => 1 
}
}
// This is not matched: CC_C(CC_A(_))