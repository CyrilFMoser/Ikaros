package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,T_A[Char, Int]), b: C) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
  case CC_A((_,_), _) => 1 
  case CC_B() => 2 
}
}