package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[(Int,Boolean), Char], T_A[Byte, Boolean]], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[T_A[T_A[(Int,Boolean), Char], T_A[Byte, Boolean]], D]
case class CC_C[E](a: T_A[E, T_A[E, E]], b: T_A[E, E], c: CC_A[E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[T_A[T_A[(Int,Boolean), Char], T_A[Byte, Boolean]], T_A[T_A[T_A[(Int,Boolean), Char], T_A[Byte, Boolean]], T_A[T_A[(Int,Boolean), Char], T_A[Byte, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_C(_, CC_A(), CC_A()) => 2 
  case CC_C(_, CC_B(CC_A(), CC_A()), CC_A()) => 3 
  case CC_C(_, CC_B(CC_B(_, _), CC_A()), CC_A()) => 4 
}
}