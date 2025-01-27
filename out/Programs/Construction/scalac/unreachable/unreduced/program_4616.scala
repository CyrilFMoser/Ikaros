package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: (T_A[Int, Char],Byte)) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C[E]() extends T_A[T_A[T_A[E, E], E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, (_,0)) => 0 
  case CC_A(CC_B(_, _), _, (_,0)) => 1 
  case CC_A(CC_A(_, _, _), _, (_,_)) => 2 
  case CC_A(CC_B(_, _), _, (_,_)) => 3 
  case CC_B(_, _) => 4 
}
}