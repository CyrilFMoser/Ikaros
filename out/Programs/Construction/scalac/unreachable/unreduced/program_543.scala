package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: C) extends T_A[T_A[Boolean, (Byte,Int)], C]
case class CC_B[D](a: (CC_A[Int],CC_A[Boolean])) extends T_A[D, T_A[T_A[Char, Byte], Char]]
case class CC_C[E]() extends T_A[T_A[Boolean, (Byte,Int)], E]

val v_a: T_A[T_A[Boolean, (Byte,Int)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}