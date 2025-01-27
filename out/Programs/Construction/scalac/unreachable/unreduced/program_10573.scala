package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: (Byte,CC_A[(Int,Byte)]), b: (T_A[Byte, Int],((Int,Int),Int))) extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_B[E], b: CC_B[T_A[E, E]]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,(_,_))) => 1 
  case CC_C(_, CC_B((_,_), (_,_))) => 2 
}
}