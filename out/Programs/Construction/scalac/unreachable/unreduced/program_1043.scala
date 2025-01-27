package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Int, Boolean],T_A[(Int,Int), Int])) extends T_A[C, T_A[C, C]]
case class CC_B(a: Int) extends T_A[T_A[CC_A[Int], Char], T_A[T_A[CC_A[Int], Char], T_A[CC_A[Int], Char]]]
case class CC_C(a: T_A[CC_B, T_A[CC_B, CC_B]]) extends T_A[CC_B, T_A[CC_B, CC_B]]

val v_a: T_A[T_A[CC_A[Int], Char], T_A[T_A[CC_A[Int], Char], T_A[CC_A[Int], Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}