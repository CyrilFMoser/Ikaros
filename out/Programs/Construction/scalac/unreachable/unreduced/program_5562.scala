package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: Char) extends T_A[T_A[Byte]]
case class CC_C(a: T_A[Boolean], b: T_A[CC_B]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A('x', _)) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(_, CC_B(_)) => 2 
  case CC_A(_, CC_C(_, _)) => 3 
  case CC_B(_) => 4 
  case CC_C(_, _) => 5 
}
}