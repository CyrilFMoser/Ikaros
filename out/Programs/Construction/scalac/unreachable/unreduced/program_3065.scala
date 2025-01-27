package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Int, (Char,Int)], T_A[Boolean, Int]]]
case class CC_B[D](a: CC_A[D], b: T_A[D, CC_A[D]], c: T_A[D, D]) extends T_A[D, T_A[T_A[Int, (Char,Int)], T_A[Boolean, Int]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Int, (Char,Int)], T_A[Boolean, Int]]]

val v_a: T_A[Char, T_A[T_A[Int, (Char,Int)], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}