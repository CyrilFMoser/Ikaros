package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Char]]
case class CC_B[C](a: T_A[C]) extends T_B[C]
case class CC_C[D](a: T_B[D], b: T_B[T_B[D]]) extends T_B[D]
case class CC_D[E](a: T_A[T_B[Char]], b: CC_A) extends T_B[E]

val v_a: T_B[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(_), CC_B(_)) => 1 
  case CC_C(CC_B(_), CC_D(_, _)) => 2 
  case CC_C(CC_C(_, _), CC_B(_)) => 3 
  case CC_C(CC_C(_, _), CC_C(_, _)) => 4 
  case CC_C(CC_C(_, _), CC_D(_, _)) => 5 
  case CC_C(CC_D(_, _), CC_B(_)) => 6 
  case CC_C(CC_D(_, _), CC_C(_, _)) => 7 
  case CC_C(CC_D(_, _), CC_D(_, _)) => 8 
  case CC_D(_, _) => 9 
}
}
// This is not matched: CC_C(CC_B(_), CC_C(_, _))