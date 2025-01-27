package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_B[T_B[Byte, Char], (Boolean,Char)], c: T_B[T_A[(Byte,Char)], (Byte,Byte)]) extends T_A[T_B[(Byte,Int), T_A[Byte]]]
case class CC_B(a: CC_A, b: T_A[T_B[CC_A, (Byte,Char)]], c: T_A[(CC_A,CC_A)]) extends T_A[T_B[(Byte,Int), T_A[Byte]]]
case class CC_C[D](a: (Byte,Byte)) extends T_B[CC_B, D]
case class CC_D(a: Char) extends T_B[CC_B, Int]
case class CC_E[E](a: T_A[E], b: CC_B, c: E) extends T_B[CC_B, E]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_C((0,_)) => 0 
  case CC_C((_,_)) => 1 
  case CC_D(_) => 2 
  case CC_E(_, _, _) => 3 
}
}