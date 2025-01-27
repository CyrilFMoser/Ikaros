package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[T_A[Byte, Byte], T_A[Int, (Char,Boolean)]]]
case class CC_B() extends T_A[CC_A[CC_A[Int]], T_A[T_A[Byte, Byte], T_A[Int, (Char,Boolean)]]]
case class CC_C[D, E](a: CC_B, b: ((CC_B,CC_B),T_A[Byte, Byte]), c: Char) extends T_A[Byte, D]

val v_a: T_A[CC_A[CC_A[Int]], T_A[T_A[Byte, Byte], T_A[Int, (Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_B() => 1 
}
}