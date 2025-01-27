package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, (Byte,T_A[Int, Byte])]
case class CC_B[D](a: D) extends T_A[D, (Byte,T_A[Int, Byte])]
case class CC_C[E](a: Boolean, b: T_A[T_A[E, E], E], c: Char) extends T_A[E, (Byte,T_A[Int, Byte])]

val v_a: T_A[Byte, (Byte,T_A[Int, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _, _) => 3 
}
}