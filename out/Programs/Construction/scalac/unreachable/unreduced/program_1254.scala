package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: T_B[B]) extends T_A
case class CC_B(a: Char) extends T_B[T_B[T_B[Int]]]
case class CC_C(a: T_B[T_A], b: CC_B, c: Char) extends T_B[T_B[T_B[Int]]]
case class CC_D(a: T_A, b: T_A) extends T_B[T_B[T_B[Int]]]

val v_a: T_B[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_B(_)