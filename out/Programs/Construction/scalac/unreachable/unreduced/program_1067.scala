package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Byte],T_A[(Char,Char), Byte]), b: T_A[C, C], c: C) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: CC_A[D]) extends T_A[D, T_A[D, T_A[D, D]]]

val v_a: T_A[Char, T_A[Char, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}