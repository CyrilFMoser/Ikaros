package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: Char, c: T_A[T_A[Char]]) extends T_A[Boolean]
case class CC_B(a: CC_A, b: Char) extends T_A[Boolean]
case class CC_C(a: Byte, b: (T_A[CC_B],CC_A)) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(0, _) => 3 
  case CC_C(_, _) => 4 
}
}