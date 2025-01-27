package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: (T_A[Char, Int],CC_A[Byte])) extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C[E](a: CC_B[E], b: (CC_B[Int],T_A[Boolean, Char])) extends T_A[T_A[E, T_A[E, E]], E]

val v_a: T_A[T_A[Boolean, T_A[Boolean, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, (_,CC_A(_))) => 1 
}
}
// This is not matched: CC_C(_, (CC_B(_, _, _),_))