package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, Boolean], b: T_A[D, D], c: (T_A[Char, Char],T_A[Byte, Byte])) extends T_A[C, T_A[T_A[Byte, C], C]]
case class CC_B[E]() extends T_A[E, T_A[T_A[Byte, E], E]]

val v_a: T_A[Int, T_A[T_A[Byte, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
}
}