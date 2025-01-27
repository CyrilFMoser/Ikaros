package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[C, T_A[(Char,Char), Int]]
case class CC_B[D, E]() extends T_A[D, T_A[(Char,Char), Int]]
case class CC_C(a: (CC_A[Char],T_A[Boolean, Int]), b: T_A[Boolean, CC_A[(Boolean,Int)]]) extends T_A[CC_B[T_A[Boolean, Char], Boolean], T_A[(Char,Char), Int]]

val v_a: T_A[Byte, T_A[(Char,Char), Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}