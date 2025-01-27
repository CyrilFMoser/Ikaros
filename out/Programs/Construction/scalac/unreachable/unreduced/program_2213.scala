package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_A[T_B, T_B]), b: T_A[C, T_A[T_B, C]]) extends T_A[C, T_A[T_B, C]]
case class CC_B[D](a: T_A[D, T_A[T_B, D]], b: T_B, c: (T_A[T_B, T_B],CC_A[T_B])) extends T_A[D, T_A[T_B, D]]

val v_a: T_A[Int, T_A[T_B, Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A((_,_), _)) => 0 
  case CC_A((_,_), CC_B(_, _, (_,_))) => 1 
  case CC_B(_, _, _) => 2 
}
}