package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[Boolean]
case class CC_B(a: Byte, b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: T_A[Boolean], b: Byte) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}