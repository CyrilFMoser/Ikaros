package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Int], Boolean]) extends T_A[T_A[Char]]
case class CC_B(a: (T_B[(Char,Char), CC_A],T_A[Char]), b: T_A[T_A[Char]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), CC_A(_)) => 1 
  case CC_B((_,_), CC_B((_,_), CC_B(_, _))) => 2 
}
}
// This is not matched: CC_B((_,_), CC_B((_,_), CC_A(_)))