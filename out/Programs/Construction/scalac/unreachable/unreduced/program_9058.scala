package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[C, Boolean], C]]
case class CC_B[D]() extends T_A[D, T_A[T_A[D, Boolean], D]]
case class CC_C[E](a: E, b: T_A[E, E], c: (CC_A[Int],(Char,Boolean))) extends T_A[E, T_A[T_A[E, Boolean], E]]

val v_a: T_A[Int, T_A[T_A[Int, Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, (CC_A(_),(_,_))) => 1 
}
}
// This is not matched: CC_A(_)