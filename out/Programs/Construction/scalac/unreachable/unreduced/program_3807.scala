package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: (T_A[Byte, Boolean],T_A[Int, Boolean]), c: T_A[C, D]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: E) extends T_A[E, T_A[E, E]]
case class CC_C(a: T_A[Boolean, Boolean], b: CC_B[T_A[Boolean, Int]]) extends T_A[CC_B[CC_A[Int, Char]], T_A[CC_B[CC_A[Int, Char]], CC_B[CC_A[Int, Char]]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_) => 1 
}
}