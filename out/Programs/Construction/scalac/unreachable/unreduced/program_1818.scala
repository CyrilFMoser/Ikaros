package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[CC_A], b: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: Char) extends T_A[T_A[T_A[Int]]]
case class CC_D[C]() extends T_B[C]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_B(_, CC_A(_)) => 1 
}
}
// This is not matched: CC_C(_)