package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[D], c: T_A[(Boolean,(Byte,Byte))]) extends T_A[D]
case class CC_C(a: T_B[T_A[Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_D(a: Char, b: T_A[CC_B[CC_C]], c: CC_B[CC_B[CC_C]]) extends T_B[T_A[CC_A[(Byte,Char)]]]
case class CC_E(a: T_A[T_A[CC_D]], b: CC_A[T_A[CC_D]]) extends T_B[T_A[CC_A[(Byte,Char)]]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(), CC_B(CC_A(), _, _)) => 0 
  case CC_D(_, CC_B(CC_A(), _, CC_A()), CC_B(CC_A(), _, _)) => 1 
  case CC_D(_, CC_B(CC_A(), _, CC_B(_, _, _)), CC_B(CC_A(), _, _)) => 2 
  case CC_D(_, CC_B(CC_B(_, _, _), _, CC_A()), CC_B(CC_A(), _, _)) => 3 
  case CC_D(_, CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), CC_B(CC_A(), _, _)) => 4 
  case CC_D(_, CC_A(), CC_B(CC_B(_, _, _), _, _)) => 5 
  case CC_D(_, CC_B(CC_A(), _, CC_A()), CC_B(CC_B(_, _, _), _, _)) => 6 
  case CC_D(_, CC_B(CC_A(), _, CC_B(_, _, _)), CC_B(CC_B(_, _, _), _, _)) => 7 
  case CC_D(_, CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), CC_B(CC_B(_, _, _), _, _)) => 8 
}
}
// This is not matched: CC_D(_, CC_B(CC_B(_, _, _), _, CC_A()), CC_B(CC_B(_, _, _), _, _))