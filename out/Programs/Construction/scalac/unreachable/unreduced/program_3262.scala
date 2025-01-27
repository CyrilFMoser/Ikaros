package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[T_A[D, D]], b: (Boolean,T_B[Int])) extends T_A[D, T_B[T_A[Byte, Boolean]]]
case class CC_B[E](a: T_A[E, E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: T_B[T_B[G]], b: T_B[G], c: Boolean) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(CC_B(_), CC_B(_), _) => 2 
  case CC_D(CC_C(), CC_B(_), _) => 3 
  case CC_D(CC_D(CC_B(_), _, _), CC_B(_), _) => 4 
  case CC_D(CC_D(CC_C(), _, _), CC_B(_), _) => 5 
  case CC_D(CC_D(CC_D(_, _, _), _, _), CC_B(_), _) => 6 
  case CC_D(CC_B(_), CC_C(), _) => 7 
  case CC_D(CC_C(), CC_C(), _) => 8 
  case CC_D(CC_D(CC_B(_), _, _), CC_C(), _) => 9 
  case CC_D(CC_D(CC_C(), _, _), CC_C(), _) => 10 
  case CC_D(CC_D(CC_D(_, _, _), _, _), CC_C(), _) => 11 
  case CC_D(CC_B(_), CC_D(CC_B(_), _, _), _) => 12 
  case CC_D(CC_C(), CC_D(CC_B(_), _, _), _) => 13 
  case CC_D(CC_D(CC_B(_), _, _), CC_D(CC_B(_), _, _), _) => 14 
  case CC_D(CC_D(CC_C(), _, _), CC_D(CC_B(_), _, _), _) => 15 
  case CC_D(CC_D(CC_D(_, _, _), _, _), CC_D(CC_B(_), _, _), _) => 16 
  case CC_D(CC_B(_), CC_D(CC_C(), _, _), _) => 17 
  case CC_D(CC_C(), CC_D(CC_C(), _, _), _) => 18 
  case CC_D(CC_D(CC_B(_), _, _), CC_D(CC_C(), _, _), _) => 19 
  case CC_D(CC_D(CC_C(), _, _), CC_D(CC_C(), _, _), _) => 20 
  case CC_D(CC_D(CC_D(_, _, _), _, _), CC_D(CC_C(), _, _), _) => 21 
  case CC_D(CC_B(_), CC_D(CC_D(_, _, _), _, _), _) => 22 
  case CC_D(CC_C(), CC_D(CC_D(_, _, _), _, _), _) => 23 
  case CC_D(CC_D(CC_B(_), _, _), CC_D(CC_D(_, _, _), _, _), _) => 24 
  case CC_D(CC_D(CC_D(_, _, _), _, _), CC_D(CC_D(_, _, _), _, _), _) => 25 
}
}
// This is not matched: CC_D(CC_D(CC_C(), _, _), CC_D(CC_D(_, _, _), _, _), _)