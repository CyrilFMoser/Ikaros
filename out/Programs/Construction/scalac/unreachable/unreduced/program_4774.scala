package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B], c: T_B) extends T_A[T_B]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B]
case class CC_C(a: T_A[T_B]) extends T_B
case class CC_D(a: CC_C, b: CC_A, c: T_A[(Int,Char)]) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), CC_A(_, _, _), _) => 0 
  case CC_A(CC_D(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_A(CC_C(_), CC_B(_), _) => 2 
  case CC_A(CC_D(_, _, _), CC_B(_), _) => 3 
}
}