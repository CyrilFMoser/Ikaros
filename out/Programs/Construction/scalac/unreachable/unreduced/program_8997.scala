package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[CC_A[Int], T_A[Boolean, Boolean]], D]
case class CC_C[E](a: CC_A[E], b: (CC_A[Char],(Int,Boolean))) extends T_A[T_A[CC_A[Int], T_A[Boolean, Boolean]], E]

val v_a: T_A[T_A[CC_A[Int], T_A[Boolean, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(), (CC_A(),(_,_))) => 1 
}
}