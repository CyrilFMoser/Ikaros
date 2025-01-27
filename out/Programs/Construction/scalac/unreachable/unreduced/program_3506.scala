package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]], c: T_A[T_A[Int]]) extends T_A[(Char,T_A[Char])]
case class CC_B(a: Byte, b: CC_A, c: CC_A) extends T_A[(Char,T_A[Char])]
case class CC_C(a: T_A[T_A[CC_B]], b: Char) extends T_A[(Char,T_A[Char])]

val v_a: T_A[(Char,T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}