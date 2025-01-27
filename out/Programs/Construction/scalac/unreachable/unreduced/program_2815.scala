package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Char]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]], b: CC_A, c: T_A[CC_A]) extends T_A[T_A[Boolean]]
case class CC_C(a: Byte) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_A(_, _), _), CC_A(_, _), _) => 1 
  case CC_B(CC_A(CC_B(_, _, _), _), CC_A(_, _), _) => 2 
  case CC_B(CC_B(_, _, _), CC_A(_, _), _) => 3 
  case CC_B(CC_C(_), CC_A(_, _), _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_B(CC_A(CC_C(_), _), CC_A(_, _), _)