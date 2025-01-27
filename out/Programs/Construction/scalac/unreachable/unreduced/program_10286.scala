package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: (Boolean,T_B), c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[T_A[T_B]], b: Char) extends T_B
case class CC_D(a: CC_B) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_B(_, _, _)) => 1 
  case CC_E() => 2 
}
}