package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E], c: T_B[E, E]) extends T_A[E]
case class CC_C(a: T_A[T_A[Byte]]) extends T_B[T_B[T_A[Int], Boolean], CC_A[T_A[Boolean]]]
case class CC_D(a: CC_B[T_A[CC_C]], b: T_B[Boolean, T_B[CC_C, CC_C]]) extends T_B[T_B[T_A[Int], Boolean], CC_A[T_A[Boolean]]]
case class CC_E(a: (T_A[(Int,Int)],T_A[CC_D]), b: CC_D) extends T_B[T_B[T_A[Int], Boolean], CC_A[T_A[Boolean]]]

val v_a: T_B[T_B[T_A[Int], Boolean], CC_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(_, CC_D(CC_B(_, _, _), _)) => 1 
}
}
// This is not matched: CC_D(CC_B(_, _, _), _)