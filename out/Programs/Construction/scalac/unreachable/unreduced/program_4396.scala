package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[C, T_A[(Byte,Char), C]]
case class CC_B[D](a: D, b: (CC_A[Int],T_A[(Byte,Char), Byte]), c: (CC_A[Boolean],T_A[Char, Byte])) extends T_A[D, T_A[(Byte,Char), D]]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, T_A[(Byte,Char), E]]

val v_a: T_A[Int, T_A[(Byte,Char), Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}