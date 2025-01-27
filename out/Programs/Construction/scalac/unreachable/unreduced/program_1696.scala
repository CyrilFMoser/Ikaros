package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[C, T_A[T_A[Boolean, Int], T_A[Char, (Int,Byte)]]]
case class CC_B[D](a: Char) extends T_A[D, T_A[T_A[Boolean, Int], T_A[Char, (Int,Byte)]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Boolean, Int], T_A[Char, (Int,Byte)]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Int], T_A[Char, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}