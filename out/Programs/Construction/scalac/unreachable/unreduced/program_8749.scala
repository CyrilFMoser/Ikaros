package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: B) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[T_A[Int]], b: CC_A[T_A[Char]]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_B, b: CC_A[T_A[CC_B]]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C(_, CC_A(_, _)) => 2 
}
}