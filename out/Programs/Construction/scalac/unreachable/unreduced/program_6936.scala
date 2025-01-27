package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Char, (Boolean,Boolean)],T_A[Boolean, Char])) extends T_A[T_A[D, D], D]
case class CC_B[E](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_C(a: T_A[CC_A[Boolean], T_A[(Boolean,Int), (Int,Boolean)]]) extends T_B[T_B[Char]]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}