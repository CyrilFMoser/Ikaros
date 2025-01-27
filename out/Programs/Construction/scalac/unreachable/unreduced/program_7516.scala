package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: T_B) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D]() extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C(a: T_A[Int, Char], b: (CC_A[(Char,Int)],CC_A[(Char,Int)]), c: Char) extends T_B
case class CC_D(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_A(_, _),CC_A(_, _)), _) => 0 
  case CC_D(_) => 1 
}
}