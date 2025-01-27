package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Byte,Byte), C], b: T_A[(Byte,Byte), C]) extends T_A[(Byte,Byte), C]
case class CC_B[D](a: Byte) extends T_A[(Byte,Byte), D]
case class CC_C[E](a: Char, b: E, c: T_A[E, E]) extends T_A[(Byte,Byte), E]

val v_a: T_A[(Byte,Byte), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_A(CC_C(_, _, _), _) => 2 
  case CC_B(_) => 3 
  case CC_C(_, _, _) => 4 
}
}