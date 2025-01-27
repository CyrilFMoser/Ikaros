package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, T_B],T_A[Int, T_B])) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[T_B]) extends T_A[Byte, T_A[Byte, Byte]]
case class CC_C[D](a: T_A[Boolean, T_A[Boolean, Boolean]], b: CC_A[D], c: Int) extends T_A[D, T_A[D, D]]
case class CC_D(a: T_A[Byte, T_A[Byte, Byte]], b: CC_B) extends T_B

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}