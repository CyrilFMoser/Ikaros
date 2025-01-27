package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[T_B[Boolean]]
case class CC_B() extends T_A[T_B[Boolean]]
case class CC_C(a: T_B[Int], b: CC_B, c: Int) extends T_B[T_B[T_A[CC_B]]]
case class CC_D(a: CC_B) extends T_B[T_B[T_A[CC_B]]]
case class CC_E(a: T_A[T_B[Boolean]]) extends T_B[T_B[T_A[CC_B]]]

val v_a: T_B[T_B[T_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(), _) => 0 
  case CC_D(CC_B()) => 1 
  case CC_E(CC_A(_)) => 2 
  case CC_E(CC_B()) => 3 
}
}