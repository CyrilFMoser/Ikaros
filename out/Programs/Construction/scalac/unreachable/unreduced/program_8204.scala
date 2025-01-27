package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, (Byte,Int)],T_A[Int, Char])) extends T_A[T_A[C, C], C]
case class CC_B[D, E](a: T_A[T_A[E, E], E], b: CC_A[D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, CC_A(_)) => 1 
}
}