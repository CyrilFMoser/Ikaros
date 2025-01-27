package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean], b: T_A[T_A[Boolean]], c: T_A[Byte]) extends T_A[Boolean]
case class CC_B(a: CC_A, b: T_A[Boolean], c: T_A[Boolean]) extends T_B
case class CC_C() extends T_B
case class CC_D[B](a: CC_B, b: B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_, CC_A(_, _, _), _), _) => 1 
}
}
// This is not matched: CC_B(_, _, _)