package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_C() extends T_A[T_A[Int]]
case class CC_D(a: T_A[T_B], b: T_A[T_A[CC_C]], c: T_B) extends T_B
case class CC_E() extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_D(_, _, _)) => 0 
}
}
// This is not matched: CC_C(CC_D(_, _), CC_B(_, _, _), _)