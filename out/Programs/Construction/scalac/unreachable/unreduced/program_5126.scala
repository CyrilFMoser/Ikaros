package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Int, Char], T_A[Boolean, Byte]]]
case class CC_B[D]() extends T_A[D, T_A[CC_A[(Int,Boolean)], CC_A[Int]]]
case class CC_C[E](a: CC_B[(Boolean,Int)], b: T_A[E, E], c: E) extends T_A[E, T_A[CC_A[(Int,Boolean)], CC_A[Int]]]

val v_a: T_A[Boolean, T_A[CC_A[(Int,Boolean)], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}