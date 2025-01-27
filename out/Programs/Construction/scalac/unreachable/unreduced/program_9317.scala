package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Byte],Boolean), b: T_A[C, T_A[C, (Char,Int)]]) extends T_A[T_A[T_A[Boolean, (Char,Int)], T_A[Char, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Boolean, (Char,Int)], T_A[Char, Boolean]], D]

val v_a: T_A[T_A[T_A[Boolean, (Char,Int)], T_A[Char, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
}
}