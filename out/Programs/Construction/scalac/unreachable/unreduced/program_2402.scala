package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D, E](a: CC_A[D]) extends T_A[T_A[D, D], D]
case class CC_C(a: (CC_B[Boolean, Char],CC_B[Byte, Int]), b: CC_B[CC_A[Int], CC_A[Byte]], c: T_A[CC_A[Char], Int]) extends T_A[T_A[T_A[T_A[CC_B[Boolean, Boolean], CC_B[Boolean, Boolean]], CC_B[Boolean, Boolean]], T_A[T_A[CC_B[Boolean, Boolean], CC_B[Boolean, Boolean]], CC_B[Boolean, Boolean]]], T_A[T_A[CC_B[Boolean, Boolean], CC_B[Boolean, Boolean]], CC_B[Boolean, Boolean]]]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}