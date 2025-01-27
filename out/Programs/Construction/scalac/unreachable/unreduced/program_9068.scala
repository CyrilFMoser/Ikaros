package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B, c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[CC_A[T_B]]) extends T_A[Boolean]
case class CC_C(a: Boolean, b: T_A[T_A[CC_B]], c: T_B) extends T_B
case class CC_D(a: (T_A[CC_B],T_B)) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_) => 1 
  case CC_E() => 2 
}
}