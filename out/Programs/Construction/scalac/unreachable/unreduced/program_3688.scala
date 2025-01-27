package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((T_A,T_A),T_A), b: T_B[T_B[Int, Byte], T_A]) extends T_A
case class CC_B[C](a: T_A, b: Char) extends T_B[C, T_B[C, C]]
case class CC_C[D](a: CC_B[D], b: D, c: T_B[D, D]) extends T_B[Byte, T_B[Byte, Byte]]
case class CC_D(a: Char, b: T_A) extends T_B[Byte, T_B[Byte, Byte]]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, CC_A((_,_), _)) => 1 
}
}
// This is not matched: CC_C(_, _, _)