package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: ((Byte,Boolean),Int), b: T_A[Int]) extends T_A[T_B[Byte, Byte]]

val v_a: T_A[T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,12), _) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard Byte (T_A Char))