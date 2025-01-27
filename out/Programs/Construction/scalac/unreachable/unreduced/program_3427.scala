package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: ((Byte,(Int,Byte)),T_A[Char, Int]), c: T_A[C, C]) extends T_A[C, (T_A[(Byte,Int), Boolean],Int)]
case class CC_B[D](a: Char, b: Boolean) extends T_A[D, (T_A[(Byte,Int), Boolean],Int)]
case class CC_C[E](a: CC_B[E]) extends T_A[E, (T_A[(Byte,Int), Boolean],Int)]

val v_a: T_A[Char, (T_A[(Byte,Int), Boolean],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),_), _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _))