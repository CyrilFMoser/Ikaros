package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
}
}