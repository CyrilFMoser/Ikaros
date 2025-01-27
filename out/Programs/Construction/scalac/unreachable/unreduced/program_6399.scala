package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[D, D], D]
case class CC_B[E](a: E, b: T_A[E, E], c: Char) extends T_B[E]
case class CC_C() extends T_B[T_A[CC_A[(Int,Int)], CC_B[Int]]]
case class CC_D(a: Int) extends T_B[T_A[CC_A[(Int,Int)], CC_B[Int]]]

val v_a: T_B[T_A[CC_A[(Int,Int)], CC_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
  case CC_D(12) => 2 
  case CC_D(_) => 3 
}
}