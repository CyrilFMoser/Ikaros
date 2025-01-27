package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Byte],((Boolean,Boolean),(Char,Byte)))) extends T_A[C, T_A[T_A[C, Boolean], C]]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[D, T_A[T_A[D, Boolean], D]]
case class CC_C[E](a: E, b: (Int,Boolean)) extends T_A[E, T_A[T_A[E, Boolean], E]]

val v_a: T_A[Char, T_A[T_A[Char, Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(CC_A((_,_)), _) => 1 
  case CC_C(_, _) => 2 
}
}