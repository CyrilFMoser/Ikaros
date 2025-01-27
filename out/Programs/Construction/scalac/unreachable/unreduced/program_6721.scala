package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: (Byte,T_A[Int])) extends T_A[E]
case class CC_C(a: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_D(a: CC_A[T_B[CC_C, CC_C]], b: T_A[CC_C]) extends T_B[T_A[CC_B[CC_C]], (CC_C,Boolean)]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, (_,_)))