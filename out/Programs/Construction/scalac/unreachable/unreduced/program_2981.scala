package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Byte]], b: T_A[C, C]) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Boolean]], C]
case class CC_B[D](a: (Byte,(Byte,Byte))) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Boolean]], D]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Char, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,(_,_))) => 1 
}
}