package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,(Char,Int)), b: T_A[C, C]) extends T_A[T_A[Char, Char], C]

val v_a: T_A[T_A[Char, Char], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,12)), _) => 0 
}
}
// This is not matched: (CC_A Char Boolean (CC_C Char (T_A Char)) (T_A Char))