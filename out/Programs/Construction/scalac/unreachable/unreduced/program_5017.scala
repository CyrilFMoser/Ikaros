package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[C, Byte]
case class CC_B[D](a: (T_A[Int, Boolean],T_A[(Char,Boolean), Byte]), b: D) extends T_A[D, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}