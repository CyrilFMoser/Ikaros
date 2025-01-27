package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[(Boolean,Char)]], b: T_A[Int], c: T_B[T_A[Char]]) extends T_A[(T_A[Int],T_A[Boolean])]
case class CC_B(a: Char, b: Byte, c: Char) extends T_A[(T_A[Int],T_A[Boolean])]
case class CC_C(a: T_A[CC_A], b: Boolean, c: Char) extends T_A[(T_A[Int],T_A[Boolean])]
case class CC_D[C](a: T_B[(Char,Char)], b: C, c: C) extends T_B[C]
case class CC_E[D](a: T_B[D], b: D) extends T_B[D]
case class CC_F() extends T_B[CC_B]

val v_a: T_A[(T_A[Int],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(_, _, _)) => 0 
  case CC_A(_, _, CC_E(CC_D(_, _, _), _)) => 1 
  case CC_A(_, _, CC_E(CC_E(_, _), _)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_, _, _) => 4 
}
}