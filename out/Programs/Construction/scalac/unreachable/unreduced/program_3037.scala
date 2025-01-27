package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Int) extends T_A[T_B]
case class CC_B(a: T_A[CC_A[T_B]], b: Int, c: CC_A[Byte]) extends T_B
case class CC_C(a: CC_A[T_A[T_B]], b: T_A[T_A[T_B]], c: T_A[T_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(_), _, _) => 1 
  case CC_D() => 2 
}
}