package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_B[Byte], T_B[Char]]]
case class CC_B(a: T_A[T_B[(Char,Byte)], CC_A[Byte]]) extends T_B[(T_B[Int],T_B[Byte])]
case class CC_C(a: Int) extends T_B[(T_B[Int],T_B[Byte])]
case class CC_D[E](a: E, b: Int) extends T_B[E]

val v_a: T_B[(T_B[Int],T_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
  case CC_D(_, 12) => 2 
  case CC_D(_, _) => 3 
}
}