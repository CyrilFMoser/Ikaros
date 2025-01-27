package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Char],T_A[Int, Int])) extends T_A[C, ((Char,Int),T_A[Char, Boolean])]
case class CC_B() extends T_A[T_A[Byte, T_A[Int, Byte]], ((Char,Int),T_A[Char, Boolean])]

val v_a: T_A[T_A[Byte, T_A[Int, Byte]], ((Char,Int),T_A[Char, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}