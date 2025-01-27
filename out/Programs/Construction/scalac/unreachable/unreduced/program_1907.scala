package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Char, Byte],Char)) extends T_A[C, T_A[T_A[Byte, Byte], (Byte,Boolean)]]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], Byte], T_A[T_A[Byte, Byte], (Byte,Boolean)]]
case class CC_C[E](a: CC_A[E, E]) extends T_A[E, T_A[T_A[Byte, Byte], (Byte,Boolean)]]

val v_a: T_A[Char, T_A[T_A[Byte, Byte], (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_C(_) => 1 
}
}