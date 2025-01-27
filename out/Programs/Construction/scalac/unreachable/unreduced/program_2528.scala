package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,T_A[Char, (Int,Byte)])) extends T_A[C, Boolean]
case class CC_B[D](a: CC_A[T_A[D, Boolean]], b: T_A[D, D]) extends T_A[D, Boolean]
case class CC_C() extends T_A[Int, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
  case CC_A((_,_)) => 1 
  case CC_B(_, _) => 2 
  case CC_C() => 3 
}
}