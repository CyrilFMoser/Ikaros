package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E]) extends T_A[E, (T_B[Int, (Byte,Int)],Byte)]
case class CC_B[F](a: Int) extends T_A[F, (T_B[Int, (Byte,Int)],Byte)]

val v_a: T_A[Byte, (T_B[Int, (Byte,Int)],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}