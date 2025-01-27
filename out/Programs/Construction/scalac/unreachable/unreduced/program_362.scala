package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Byte], c: T_B) extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C(a: CC_A, b: CC_B) extends T_B
case class CC_D(a: T_A[T_A[T_B]], b: T_B, c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
  case CC_D(CC_A(_, _, _), CC_B(), _) => 2 
  case CC_D(CC_A(_, _, _), CC_C(_, _), _) => 3 
  case CC_D(CC_A(_, _, _), CC_D(_, _, _), _) => 4 
}
}