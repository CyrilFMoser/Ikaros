package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[Char, (Boolean,Byte)], C]
case class CC_B[E](a: T_A[E, E]) extends T_A[T_A[Char, (Boolean,Byte)], E]

val v_a: T_A[T_A[Char, (Boolean,Byte)], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}