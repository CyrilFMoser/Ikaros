package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G](a: T_A[G, G], b: G, c: T_B[G, G]) extends T_A[G, CC_A[Boolean, T_B[Byte, (Char,Int)]]]
case class CC_C(a: Char, b: CC_B[Char]) extends T_B[CC_B[CC_B[Int]], T_B[Byte, ((Boolean,Char),Boolean)]]

val v_a: T_A[Char, CC_A[Boolean, T_B[Byte, (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}