package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]]) extends T_A[T_B[Boolean]]
case class CC_B() extends T_A[T_B[Boolean]]
case class CC_C(a: CC_A, b: T_A[T_B[Boolean]]) extends T_A[T_B[Boolean]]
case class CC_D(a: T_B[(CC_A,CC_B)], b: CC_A, c: CC_B) extends T_B[(CC_A,CC_B)]
case class CC_E(a: T_A[T_B[Boolean]]) extends T_B[(CC_A,CC_B)]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_), CC_A(_)) => 2 
  case CC_C(CC_A(_), CC_C(_, _)) => 3 
}
}
// This is not matched: CC_C(CC_A(_), CC_B())