package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: T_A[Char], b: T_A[T_A[Byte]], c: Byte) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), 0) => 1 
  case CC_B(_, CC_A(), _) => 2 
  case CC_B(_, CC_B(_, CC_A(), _), 0) => 3 
  case CC_B(_, CC_B(_, CC_A(), _), _) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), 0) => 5 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 6 
}
}