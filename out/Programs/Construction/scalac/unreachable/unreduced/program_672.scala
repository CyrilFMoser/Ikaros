package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Int]], b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B[C]() extends T_B[C]
case class CC_C(a: T_A[Char], b: Boolean, c: Int) extends T_B[CC_B[CC_A]]

val v_a: T_B[CC_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, true, _) => 1 
  case CC_C(_, false, _) => 2 
}
}