package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E], c: Boolean) extends T_A[E]
case class CC_C(a: (CC_B[Boolean],T_A[Boolean])) extends T_B[CC_B[Int], T_B[T_A[Int], T_A[(Int,Int)]]]
case class CC_D(a: CC_A[T_B[(Boolean,Int), CC_C]], b: T_B[CC_C, CC_A[CC_C]]) extends T_B[CC_B[Int], T_B[T_A[Int], T_A[(Int,Int)]]]

val v_a: T_B[CC_B[Int], T_B[T_A[Int], T_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_C((_,_)) => 0 
  case CC_D(CC_A(_, _, _), _) => 1 
}
}