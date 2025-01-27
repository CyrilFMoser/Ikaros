package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B() extends T_B
case class CC_C(a: Byte, b: (T_A[CC_B],T_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(0, (_,CC_B())) => 1 
  case CC_C(0, (_,CC_C(_, _))) => 2 
  case CC_C(_, (_,CC_B())) => 3 
}
}
// This is not matched: CC_C(_, (_,CC_C(_, _)))