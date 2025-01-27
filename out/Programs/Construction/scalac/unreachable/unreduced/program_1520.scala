package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E) extends T_A[E, T_B[E, E]]
case class CC_B() extends T_A[T_A[CC_A[Int], CC_A[(Int,Int)]], T_B[T_A[CC_A[Int], CC_A[(Int,Int)]], T_A[CC_A[Int], CC_A[(Int,Int)]]]]
case class CC_C(a: CC_A[CC_A[CC_B]], b: (T_B[CC_B, CC_B],Boolean)) extends T_A[T_A[CC_A[Int], CC_A[(Int,Int)]], T_B[T_A[CC_A[Int], CC_A[(Int,Int)]], T_A[CC_A[Int], CC_A[(Int,Int)]]]]

val v_a: T_A[T_A[T_A[CC_A[Int], CC_A[(Int,Int)]], T_B[T_A[CC_A[Int], CC_A[(Int,Int)]], T_A[CC_A[Int], CC_A[(Int,Int)]]]], T_B[T_A[T_A[CC_A[Int], CC_A[(Int,Int)]], T_B[T_A[CC_A[Int], CC_A[(Int,Int)]], T_A[CC_A[Int], CC_A[(Int,Int)]]]], T_A[T_A[CC_A[Int], CC_A[(Int,Int)]], T_B[T_A[CC_A[Int], CC_A[(Int,Int)]], T_A[CC_A[Int], CC_A[(Int,Int)]]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_C(_, _), _) => 1 
}
}
// This is not matched: CC_A(CC_B(), _)