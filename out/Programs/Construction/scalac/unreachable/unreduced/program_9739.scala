package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Byte],T_B[(Char,Char)]), b: Char, c: T_A[D, D]) extends T_A[D, Char]
case class CC_B[E](a: Byte, b: T_A[E, Char]) extends T_A[E, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, CC_A((_,_), _, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}