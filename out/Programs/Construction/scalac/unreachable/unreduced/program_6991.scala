package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: T_A[D, T_A[D, D]], c: T_A[D, D]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Boolean, Int], CC_A[Char, Int]], b: Int) extends T_A[CC_A[CC_A[Int, Int], CC_A[Boolean, Char]], T_A[CC_A[CC_A[Int, Int], CC_A[Boolean, Char]], CC_A[CC_A[Int, Int], CC_A[Boolean, Char]]]]
case class CC_C() extends T_A[CC_A[CC_A[Int, Int], CC_A[Boolean, Char]], T_A[CC_A[CC_A[Int, Int], CC_A[Boolean, Char]], CC_A[CC_A[Int, Int], CC_A[Boolean, Char]]]]

val v_a: T_A[CC_A[CC_A[Int, Int], CC_A[Boolean, Char]], T_A[CC_A[CC_A[Int, Int], CC_A[Boolean, Char]], CC_A[CC_A[Int, Int], CC_A[Boolean, Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}