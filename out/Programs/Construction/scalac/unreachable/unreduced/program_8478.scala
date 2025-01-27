package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]], c: Byte) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[Int]) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_A, b: Int) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}