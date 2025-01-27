package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B, c: B) extends T_A[T_B]
case class CC_B(a: Char, b: T_A[T_B]) extends T_B
case class CC_C(a: T_A[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_C(_) => 1 
}
}