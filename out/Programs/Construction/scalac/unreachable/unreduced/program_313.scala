package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_A, (Int,Byte)], c: T_B[T_B[T_A, T_A], Boolean]) extends T_A
case class CC_B[C]() extends T_A
case class CC_C[D]() extends T_A
case class CC_D[E](a: T_B[T_A, T_B[CC_A, T_A]], b: CC_C[E], c: CC_A) extends T_B[T_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _), CC_D(_, _, _), _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}