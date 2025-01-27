package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[T_A[Byte, Char]], D]
case class CC_B[E](a: T_B[E], b: (T_A[Char, Boolean],(Char,Byte))) extends T_B[E]
case class CC_C[F]() extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), (_,(_,_))) => 0 
  case CC_B(CC_C(), (_,(_,_))) => 1 
  case CC_C() => 2 
}
}