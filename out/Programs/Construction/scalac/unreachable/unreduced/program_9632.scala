package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Char]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}