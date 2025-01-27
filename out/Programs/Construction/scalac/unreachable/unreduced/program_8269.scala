package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Boolean, c: T_B) extends T_A[T_A[Boolean]]
case class CC_B(a: (Boolean,CC_A), b: T_A[T_B]) extends T_A[T_A[Boolean]]
case class CC_C() extends T_B
case class CC_D(a: (T_A[CC_C],CC_A), b: T_A[T_A[Boolean]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_B((_,_), _)) => 1 
}
}
// This is not matched: CC_D(_, CC_A(_, _, _))