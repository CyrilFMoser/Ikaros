package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[Char]
case class CC_B(a: (T_A[CC_A],T_A[Char]), b: T_A[CC_A], c: T_A[Char]) extends T_A[Char]
case class CC_C[C](a: T_B[T_A[Char]], b: CC_B) extends T_B[T_A[Char]]
case class CC_D(a: CC_B, b: T_B[CC_A], c: Byte) extends T_B[T_A[Char]]

val v_a: T_B[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), _) => 0 
  case CC_C(CC_D(_, _, _), _) => 1 
  case CC_D(CC_B((_,_), _, CC_A(_)), _, _) => 2 
  case CC_D(CC_B((_,_), _, CC_B(_, _, _)), _, _) => 3 
}
}