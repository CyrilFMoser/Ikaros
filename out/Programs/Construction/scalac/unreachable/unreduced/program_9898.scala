package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Boolean, C], C], b: C) extends T_A[C, (Char,T_A[Int, Byte])]
case class CC_B[D](a: Char) extends T_A[D, (Char,T_A[Int, Byte])]

val v_a: T_A[Char, (Char,T_A[Int, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}