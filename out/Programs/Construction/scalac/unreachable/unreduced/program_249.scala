package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Boolean]], b: T_A[T_A[Char]], c: Char) extends T_A[T_B[T_B[Char, Boolean], T_B[Char, Byte]]]
case class CC_B(a: T_B[CC_A, T_B[CC_A, CC_A]]) extends T_A[T_B[T_B[Char, Boolean], T_B[Char, Byte]]]

val v_a: T_A[T_B[T_B[Char, Boolean], T_B[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}