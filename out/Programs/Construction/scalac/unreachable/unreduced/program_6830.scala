package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]]) extends T_A[T_A[T_B[Char]]]
case class CC_B(a: T_B[T_B[CC_A]], b: T_B[CC_A]) extends T_A[T_A[T_B[Char]]]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: T_B[D], b: D, c: Int) extends T_B[D]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_C(), CC_C()) => 1 
  case CC_B(CC_D(_, _, _), CC_C()) => 2 
  case CC_B(CC_C(), CC_D(CC_C(), CC_A(_), _)) => 3 
  case CC_B(CC_D(_, _, _), CC_D(CC_C(), CC_A(_), _)) => 4 
  case CC_B(CC_C(), CC_D(CC_D(_, _, _), CC_A(_), _)) => 5 
  case CC_B(CC_D(_, _, _), CC_D(CC_D(_, _, _), CC_A(_), _)) => 6 
}
}