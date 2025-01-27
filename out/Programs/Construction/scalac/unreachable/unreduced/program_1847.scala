package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_B[Byte, Byte]]) extends T_A[(Byte,T_B[Int, Byte])]
case class CC_B(a: Byte, b: T_A[CC_A], c: T_B[T_B[CC_A, Int], T_A[CC_A]]) extends T_A[(Byte,T_B[Int, Byte])]
case class CC_C(a: (T_A[CC_B],(CC_A,CC_A)), b: CC_A) extends T_A[(Byte,T_B[Int, Byte])]
case class CC_D[D, E](a: E, b: CC_B, c: T_B[D, E]) extends T_B[D, E]

val v_a: T_A[(Byte,T_B[Int, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _)) => 0 
  case CC_B(_, _, CC_D(_, _, _)) => 1 
  case CC_C((_,_), CC_A(_)) => 2 
}
}