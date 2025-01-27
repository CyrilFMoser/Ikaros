package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[Char], c: CC_A) extends T_A[Char]
case class CC_C[B](a: CC_A, b: T_A[Char], c: CC_A) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_A(), CC_A()) => 2 
  case CC_C(_, CC_B(_, CC_A(), CC_A()), CC_A()) => 3 
  case CC_C(_, CC_B(_, CC_B(_, _, _), CC_A()), CC_A()) => 4 
  case CC_C(_, CC_B(_, CC_C(_, _, _), CC_A()), CC_A()) => 5 
  case CC_C(_, CC_C(_, CC_A(), _), CC_A()) => 6 
  case CC_C(_, CC_C(_, CC_B(_, _, _), _), CC_A()) => 7 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), CC_A()) => 8 
}
}