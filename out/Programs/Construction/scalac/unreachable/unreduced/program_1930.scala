package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[T_A[Int, (Int,Int)], T_A[Int, Int]]]
case class CC_B[D](a: D, b: D, c: CC_A[D]) extends T_A[D, T_A[T_A[Int, (Int,Int)], T_A[Int, Int]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Int, (Int,Int)], T_A[Int, Int]]]

val v_a: T_A[Int, T_A[T_A[Int, (Int,Int)], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}