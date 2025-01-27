package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: CC_A[(Char,Byte)], b: CC_A[Byte], c: CC_A[CC_B[Int]]) extends T_B[T_A[T_B[Char, Boolean]], T_B[T_A[Byte], T_A[Boolean]]]
case class CC_D() extends T_B[T_A[T_B[Char, Boolean]], T_B[T_A[Byte], T_A[Boolean]]]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_B() => 2 
}
}