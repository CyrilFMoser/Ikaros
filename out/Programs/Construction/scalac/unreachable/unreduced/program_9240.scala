package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: B) extends T_A
case class CC_B(a: T_B[CC_A[T_A]], b: CC_A[T_B[T_A]], c: CC_A[T_A]) extends T_B[CC_A[T_A]]
case class CC_C() extends T_B[CC_A[T_A]]

val v_a: T_B[CC_A[T_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), CC_A(_), _) => 0 
  case CC_B(CC_C(), CC_A(_), _) => 1 
  case CC_C() => 2 
}
}