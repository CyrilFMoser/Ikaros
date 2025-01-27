package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: (T_A[Char],T_B[Boolean]), c: C) extends T_A[C]
case class CC_B[D](a: D) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: T_A[T_A[Char]]) extends T_B[T_A[((Byte,Int),Char)]]

val v_a: T_A[T_B[T_A[((Byte,Int),Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_D(CC_A(_, _, _))) => 1 
  case CC_B(CC_D(CC_B(_))) => 2 
  case CC_B(CC_D(CC_C())) => 3 
  case CC_C() => 4 
}
}