package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Boolean, b: T_A[T_A[CC_A]], c: T_A[CC_A]) extends T_A[CC_A]
case class CC_C(a: Byte) extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(true, _, CC_B(_, _, _)) => 0 
  case CC_B(false, _, CC_B(_, _, _)) => 1 
  case CC_B(true, _, CC_C(_)) => 2 
  case CC_B(false, _, CC_C(_)) => 3 
  case CC_C(_) => 4 
}
}