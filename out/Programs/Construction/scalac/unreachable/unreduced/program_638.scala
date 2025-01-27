package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: (T_B[Byte],T_B[Byte])) extends T_A[D]
case class CC_C[E](a: T_B[T_A[E]], b: Int) extends T_A[E]
case class CC_D(a: T_A[(Int,Int)], b: T_A[CC_C[Char]], c: T_A[T_B[Char]]) extends T_B[Char]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), CC_A(), CC_A()) => 0 
  case CC_D(CC_B(_), CC_A(), CC_A()) => 1 
  case CC_D(CC_C(_, _), CC_A(), CC_A()) => 2 
  case CC_D(CC_A(), CC_A(), CC_B(_)) => 3 
  case CC_D(CC_B(_), CC_A(), CC_B(_)) => 4 
  case CC_D(CC_A(), CC_A(), CC_C(_, _)) => 5 
  case CC_D(CC_B(_), CC_A(), CC_C(_, _)) => 6 
  case CC_D(CC_C(_, _), CC_A(), CC_C(_, _)) => 7 
  case CC_D(CC_A(), CC_B(_), CC_A()) => 8 
  case CC_D(CC_B(_), CC_B(_), CC_A()) => 9 
  case CC_D(CC_C(_, _), CC_B(_), CC_A()) => 10 
  case CC_D(CC_A(), CC_B(_), CC_B(_)) => 11 
  case CC_D(CC_B(_), CC_B(_), CC_B(_)) => 12 
  case CC_D(CC_C(_, _), CC_B(_), CC_B(_)) => 13 
  case CC_D(CC_A(), CC_B(_), CC_C(_, _)) => 14 
  case CC_D(CC_B(_), CC_B(_), CC_C(_, _)) => 15 
  case CC_D(CC_C(_, _), CC_B(_), CC_C(_, _)) => 16 
  case CC_D(CC_A(), CC_C(_, _), CC_A()) => 17 
  case CC_D(CC_B(_), CC_C(_, _), CC_A()) => 18 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_A()) => 19 
  case CC_D(CC_A(), CC_C(_, _), CC_B(_)) => 20 
  case CC_D(CC_B(_), CC_C(_, _), CC_B(_)) => 21 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_B(_)) => 22 
  case CC_D(CC_A(), CC_C(_, _), CC_C(_, _)) => 23 
  case CC_D(CC_B(_), CC_C(_, _), CC_C(_, _)) => 24 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_C(_, _)) => 25 
}
}
// This is not matched: CC_D(CC_C(_, _), CC_A(), CC_B(_))