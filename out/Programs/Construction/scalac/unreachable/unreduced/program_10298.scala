package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: (T_A[Int, Boolean],T_A[Byte, Char])) extends T_A[E, T_A[E, E]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_A[G, G], b: Int, c: T_A[G, T_A[G, G]]) extends T_A[G, T_A[G, G]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A(_, _)) => 2 
  case CC_C(_, _, CC_C(_, _, _)) => 3 
}
}
// This is not matched: CC_C(_, _, CC_B())