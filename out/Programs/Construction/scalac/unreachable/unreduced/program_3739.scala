package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Int, b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: Boolean, b: T_A[T_A[E, E], E], c: (T_A[Char, Byte],CC_A[Byte])) extends T_A[T_A[E, E], E]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_B(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_B(_, CC_A(_, CC_C(_, _, _))) => 2 
  case CC_B(_, CC_B(_, _)) => 3 
  case CC_B(_, CC_C(_, CC_A(_, _), (_,_))) => 4 
  case CC_B(_, CC_C(_, CC_B(_, _), (_,_))) => 5 
  case CC_B(_, CC_C(_, CC_C(_, _, _), (_,_))) => 6 
}
}