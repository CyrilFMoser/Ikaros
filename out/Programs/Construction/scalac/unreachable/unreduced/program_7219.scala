package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: Int, b: CC_A[(T_B,(Int,Byte))], c: T_A[Boolean]) extends T_A[T_A[T_B]]
case class CC_C(a: T_A[T_A[T_B]], b: T_B, c: CC_B) extends T_A[T_A[T_B]]
case class CC_D(a: T_A[T_A[T_B]], b: Int) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, CC_D(CC_A(_), _), CC_B(_, _, _)) => 1 
  case CC_C(_, CC_D(CC_B(_, _, _), _), CC_B(_, _, _)) => 2 
  case CC_C(_, CC_D(CC_C(_, _, _), _), CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_B(_, _, _)