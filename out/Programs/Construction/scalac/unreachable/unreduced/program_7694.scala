package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: (T_A[T_B],T_B), c: Boolean) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: CC_B, b: T_A[T_B], c: T_A[T_B]) extends T_B
case class CC_E(a: Int, b: Byte, c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(), CC_A(_, _, _), CC_A(_, (_,_), _)) => 1 
  case CC_D(CC_B(), CC_A(_, _, _), CC_B()) => 2 
  case CC_D(CC_B(), CC_B(), CC_A(_, (_,_), _)) => 3 
  case CC_D(CC_B(), CC_B(), CC_B()) => 4 
  case CC_E(_, _, _) => 5 
}
}