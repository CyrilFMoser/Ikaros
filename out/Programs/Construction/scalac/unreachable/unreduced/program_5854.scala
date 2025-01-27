package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[C, T_A[Boolean, T_A[Boolean, Int]]]
case class CC_B[D](a: T_A[D, CC_A[D]], b: CC_A[D], c: Int) extends T_A[D, T_A[Boolean, T_A[Boolean, Int]]]
case class CC_C[E]() extends T_A[E, T_A[Boolean, T_A[Boolean, Int]]]

val v_a: T_A[Int, T_A[Boolean, T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)